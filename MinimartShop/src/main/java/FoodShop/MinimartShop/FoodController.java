package FoodShop.MinimartShop;

import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration

public class FoodController {
	FoodFactory foodFactory = new FoodFactory();
	CartSingleton cart = CartSingleton.getinstance();
	static String number;
	
	List<Food> myfood = new ArrayList<Food>();
 
	@RequestMapping("/minimart")
	public List<Food> All(){
		return myfood;
		}
	
	@RequestMapping(value = "/create-{food_id}-{food_name}-{food_type}-{food_price}", method = RequestMethod.POST)
    public ResponseEntity<Food> create(@PathVariable("food_id") int food_id, @PathVariable("food_name") String food_name, @PathVariable("food_type") String food_type, @PathVariable("food_price") double food_price) {
        myfood.add(FoodFactory.getFood(food_id, food_name, food_type, food_price));
        int count = cart.getCount();
        cart.setCount(count+1);
        number = Integer.toString(cart.getCount());
        fileWriter();
        return new ResponseEntity<Food>(FoodFactory.getFood(food_id, food_name, food_type, food_price), HttpStatus.OK);
    }



	 @RequestMapping(value = "/delete-{index}", method = RequestMethod.DELETE)
	    public ResponseEntity<String> delete(@PathVariable int index) {
	        myfood.remove(index);
	        return new ResponseEntity<String>("Removed", HttpStatus.OK);
	    }
	 
	 public static void fileWriter() {
			try {
				FileWriter w = new FileWriter("list.txt");
				w.write(number);
				w.close();
			}catch (IOException e){
				e.printStackTrace();
			}
		}
		
		public static void fileReader() {
			try {
				FileReader r = new FileReader("list.txt");
				int data;
				while((data = r.read()) != -1) {
					System.out.printf("%c\n", data);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


}



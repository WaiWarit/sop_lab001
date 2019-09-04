package FoodShop.MinimartShop;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration

public class FoodController {
	List<Food> myfood = new ArrayList<Food>(Arrays.asList(
			new DrinkFood(1, "Kato", "1/5/2019", "12/12/2019", 15),
			new DryFood(2, "Lay", "2/10/2018", "15/12/2019", 20),
			new FreshFood(3, "Pork", "1/10/2019", "18/12/2019", 72),
			new FruitFood(4, "Melon", "1/5/2019", "20/12/2019", 10)
			));
 

@RequestMapping("/minimart")
	public List<Food> All(){
		return myfood;
		}	
}



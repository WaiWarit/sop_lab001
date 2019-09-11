package FoodShop.MinimartShop;

public class DryFood implements Food{
	
	private int food_id;
	private String food_name;
	private String food_type;
	private double food_price;
	
	public DryFood(int food_id, String food_name, String food_type, double food_price) {
		this.food_id = food_id;
		this.food_name = food_name;
		this.food_type = food_type;
		this.food_price = food_price;
		
	}
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	public int getFood_id() {
		return food_id;
	}
	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}
	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	public String getFood_type() {
		return food_type;
	}
	public void setFood_type(String food_type) {
		this.food_type = food_type;
	}
	public double getFood_price() {
		return food_price;
	}
	public void setFood_price(double food_price) {
		this.food_price = food_price;
	}


}

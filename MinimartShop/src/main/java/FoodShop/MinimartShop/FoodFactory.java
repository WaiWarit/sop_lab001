package FoodShop.MinimartShop;

public class FoodFactory {
	
	public static Food getFood(int food_id, String food_name, String food_type, double food_price){
		if (food_type == null) {
			return null;
		}
		else if (food_type.equalsIgnoreCase("DRINKFOOD")) {
			return new DrinkFood(food_id, food_name, food_type, food_price);
		}
		else if (food_type.equalsIgnoreCase("DRYFOOD")) {
			return new DrinkFood(food_id, food_name, food_type, food_price);
		}
		else if (food_type.equalsIgnoreCase("FRESHFOOD")) {
			return new DrinkFood(food_id, food_name, food_type, food_price);
		}
		else if (food_type.equalsIgnoreCase("FRUITFOOD")) {
			return new DrinkFood(food_id, food_name, food_type, food_price);
		}
		return null;
	}


}

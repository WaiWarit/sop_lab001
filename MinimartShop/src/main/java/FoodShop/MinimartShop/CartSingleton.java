package FoodShop.MinimartShop;

public class CartSingleton {
	private static CartSingleton instance;
	private int count;
	
	private CartSingleton() {
		
	}
	
	public static CartSingleton getinstance() {
		if (instance == null) {
			instance = new CartSingleton();
		}
		return instance;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}

package FoodShop.MinimartShop;

abstract class Food {
	
	private int food_id;
	private String food_name;
	private String mfd_date;
	private String exp_date;
	private float price;

	
	public Food(int food_id, String food_name,String mfd_date,String exp_date, float price){
		this.food_id = food_id;
		this.food_name = food_name;
		this.mfd_date = mfd_date;
		this.exp_date = exp_date;
		this.price = price;
	}
	

	public int getFood_id() {
		return food_id;
	}

	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}

	public String getMfd_date() {
		return mfd_date;
	}

	public void setMfd_date(String mfd_date) {
		this.mfd_date = mfd_date;
	}

	public String getExp_date() {
		return exp_date;
	}

	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}


	public String getFood_name() {
		return food_name;
	}


	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

}

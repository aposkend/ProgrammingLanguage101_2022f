public class Dish {
	
	private int price;
	private int cost;
	private int dishID;
	private String dishName = new String("");

	public Dish(String dishName, int dishID, int price, int cost) {
		this.dishName = dishName;
		this.dishID = dishID;
		this.price = price;
		this.cost = cost;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getCost() {
		return cost;
	}
	
	public int getDishID() {
		return dishID;
	}
	
	public String getDishName() {
		return dishName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
}
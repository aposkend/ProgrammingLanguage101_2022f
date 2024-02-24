import java.util.HashMap;

public class Order {

	private int orderID;
	private String orderName = new String("");
	private HashMap<Dish, Integer> Dishes = new HashMap<Dish, Integer>();
	private int type = 0;
	
	public Order(int orderID, String orderName) {
		this.orderID = orderID;
	}
	
	public void addDish(Dish dish, int count) {
		Dishes.put(dish, count);
	}

	public String getOrder() {
		String orderInfo = "";
		for(Dish dish : Dishes.keySet()) {
			orderInfo += (dish.getDishName() + " " + Dishes.get(dish) + "\n");
		}
		return "orderID " + this.orderID + "\n" + orderInfo;
	}
	
	public int getOrderID() {
		return orderID;
	}
	
	public int getType() {
		return type;
	}
}

import java.util.ArrayList;

public class Menu {

	private ArrayList<Dish> Dishes = new ArrayList<Dish>();
	
	public Menu() {
		
	}
	
	public void addMenu(Dish dish) {
		Dishes.add(dish);
	}
	
	public void removeMennu(Dish dish) {
		Dishes.remove(dish);
	}
	
	public ArrayList<Dish> getDishes() {
		return Dishes;
	}
	
	public void printMenu() {
		for(Dish dish : Dishes) {
			System.out.println(dish.getDishID() + " " + dish.getDishName() + " " + dish.getPrice()); 
		}
	}
}

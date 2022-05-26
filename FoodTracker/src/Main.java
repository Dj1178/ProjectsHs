
public class Main {

	public static void main(String[] args) {
		FoodItem foodOne = new FoodItem(700, "sandwich", "mixed", true);
		FoodItem foodTwo = new FoodItem(1300, "pierogi", "grains", false);
		FoodItem foodThree = new FoodItem(900, "kotlety", "protein", true);
		FoodItem foodFour = new FoodItem(1100, "krokiety", "mixed", true);
		Tracker tracker= new Tracker();

		tracker.addFood(foodOne);
		tracker.addFood(foodTwo);
		tracker.addFood(foodThree);
		tracker.addFood(foodFour);
		System.out.println(tracker.trackerMessage());
		tracker.newDay();
		System.out.println(tracker.trackerMessage());
	}

}

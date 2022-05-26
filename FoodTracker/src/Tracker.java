
public class Tracker {
	private int totalCalories;
	
	//Constructor
	public Tracker() {
		totalCalories=0;
	}
	
	//Add Calories
	public void addFood(FoodItem f) {
		totalCalories += f.getCals();
	}
	
	public void newDay() {
		totalCalories=0;
	}
	
	//Accessor Methods
	public String trackerMessage() {
		return "Your total calories for the day is "+totalCalories;
	}
	
	public String healthyForMe(FoodItem f) {
		if(f.isFoodHealthy()) {
			return "The food you have entered is healthy!";
		}else {
			return "the food you have entered is not healthy!";
		}
	}
}

public class FoodItem {
	private int calories;
	private String name;
	private String foodGroup;
	private boolean isHealthy;
	
	//Default Constructor
	public FoodItem(String n) {
		name=n;
	}
	//Overloaded Constructor
	public FoodItem(int c, String n, String fg, boolean ih) {
		calories=c;
		name=n;
		foodGroup=fg;
		isHealthy=ih;
	}
	
	//accessor methods
	public int getCals() {
		return calories;
	}
	public String getName() {
		return name;
	}
	public String getFoodGroup() {
		return foodGroup;
	}
	public boolean isFoodHealthy() {
		return isHealthy;
	}
	
	
}
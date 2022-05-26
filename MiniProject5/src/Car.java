
public class Car {
	private String name;
	private int year;
	private String sound;
	private int miles;
	private boolean isGoodCondition;
	
	public Car() {
		name= "Ford";
		year= 2000;
		sound= "clunk clunk clunk";
		miles= 200000;
		isGoodCondition=false;
	}
	
	public Car(String theName, int theYear, String theSound, int theMiles, boolean condition) {
		name= theName;
		year= theYear;
		sound= theSound;
		miles= theMiles;
		isGoodCondition= condition;
	}
	public void addMiles(int m) {
		miles += m;
	}
	public void repair() {
		isGoodCondition= true;
		sound= "VROOM";
	}
	public String getName(){
		return name;
	}
	public int getYear() {
		return year;
	}
	public String getSound() {
		return sound;
	}
	public int getMiles() {
		return miles;
	}
	public boolean getCondition() {
		return isGoodCondition;
	}
}


public class Amphibian extends Animal{
	private double waterTemp;
	private String name;
	
	public Amphibian(boolean x, String y, double w, String n) {
		super(x, y, "semiaquatic");
		waterTemp=w;
		name=n;
	}
	public void talk() {
		System.out.println("BLOOP");
	}
	
	public double getWaterTemp() {
		return waterTemp;
	}
}
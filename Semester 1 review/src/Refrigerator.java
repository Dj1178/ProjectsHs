
public class Refrigerator {
	private boolean hasPower;
	private double temp;
	private boolean hasFood;
	private String color;
	private String name;
	private int items;
	
	public Refrigerator() {
		hasPower=true;
		temp=40;
		hasFood=true;
		color="silver";
		name="Fortnite Refrigerator XD";
		items=999;
	}
	public Refrigerator(boolean p, double t, boolean f, String c, String n, int i) {
		hasPower=p;
		temp=t;
		hasFood=f;
		color=c;
		name=n;
		items=i;
	}
	public void pullPlug() {
		hasPower=false;
	}
	public void plugIn() {
		hasPower=true;
	}
	public void paint(String col) {
		color = col;
	}
	public void adjustTemp(int t) {
		temp=t;
	}
	public void addFood(int f) {
		items+=f;
	}
	public String getColor() {
		return color;
	}
	
}

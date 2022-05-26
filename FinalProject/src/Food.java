public class Food {
	private String name;
	private int calories;
	private double proteins;
	private double sugars;
	
	public Food(String n, int c, double p, double s) {
		name=n;
		calories=c;
		proteins=p;
		sugars=s;
	}
	public String getName() {
		return name;
	}
	public int getCal() {
		return calories;
	}
	public double getPro() {
		return proteins;
	}
	public double getSug() {
		return sugars;
	}
}
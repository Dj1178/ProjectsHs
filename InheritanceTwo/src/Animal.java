
public class Animal {
	private boolean isAlive;
	private String color;
	private String habitat;
	
	public Animal() {
		isAlive=true;
		color="brown";
		habitat="Plains";
	}
	
	public Animal(boolean x, String y, String z) {
		isAlive=x;
		color=y;
		habitat=z;
	}
	
	public void talk() {
		System.out.println("Hi");
	}
	public String getColor() {
		return color;
	}
}

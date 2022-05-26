package inheritance;

public class Human {
	private String name;
	private String gender;
	private boolean isAlive;
	private double height;
	private int age;
	
	public Human() {
		name="";
		gender="";
		isAlive=true;
		height=67.0;
		age=17;
	}
	public Human(String n, String g, boolean ia, double h, int a) {
		name =n;
		gender=g;
		isAlive=ia;
		height=h;
		age=a;
	}
	public void talk() {
		System.out.println("HELLO, I AM A HUMAN");
	}
	public int getAge() {
		return age;
	}
}

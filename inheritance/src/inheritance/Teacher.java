package inheritance;

public class Teacher extends Human{
	private String subject;
	private int gradeTaught;
	public Teacher(String n, String g, boolean ia, double h, int a, String s, int gt) {
		super(n, g, ia, h, a);
		subject=s;
		gradeTaught=gt;
	}
	public void talk() {
		System.out.println("HELLO, I AM A TEACHER");
	}
	public int getAge() {
		return super.getAge();
	}
}

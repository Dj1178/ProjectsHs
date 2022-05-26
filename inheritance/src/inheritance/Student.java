package inheritance;

public class Student extends Human{
	private int gradeLevel;
	private double gpa;
	
	public Student(String n, String g, boolean ia, double h, int a, int gl, double gp) {
		super(n, g, ia, h, a);
		gradeLevel=gl;
		gpa=gp;
	}
	public void talk() {
		System.out.println("HELLO, I AM A STUDENT");
	}
	public int getAge() {
		return super.getAge();
	}
}

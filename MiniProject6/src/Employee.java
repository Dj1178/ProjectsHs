
public class Employee {
	private String name;
	private int age;
	private String jobTitle;
	private int salary;
	private boolean isRemote;

	public Employee(String n) {
	name=n;
	age=0;
	jobTitle="";
	salary=0;
	isRemote =false;
	}
	
	public Employee(String a, int b, String c, int d, boolean e) {
		name = a;
		age = b;
		jobTitle = c;
		salary = d;
		isRemote = e;
	}
	public void raiseSalary(int x) {
		salary += x;
	}
	public void givePromotion() {
		jobTitle = "Senior "+jobTitle;
		salary += 10000;
	}
	public void setAge(int z) {
		age=z;
	}
	public void setName(String n) {
		name = n;
	}
	public void setSalary(int s) {
		salary = s;
	}
	public void setJobTitle(String jt) {
	jobTitle= jt;
	}
	public void setRemote() {
		isRemote=true;
	}
	public void setInPerson() {
		isRemote=false;
	}
	public String toString() {
		String zt= name+""+age+""+jobTitle+""+salary+""+isRemote;
		return zt;
	}
	public String theName() {
		return name;
	}
	public int theAge() {
		return age;
	}
	public String theJobTitle() {
		return jobTitle;
	}
	public int theSalary() {
		return salary;
	}
	public boolean areRemote() {
		return isRemote;
	}
}
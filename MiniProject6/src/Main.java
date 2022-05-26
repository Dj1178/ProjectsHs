
public class Main {

	public static void main(String[] args) {
		Employee a = new Employee("Dani");
		System.out.println(a.areRemote());
		Employee b= new Employee("Mother", 49,"nazi scientist", 1000000, false);
		b.setRemote();
		System.out.println(b.areRemote());
		
	}

}
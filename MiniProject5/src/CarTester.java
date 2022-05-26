
public class CarTester {

	public static void main(String[] args) {
		Car a= new Car();
		Car c= new Car("Lexus", 2001, "STUTUTUUTUTU", 139000,true);
		
		System.out.println(a.getMiles());
		System.out.println(c.getMiles());
		
		a.addMiles(100);
		c.addMiles(139);
		
		System.out.println(a.getMiles());
		System.out.println(c.getMiles());
		
		System.out.println(a.getCondition());
		
		a.repair();
		
		System.out.println(a.getCondition());
		System.out.println(c.getSound());
		
	}

}

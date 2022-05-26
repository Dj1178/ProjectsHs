
public class Tester {

	public static void main(String[] args) {
		Animal animal1 = new Animal(true, "Black", "plains");
		Animal animal2 = new Amphibian(true, "Yellow", 67.0, "Salamanders");
		Amphibian animal3= new Amphibian(true, "Green", 59.4, "Frog");
		
		animal1.talk();
		animal2.talk();
		animal3.talk();
		System.out.println(animal1.getColor());
		System.out.println(animal2.getColor());
		System.out.println(animal3.getColor());
		
		System.out.println(animal1.getWaterTemp());
		System.out.println(animal2.getWaterTemp());
		System.out.println(animal3.getWaterTemp());
	}

}

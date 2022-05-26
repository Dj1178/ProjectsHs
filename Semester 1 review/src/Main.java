
public class Main {

	public static void main(String[] args) {
		int x=5;
		double y=5.5;
		boolean z=true;
		
		String s="hello";
		
		
		
		int x2 = (int)y;
		
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
		}
		int counter=0;
		while(counter<=5) {
			System.out.println("Hello");
			counter++;
		}
		int b=2;
		Integer b2=3;
		
		Refrigerator fridge= new Refrigerator();
		System.out.println(fridge.getColor());
		fridge.paint("white");
		System.out.println(fridge.getColor());
		
	}
	static boolean isPrime(int x) {
		for (int i = 2; i < x; i++)
            if (x % i == 0)
                return false;
  
        return true;
    }
			
}
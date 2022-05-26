import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String again= "y";
		while(again.equals("y")) {
			System.out.println("Please enter an adjective");
			String adjectiveOne= input.nextLine();
			System.out.println("Please enter a place");
			String placeOne= input.nextLine();
			System.out.println("Please enter a past tense verb");
			String verbThree= input.nextLine();
			System.out.println("Please enter another adjective");
			String adjectiveTwo= input.nextLine();
			System.out.println("Please enter another verb");
			String verbTwo= input.nextLine();
			System.out.println("Please enter a singular thing");
			String thingOne= input.nextLine();
			System.out.println("Please enter a third verb");
			String verbOne= input.nextLine();
			System.out.println("I was "+verbOne+" down the street until I saw a "+adjectiveOne+" man in a van watching me. I started to take turns to try and get away from him.");
			System.out.println("I then "+verbTwo+" and kept taking turns. I regretted not looking where I was going for I slipped and fell into the "+adjectiveTwo+" grass.");
			System.out.print("Eventually I got up but then I looked towards "+placeOne+" and saw "+thingOne+" and then instantly "+verbThree);
			System.out.println(" The End. Would you like to play again? Enter y for yes and n for no.");
			again= input.nextLine();
			if(again.equals("n")) {
				again="n";
			}
		}
		input.close();
	}
}

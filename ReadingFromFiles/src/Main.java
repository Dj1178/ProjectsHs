import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		/*String[] foods= new String[5];
		foods[0]="oranges";
		foods[1]="cereal";
		foods[2]="sandwich";
		foods[3]="apple";
		foods[4]="pasta";
		
		System.out.println(foods[4]);*/
		File file = new File("dictionary.txt");
		Scanner scanner= new Scanner(file);
		String[] words = new String[349850];
		int i =0;
		while(scanner.hasNextLine()) {
			words[i]= scanner.nextLine();
			i++;
		}
		
		for(int x=0; x<349850;x++) {
			if(words[x].equals("zzzzzzzz")) {
				System.out.println("Your word was found at index: "+ x);
			}
		}
	}

}

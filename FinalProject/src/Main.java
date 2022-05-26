import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static String line;
	static String[] arr;
	static ArrayList<String[]> result=new ArrayList<String[]>();

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("food.txt");
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()) {
			line=scanner.nextLine();
			arr=line.split("\\s+");
			result.add(arr);
		}
		for(int i=0;i<result.size();i++){
			for(int j=0;j<result.get(i).length;j++) {
				System.out.print(result.get(i)[j]+" ");
			}
			System.out.println();
		}
		ArrayList<Food> f=new ArrayList<Food>();
		String n=null;
		int a=0;
		double b=0;
		double c=0;
		for(int i=0;i<result.size();i++){
			for(int j=0;j<result.get(i).length;j++) {
				if(j==0) {
					n=result.get(i)[j];
				}else if(j==1) {
					a=Integer.parseInt(result.get(i)[j]);
				}else if(j==2) {
					b=Double.parseDouble(result.get(i)[j]);
				}else if(j==3){
					c=Double.parseDouble(result.get(i)[j]);
				}
			}
			Food x= new Food(n, a, b, c);
			f.add(x);
		}
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i)[0]+" ");
		}
		CalorieTracker tracker=new CalorieTracker(f);
		tracker.calcCals();
		System.out.println("You consumed "+ tracker.getCals()+ " calories.");
	}
}
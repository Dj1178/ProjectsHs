import java.util.Scanner;
import java.util.ArrayList;

public class CalorieTracker {
	private int totCalories;
	private ArrayList<Food> foods;
	
	public CalorieTracker(ArrayList<Food> f) {
		totCalories=0;
		foods=f;
	}
	
	public void calcCals() {
		Scanner input=new Scanner(System.in);
		String ans= "y";
		while(ans.equals("y")) {
			System.out.println("What food did you eat out of the foods above?(Enter exactly how it is above)");
			String x=input.nextLine();
			for(int i=0;i<foods.size();i++) {
				if(x.equals((foods.get(i)).getName())) {
					totCalories+=foods.get(i).getCal();
				}
			}
			System.out.println("Would you like to enter another food?([y] for yes and [n] for no.");
			ans= input.nextLine();
		}
	}
	
	public int getCals() {
		return totCalories;
	}
}
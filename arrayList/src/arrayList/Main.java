package arrayList;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Arraylists are Dynamic - size can change
		ArrayList<String> foods= new ArrayList<String>();
		foods.add("Pizza");
		foods.add("Pasta");
		foods.add("Orange");
		System.out.println(foods.size());
		System.out.println(foods.get(0));
		System.out.println(foods.set(1, "Chicken"));
		System.out.println(foods.get(1));
		System.out.println(foods);
		ArrayList<Double> nums=new ArrayList<Double>();
		int count =0;
		while(count!=1000) {
			nums.add((double)count+1);
			count++;
		}
		System.out.println(nums);
		System.out.println(findAverage(nums));
	}
	
	public static double findAverage(ArrayList<Double> list) {
		int l=list.size();
		double tot=0;
		int count=0;
		while(count!=l) {
			tot+=list.get(count);
			count++;
		}
		return tot/l;
	}

}

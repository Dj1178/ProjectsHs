import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			int rand =(int)(Math.random()*31)+20;
			numbers.add(rand);
		}
		System.out.println(numbers);
		selectionSort(numbers);
		System.out.print(numbers);
	}
	
	static void selectionSort(ArrayList<Integer> arr) {
		int lp=0;
		int count=0;
		while(count<arr.size()) {
			lp=count;
			int l=arr.get(count);
			for(int i=count;i<arr.size();i++) {
				if(arr.get(i)<l) {
					l=arr.get(i);
					lp=i;
				}
			}
			swap(arr, count, lp);
			count++;
		}
	}
	
	static void swap(ArrayList<Integer> arr, int index1, int index2) {
		int temp=arr.get(index1);
		arr.set(index1, arr.get(index2));
		arr.set(index2, temp);
	}
}

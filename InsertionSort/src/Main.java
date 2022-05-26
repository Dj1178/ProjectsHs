import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			int rand =(int)(Math.random()*31)+20;
			numbers.add(rand);
		}
		System.out.println(numbers);
		insertionSort(numbers);
		System.out.println(numbers);
		
	}
	
	static void insertionSort(ArrayList<Integer> arr) {
		for(int i=1; i<arr.size();i++) {
			int bar = arr.get(i);
			for(int j=i-1;j>=0;j--) {
				if(bar<arr.get(j)) {
					arr.set(j+1, arr.get(j));
					if(j==0) {
						arr.set(0,  bar);
					}
					}else {
						arr.set(j+1, bar);
						break;
					}
				}
			}
		}
	

	@SuppressWarnings("unchecked")
	static void shift(ArrayList<Integer> arr, int startIndex, int value) {
		ArrayList<Integer> temp=new ArrayList<Integer>();
		temp=(ArrayList<Integer>) arr.clone();
		for(int i=0; i <arr.size();i++) {
			if(i==startIndex) {
				arr.set(i, value);
				i++;
			}
			if(i<startIndex) {
				arr.set(i, arr.get(i));
			}else {
				arr.set(i, temp.get(i-1));
			}
		}
	}
}

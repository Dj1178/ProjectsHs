
public class Main {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		for(int i=0; i<arr.length;i++) {
			for(int x=0; x<arr[i].length;x++) {
				arr[i][x]=(int)(Math.random()*50);
			}
		}
		printArray(arr);
		System.out.println(isTouching13(arr, 3, 3));
	}

	public static boolean isTouching13(int[][] arr, int row, int col) {
		if(arr[row][col]==13) {
			return false;
		}
		if(col!=arr[row].length) {
			if(arr[row][col+1]==13) {
				return true;
			}
		}
			if(col!=0){
				if(arr[row][col-1]==13) {
					return true;
				}
			}
			if(row!=0) {
				if(arr[row-1][col]==13) {
					return true;
				}
			}
			if(row!=arr.length) {
				if(arr[row+1][col]==13) {
					return true;
				}
			}
			return false;
		}
	
	public static void printArray(int[][] arr) {
		for(int[] x: arr) {
			for(int y: x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}
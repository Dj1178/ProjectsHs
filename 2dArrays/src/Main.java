
public class Main {

	public static void main(String[] args) {
		int[][] arr = {{67, 84, 38, 94, 100}, {1, 6, 83, 9, 70}, {80, 99, 62, 88, 74}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+", ");
			}
			System.out.println();
		}
		System.out.println(arr[2][2]);
		System.out.println(arr[0][4]);
		for(int[] x: arr) {
			for(int y: x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}

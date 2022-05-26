package imageManipulation;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

	public static void main(String[] args) {
		MyCanvas pic = new MyCanvas();
		Frame f = new Frame("My image");
		
		f.add("Center", pic);
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			  public void windowClosing(WindowEvent we){
			  System.exit(0);
			 }
		});
		int[][] picture = new int[400][400];
		createImage(picture);
		shiftImageLeft(picture, 50);
		invertGreen(picture);
		pic.draw(picture);
	}
	public static void createImage(int[][] arr) {
		for(int i=75;i<arr.length-100;i++){
			for(int j=75;j<arr[i].length-175;j++) {
				arr[i][j]=Color.blue.hashCode();
			}
		}
	}
	public static void shiftImageLeft(int[][] arr, int x) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]!=0) {
					arr[i-x][j]=arr[i][j];
					arr[i][j]=0;
				}
			}
		}
	}
	
	public static void invertGreen(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]!=0) {
					arr[i][j]=0;
				}else {
					arr[i][j]=Color.green.hashCode();
				}
			}
		}
	}
}

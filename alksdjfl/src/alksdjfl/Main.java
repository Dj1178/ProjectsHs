package alksdjfl;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number you want to multiply");
		int a=input.nextInt();
		System.out.println("Enter the second number you want to multiply");
		int b=input.nextInt();
		Calculator one=new Calculator(a,b);
		System.out.println(one.product());
	}

}

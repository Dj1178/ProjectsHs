import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double tot=0.0;
		storeProduct peanut= new storeProduct("peanut", .15);
		storeProduct macadamia=new storeProduct("macadamia", .20);
		storeProduct water= new storeProduct("water", 1.00);
		storeProduct gatorade= new storeProduct("gatorade", 3.00);
		storeProduct milk= new storeProduct("milk", 2.00);
		storeProduct egg=new storeProduct("egg", .12);
		storeProduct pants=new storeProduct("pants", 17.32);
		storeProduct tshirt=new storeProduct("tshirt", 23.31);
		System.out.println("Peanuts at $.15");
		System.out.println("Macadamia at $.20");
		System.out.println("Waters at $1.00");
		System.out.println("Gatorade at $3.00");
		System.out.println("Gallon of Milk at $2.00");
		System.out.println("Egg at $.12");
		System.out.println("Pants at $17.32");
		System.out.println("T-Shirt at $23.32");
		milk.setIsFragile(true);
		egg.setIsFragile(true);
		System.out.println("Enter what Item you want to buy");
		String item= input.nextLine();
		System.out.println("Enter the quantity of that item");
		int quan= input.nextInt();
		if(item.equals("peanut")) {
			if(peanut.calculateTotalPrice(quan)==0) {
				System.out.println("The quantity you entered was higher than the amount in stock");
				System.out.println("Please enter another quantity");
				quan=input.nextInt();
			}else {
				System.out.println("Your total price will be $"+tot);
			}
			tot=peanut.calculateTotalPrice(quan);
		}
		if(item.equals("macadamia")) {
			if(macadamia.calculateTotalPrice(quan)==0) {
				System.out.println("The quantity you entered was higher than the amount in stock");
				System.out.println("Please enter another quantity");
				quan=input.nextInt();
			}else {
				System.out.println("Your total price will be $"+tot);
			}
			tot=macadamia.calculateTotalPrice(quan);
		}
		if(item.equals("water")) {
			if(water.calculateTotalPrice(quan)==0) {
				System.out.println("The quantity you entered was higher than the amount in stock");
				System.out.println("Please enter another quantity");
				quan=input.nextInt();
			}else {
				System.out.println("Your total price will be $"+tot);
			}
			tot=water.calculateTotalPrice(quan);
		}
		if(item.equals("gatorade")) {
			if(gatorade.calculateTotalPrice(quan)==0) {
				System.out.println("The quantity you entered was higher than the amount in stock");
				System.out.println("Please enter another quantity");
				quan=input.nextInt();
			}else {
				System.out.println("Your total price will be $"+tot);
			}
			tot=gatorade.calculateTotalPrice(quan);
		}
		if(item.equals("milk")) {
			if(milk.calculateTotalPrice(quan)==0) {
				System.out.println("The quantity you entered was higher than the amount in stock");
				System.out.println("Please enter another quantity");
				quan=input.nextInt();
			}else {
				System.out.println("Your total price will be $"+tot);
			}
			tot=milk.calculateTotalPrice(quan);
		}
		if(item.equals("egg")) {
			if(egg.calculateTotalPrice(quan)==0) {
				System.out.println("The quantity you entered was higher than the amount in stock");
				System.out.println("Please enter another quantity");
				quan=input.nextInt();
			}else {
				System.out.println("Your total price will be $"+tot);
			}
			tot=egg.calculateTotalPrice(quan);
		}
		if(item.equals("tshirt")) {
			if(tshirt.calculateTotalPrice(quan)==0) {
				System.out.println("The quantity you entered was higher than the amount in stock");
				System.out.println("Please enter another quantity");
				quan=input.nextInt();
			}else {
				System.out.println("Your total price will be $"+tot);
			}
			tot=tshirt.calculateTotalPrice(quan);
		}
		if(item.equals("pants")) {
			if(pants.calculateTotalPrice(quan)==0) {
				System.out.println("The quantity you entered was higher than the amount in stock");
				System.out.println("Please enter another quantity");
				quan=input.nextInt();
			}else {
				System.out.println("Your total price will be $"+tot);
			}
			tot=pants.calculateTotalPrice(quan);
		}
		System.out.println("Your total will be $"+ tot);
		input.close();
	}
}
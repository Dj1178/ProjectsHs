import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int an=0;
		ArrayList<Account> accounts=new ArrayList<Account>();
		Scanner input=new Scanner(System.in);
		int ans=0;
		while(ans!=1) {
		System.out.println("Would you like to log in[1] or create an account[2]");
		ans=input.nextInt();
			if(ans==2){
				System.out.println("Please enter your name");
				String n=input.nextLine();
				input.nextLine();
				System.out.println("Enter your starting balance");
				int sb=input.nextInt();
				input.nextLine();
				System.out.println("Enter the type of account you would like to create, (ch for checking, sa for savings, and cr for credit)");
				String ta=input.nextLine();
				if(ta.equals("ch")) {
					System.out.println("Please enter a secret pin for your account");
					int p=input.nextInt();
					CheckingAccount a=new CheckingAccount(n, sb, p);
					System.out.println("Account Created!");
					accounts.add(a);
				}else if(ta.equals("sa")) {
					SavingsAccount a=new SavingsAccount(n, sb);
					System.out.println("Account Created!");
					accounts.add(a);
				}else if(ta.equals("cr")) {
					CreditAccount a=new CreditAccount(n);
					System.out.println("Account Created!");
					accounts.add(a);
				}
			}
		}
		if(ans==1&&accounts.size()>0){
			System.out.println(accounts.get(0).getAccountID());
			System.out.println("Please enter an account id.");
			int id=input.nextInt();
			System.out.println(accounts.get(0).getAccountID());
			int count=0;
			for(int i=0;i<accounts.size();i++) {
				if((accounts.get(i)).getAccountID()==id) {
					accounts.get(i).printAccountInformation();
					an=i;
					count++;
				}
			}
			if(count>=1&&accounts.size()>0) {
				if((accounts.get(an).getType()).equals("Savings")) {
					System.out.println("Would you like to accrue interest? [1] for yes and [2] for no.");
					int ok= input.nextInt();
					if(ok==1) {
						System.out.println("Enter the amount of years you are going to accrue interest.");
						int ko=input.nextInt();
						((SavingsAccount)(accounts.get(an))).accrueInterest(ko);
					}
				}
				if((accounts.get(an).getType()).equals("Checking")) {
					System.out.println("Success! Would you like to transfer money? Enter a [1] for yes and a [2] for no.");
					int inp=input.nextInt();
					if(inp==1){
						System.out.println("Enter the account ID you would like to transfer to.");
						int aid=input.nextInt();
						int cor=0;
						int cou=0;
						for(int j=0;j<accounts.size();j++) {
							if((accounts.get(j)).getAccountID()==aid) {
								cor=j;
								cou++;
							}
						}
						if(cou>=1) {
							System.out.println("Please enter the amount you would like to transfer.");
							int am=input.nextInt();
							((CheckingAccount)accounts.get(an)).transfer(((CheckingAccount)accounts.get(cor)), am);
							System.out.println("Successfully transfered!");
						}
					}
				}
				System.out.println("Would you like to deposit[1] or withdraw money[2]? Enter a [0] for no");
				int in=input.nextInt();
				if(in==1) {
					System.out.println("How much would you like to deposit?");
					int i=input.nextInt();
					accounts.get(an).deposit(i);
				}else if(in==2) {
					System.out.println("How much would you like to withdraw?");
					int i=input.nextInt();
					accounts.get(an).withdraw(i);
				}else {
					System.out.println("Would you like to do anything else? Enter a [1] for yes and a [2] for no.");
					int x=input.nextInt();
					if(x==1) {
						System.out.println("Here is a list of everything else you can do.");
						System.out.println("Enter a [1] to see your banking history, enter a [2] to change the name on the account.");
						int z=input.nextInt();
						if(z==1) {
							accounts.get(an).printBankStatement();
						}
						if(z==2) {
							System.out.println("Please enter a name you would like to change to.");
							String zx=input.nextLine();
							accounts.get(an).setName(zx);
						}
					}else {
						System.out.println("Logging out!");
					}
				}
			}else {
				System.out.println("There is no account with that ID.");
			}
		}
		input.close();
	}
}
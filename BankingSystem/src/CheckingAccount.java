//Class creates a specific account which is a checking account
public class CheckingAccount extends Account{
	//instance variable for a checking account
	private int pin;
	//constructor for checking account
	public CheckingAccount(String n, int b, int p) {
		super(n, "Checking", b);
		pin=p;
	}
	//@tranfser- method to transfer money from current account to a new account for a certain amount of money
	public void transfer(CheckingAccount a, int am) {
		super.withdraw(am);
		a.deposit(am);
	}
	//@getPin- a method to return pin
	public int getPin() {
		return pin;
	}
}
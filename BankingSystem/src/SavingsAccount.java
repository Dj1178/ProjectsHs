//Object that extends account to create a savings account
public class SavingsAccount extends Account{
	//instance variables for the savings account
	private double interestRate;
	//constructor for savings account with parameters
	public SavingsAccount(String n, int b) {
		super(n, "Savings", b);
		interestRate=.04;
	}
	//@void- to accrue interest on the account
	public void accrueInterest(double x) {
		double fa=super.getBalance()*(1+interestRate*x);
		super.deposit(fa-super.getBalance());
	}
}
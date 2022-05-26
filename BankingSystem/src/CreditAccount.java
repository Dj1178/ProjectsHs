
public class CreditAccount extends Account{
	private double aprRate;
	
	public CreditAccount(String n) {
		super(n, "Credit", 0.0);
		aprRate =.1832;
	}
	public void purchase(double x) {
		if(x>1000) {
			x-=100;
		}
		super.deposit(x);
	}
	public void makePayment(double p) {
		super.withdraw(p);
	}
	public double getRate() {
		return aprRate;
	}
}
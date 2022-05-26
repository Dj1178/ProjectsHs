import java.util.ArrayList;
import java.util.Date;

public class Account {
	//Private attributes for the object account
	private String name;
	private Date dateOfCreation;
	private int accountID;
	private String accountType;
	private double balance;
	private ArrayList<String> history;
	//Constructor for account with the 3 parameters
	public Account(String n, String at, double b) {
		name=n;
		dateOfCreation=new Date();
		accountID=(int)(Math.random()*(1000000-9999999)+1)+9999999;
		accountType=at;
		balance=b;
		history=new ArrayList<String>();
	}
	//Method to print out all of the information for one account
	public void printAccountInformation() {
		System.out.println(dateOfCreation.toString());
		System.out.println(name);
		System.out.println("Account ID: "+accountID);
		System.out.println(accountType);
		System.out.println(balance);
		System.out.println(history);
	}
	//@withdraw- method to withdraw a certain amount of money from an account, but also adds the transaction to history.
	public void withdraw(double x) {
		balance-=x;
		Date d=new Date();
		history.add(x+" was withdrawn on " +d.toString());
	}
	//@deposit- method to deposit a certain amount of money, but also adds the transaction to history.
	public void deposit(double x) {
		balance+=x;
		Date d=new Date();
		history.add(x+" was deposited on "+ d.toString());
	}
	//@printBankStatement- prints out all account information
	public void printBankStatement() {
		System.out.println(history);
	}
	//@getName- returns the name of the account
	public String getName() {
		return name;
	}
	//@getDate- return the date the account was created
	public Date getDate() {
		return dateOfCreation;
	}
	//@getAccountID- returns the account id of the account
	public int getAccountID() {
		return accountID;
	}
	//@getType- returns the type of the account
	public String getType() {
		return accountType;
	}
	//@getBalance- returns the balance of the account
	public double getBalance() {
		return balance;
	}
	//@getHistory- returns the history of the account
	public ArrayList<String> getHistory(){
		return history;
	}
	//@setName- allows the user to change the name of the account
	public void setName(String n) {
		name=n;
	}
}
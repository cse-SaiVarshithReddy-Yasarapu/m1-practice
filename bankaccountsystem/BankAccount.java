package bankaccountsystem;

public class BankAccount {
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	BankAccount(){
		
	}
	
	BankAccount(String accountNumber,String accountHolderName,double balance){
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}

	
	 public void deposit(double amount) {
		balance+=amount;
		System.out.println("Money Deposited Successfully");
		System.out.println("Balance is "+balance);
		
	}
	 public void withDraw(double amount) {
		 if(this.balance>=amount) {
			 balance-=amount;
			 System.out.println("Money Withdrawed successfully");
			 System.out.println("Balance is "+balance);
		 }
		 else {
			 System.out.println("Insufficient Funds");
		 }	 
	 }
	 
	 public void displayBalance() {
		 	System.out.println("Balance is "+balance);
	 }
	 
	 
	
	
	

}

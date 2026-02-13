package bankaccountsystem;

public class SavingsAccount extends BankAccount {
	private double interestRate;
	public SavingsAccount(String accountNumber,String accountHolderName,double balance, double interestRate) {
		super(accountNumber,accountHolderName,balance);
		this.interestRate=interestRate;
		
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate=interestRate;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void addInterest() {
		double amount=getBalance()*interestRate/100;
		deposit(amount);
	}
	
	@Override
	public void withDraw(double amount) {
		if(getBalance()-amount>=500) {
			super.withDraw(amount);
		}
		else {
			System.out.println("Minimum 500 should be maintained");
		}
	}
	
	
	
}

package bankaccountsystem;

public class CurrentAccount extends BankAccount {
	private double overDraftLimit;
	public CurrentAccount(String accountNumber,String accountHolderName,double balance, double overDraftLimit) {
		super(accountNumber,accountHolderName,balance);
		this.overDraftLimit=overDraftLimit;
	}
	@Override
	public void withDraw(double amount) {
		if(getBalance()>amount) {
			super.withDraw(amount);
			
		}
		else if(getBalance()+overDraftLimit>=amount) {
			
			double excess=amount-getBalance();
			overDraftLimit-=excess;
		super.withDraw(amount-excess);
	}
		else {
			System.out.println("Money cannot be Withdrawed");
		}
	}

}

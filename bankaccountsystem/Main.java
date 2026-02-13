package bankaccountsystem;

public class Main {

	public static void main(String[] args) {
//	BankAccount bank=new BankAccount("A1","Reddy",100000);
//	bank.deposit(50000);
//	bank.withDraw(20000);
//	bank.displayBalance();
		BankAccount b1=new SavingsAccount("A1","Reddy",100000,5);
		b1.withDraw(500000);
		BankAccount b2=new CurrentAccount("A1","Reddy",100000,5000);
		b2.withDraw(105000);
		
		
	
	}

}

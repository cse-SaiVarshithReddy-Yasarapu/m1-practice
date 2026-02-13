package ecommerce;

public class CreditCardPayment extends Payment implements Refundable {
	double cardNumber;
	public CreditCardPayment(double amount,double cardNumber) {
		super(amount);
		this.cardNumber=cardNumber;
		
	}
	@Override
	void makePayment(){
		System.out.println("Paid using Card");
		
	}
	
	@Override
	
	public void refund(double amount) {
		System.out.println("Refund Processed");
	}
}

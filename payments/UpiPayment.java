package ecommerce;

public class UpiPayment extends Payment implements Refundable {
	String upiId;
	public UpiPayment(double amount, String upiId ) {
		super(amount);
		this.upiId=upiId;
		
	}
	@Override
	void makePayment() {
		System.out.println("Paid using UPI");
	}
	@Override
	public void refund(double amount) {
		System.out.println("Refund processed");
	}

}

package ecommerce;

public abstract class Payment {
	double amount;
	public Payment(double amount) {
		this.amount=amount;
	}
	abstract void makePayment();
	void paymentReceipt() {
		System.out.println("Payment sucess");
	}

}

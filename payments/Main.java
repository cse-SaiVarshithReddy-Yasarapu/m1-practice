package ecommerce;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p1=new CreditCardPayment(500, 123);
		Payment p2=new UpiPayment(1000, "sai123");
		p1.makePayment();
		p1.paymentReceipt();
		p2.makePayment();
		p2.paymentReceipt();
//		p1.refund(500);
	}

}

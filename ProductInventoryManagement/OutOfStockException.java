package ProductInventoryManagement;

public class OutOfStockException extends RuntimeException{
	
	public OutOfStockException(String msg) {
		super(msg);
	}

}

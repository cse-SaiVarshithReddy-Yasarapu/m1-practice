package ProductInventoryManagement;

public class Main {

	public static void main(String[] args) {
		
		Product p1=new Product(101,"Laptop",55000,10);
		Product p2=new Product(102,"pen",55000,20);
		Product p3=new Product(103,"book",55000,91);
		Product p4=new Product(104,"bat",55000,100);
		Product p5=new Product(105,"scale",55000,0);
		InventoryService is=new InventoryService();
		is.addProduct(p1);
		is.addProduct(p2);
		is.addProduct(p4);
		is.addProduct(p3);
		is.addProduct(p5);
		is.sellProduct(101, 10);
		is.getOutOfStockProducts();
		
		

	}

}

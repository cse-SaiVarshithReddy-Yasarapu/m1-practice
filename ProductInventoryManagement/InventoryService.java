package ProductInventoryManagement;
import java.util.*;


public class InventoryService {
	HashMap<Integer,Product> productList=new HashMap<>();
	public void addProduct(Product p) {
		productList.put(p.getProductId(),p);
	}
	public void sellProduct(int pId,int quantity) {
		if(!(productList.containsKey(pId))) {
			throw new ProductNotFoundException("Product does not exist");
		}
		else if(productList.containsKey(pId) && productList.get(pId).getQuantity()<quantity ) {
			throw new OutOfStockException("Product is out of stock");
		}
		else {
			int a=productList.get(pId).getQuantity();
			productList.get(pId).setQuantity(a-quantity);
			System.out.println("Product is sold successfully and remaining quantity is "+productList.get(pId).getQuantity());
		}
	}
	public void getOutOfStockProducts() {
		for(Map.Entry<Integer,Product> map :productList.entrySet()) {
			if(map.getValue().getQuantity()==0) {
				System.out.println(map.getValue());
			}
		}
	}

}

package staticDemo;

public class ProductManager {
	
	//sttic clsslr class ismiyle çağırılır
	//Static class çağırıldığında constructor çalışmaz
	
	public void add(Product product) {
		if(ProductValidator.isValid(product)) {
			System.out.println("eklendi");
		}else {
			System.out.println("eklenemedi");
		}
	}
}

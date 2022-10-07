package staticDemo;

public class ProductValidator {
	
	//Static yapıcı blok ilk static metod çağırıldığında bir kez çalışır
	static {
		System.out.println("static yapıcı blok çalıştı");
	}
	
	public static  boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
}

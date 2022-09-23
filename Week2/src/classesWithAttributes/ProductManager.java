package classesWithAttributes;

public class ProductManager {
	//Manager operasyon tutucu classlardır
	//Class içerisinde bşka class çağırabiliriz.
	public void add(Product product) {
		System.out.println("ürün eklendi: "+product.getName());
	}
}

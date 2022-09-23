package classesWithAttributes;

public class Main {

	public static void main(String[] args) {


		Product product =new Product();
		product.setName("laptop");
		product.setId(1);
		product.setDescription("asus lptop ");
		product.setPrice(36998);
		product.setStockAmount(1455);
		
		ProductManager productManager=new ProductManager();
		productManager.add(product);
		
		
		System.out.println(product.getName());
	}

}

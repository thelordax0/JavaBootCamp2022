package oop1;

public class Main {

	public static void main(String[] args) {
		// OOP object oriented programming nesne güdümlü programlama
		// product1 adında Product nesnesi oluşturma
		Product product1 = new Product();
		// Product1 nesnesinin özelliklerini veriyoruz
		// Set value
		product1.setName("Delonghi kahve makinesi");
		product1.setUnitPrice(9666);
		product1.setDiscount(10);
		product1.setImageUrl("image1.svg");
		product1.setUnitsInStock(25);

		// get value
		// System.out.println(product1.name);

		Product product2 = new Product();

		product2.setName("vestel kahve makinesi");
		product2.setUnitPrice(8450);
		product2.setDiscount(10);
		product2.setImageUrl("image2.svg");
		product2.setUnitsInStock(2);

		Product product3 = new Product();

		product3.setName("arcelik kahve makinesi");
		product3.setUnitPrice(5451);
		product3.setDiscount(20);
		product3.setImageUrl("image3.svg");
		product3.setUnitsInStock(35);

		// Product tipinde dizi tanımlama

		Product[] products = { product1, product2, product3 };

		// products dizisini tek tek gez
		// for-each
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();

		individualCustomer.setId(1);
		individualCustomer.setPhone("053584578569");
		individualCustomer.setCustomerNumber("1354");
		individualCustomer.setFirstName("mahmut");
		individualCustomer.setLastName("havbal");

		CorporateCustomer corporateCustomer = new CorporateCustomer();

		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("kodlama.ioo");
		corporateCustomer.setPhone("0538558");
		corporateCustomer.setTaxName("12571525858");
		corporateCustomer.setCustomerNumber("5458");

		// Customer ,IndividualCustomer ve CorporateCustomer ın referansını tutabilir bu
		// olaya polimorfizm denir.

		Customer[] customers = { individualCustomer, corporateCustomer };

	}

}

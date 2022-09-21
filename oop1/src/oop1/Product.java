package oop1;

//Classlar PascalCase isimlendirilir.
//Clsslar nesne şablonlarıdır.
public class Product {
	// Field=Alan CamelCase
	// private sadece o class ın içerisinde kullanılabilir demek
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;

	// getter ve setter, private olan değişkenleri dışarıdan get ve set etmemize
	// olanak sağlar
	// field ı private olan özelliklere getter ve setter eklemeye encapsulation
	// yani kapsülleme denir.
	// eclipse ototmatik getter ve setter yazmak için sağ tık>source>generate
	// getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}

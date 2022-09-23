package classesWithAttributes;

public class Product {

//Field alanında classlr attributes özellikler tutar
	// product class ı hem ttribute tutupp hem operasyon tutmamalıdır single
	// responsibility
	// Attribute ler default publictir class public olduğu için
	// private sadece tanımlandığı blokta geçerlidir.
	// Private o bloğa özgüdür eğer if içinde tanımlanırsa sadece if içinde
	// geçerlidir.
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	
	//Getter
	public int getId() {
		return id;
	}
	//Sette
	public void setId(int id) {
		//This içerisinde bulunduğum class demek
		//bu şekilde de kullanılabilir
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	//otomatik oluşturulan getter ve setterlar
	
	
	
	
	
	
	
	
	
}

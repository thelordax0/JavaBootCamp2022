package youtubeEğitim;

public class CustomerManager {
	//Constructor dan alınan customer nesnesine class içindeki diğer metodlarda kullanabilmek için örneği tutulur.
	private Customer customer;
	public CustomerManager(Customer customer) {
		this.customer=customer;
	}
	
	public void save() {
		System.out.println("müşteri kaydedildi "+customer.getId());
	}
}

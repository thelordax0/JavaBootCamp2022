package youtubeEğitim;

public class CreditManager {
	public void calculate() {
		System.out.println("kredi hesaplandı");
	}
	
	//Parametreleri tek tek almak yerine Customer olrak almak gelecekte customer classına gelecek yenilikleri kolayca eklememizi sağlar 
	//Bu olaya encapsulation(kapsülleme) denir.
	public void save(Customer customer) {
		System.out.println("kredi verildi");
	}
}

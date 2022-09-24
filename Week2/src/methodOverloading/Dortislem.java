package methodOverloading;

public class Dortislem {

	public int topla(int sayı1,int sayı2) {
		return sayı1+sayı2;
	}
	
	//Aynı isimde fakat farklı imzaya sahip methodlar kullanılabilir.
	//buna method overloading denir.
	
	public int topla(int sayı1,int sayı2,int sayı3) {
		return sayı1+sayı2+sayı3;
	}
	
	
	
	
}

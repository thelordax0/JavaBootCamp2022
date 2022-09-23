package methods2;

public class Main {

	public static void main(String[] args) {

		String mesaj = "bugün hva çok güzel";

		// Sbustring bir değer döndürür bunu değişkene tayabiliriz

		String yeni = mesaj.substring(0, 5);
		// void opersyonlr değişkene atanamaz

		
		int toplam =topla(5,30);
		System.out.println(toplam);
		
		
		toplam=topla(15,40,80,55);
		System.out.println(toplam);
	}

	// Void operasyonlar bir iş yapar değer döndürmez
	public static void ekle() {
		System.out.println("eklendi");
	}

	public static void sil() {
		System.out.println("silindi");
	}

	public static void güncelle() {

	}

	// int tipinde veri döndürür retrurn ifadesi işlemi sonlandırır ve değeri
	// döndürür.

	public static int topla(int sayı1,int sayı2) {
		return sayı1+sayı2;
	}
	
	//methodların signature ı farklı olmak zorunda
	//Variable arguments bir integer array gibi davranır istediğimiz kadar veri gönderebliririz
	public static int topla(int... sayılar) {
		
		int toplam =0;
		for(int sayı:sayılar) {
			toplam+=sayı;
		}
		
		
		return toplam;
	}
	
	
	public static String sehirVer() {
		return  "ankara";
	}
}

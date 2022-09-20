package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj="bugün hava çok güzel";
		//Stringler arkaplanda char array dir.
		
		System.out.println(mesaj);
		
		
		System.out.println("eleman sayısı: "+mesaj.length());
		System.out.println("5.eleman: "+mesaj.charAt(4));
		
		//String birleştirir değişkeni değiştirmez.
		System.out.println(mesaj.concat("Yaşasın"));
		
		//mesaj değişmedi
		System.out.println(mesaj);
		//b ile mi başlıyor
		System.out.println(mesaj.startsWith("b"));
		//nokta ile mi bitiyor
		
		System.out.println(mesaj.endsWith("."));
		
		//karakterler char arrayına 0 dan 5 e kadar olanları 0dan başayarak ata
		char[] karakterler=new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		//ilk buluduğu karakterin indexini döndürür.
		System.out.println(mesaj.indexOf("b"));
		//tersten başlayarak bulduğu ilk karakterin indexini döner
		System.out.println(mesaj.lastIndexOf("a"));
		
		
		//Boşluk olan yerleri - ifadesiyle değişltirir ve metni döndürür.
		System.out.println(mesaj.replace(" ","-"));
		
		//2.indexten itibaren metni parçalar
		System.out.println(mesaj.substring(2));
		//2.indexten başla 4.indexe kdar kes 4 dahil değil.
		System.out.println(mesaj.substring(2,4));
		
		
		//metni boşluklardan ayırarak dizi döndürür.
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		
		//hepsini küçük harfe çevirir.
		System.out.println(mesaj.toLowerCase());
		//metni büyük harfe çevirir.
		System.out.println(mesaj.toUpperCase());
		//başındaki ve sonundaki boşlukları siler.
		System.out.println(mesaj.trim());
	
		
		
		
		
		
		
	}

}

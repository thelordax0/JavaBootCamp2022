package methods;

public class Main {

	public static void main(String[] args) {
		//Fonksiyon çağırma
		mesajVer();
		mesajVer("Hello terminal");
	}

	// Fonksiyonlar camelCasing yazılır.
	// Fonksiyonlar kendimizi tekrar etmem,izi engeller.
	public static void mesajVer() {
		System.out.println("method working!!");
	}

	// Prametreli fonksiyon
	public static void mesajVer(String msj) {
		System.out.println(msj);
	}

}

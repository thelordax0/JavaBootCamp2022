package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayı1=30;
		int sayı2=25;
		int sayı3=2;
		int enbuyuk=sayı1;
		
		
		
		if(enbuyuk<sayı2) {
			enbuyuk=sayı2;
		}
		
		if(enbuyuk<sayı3) {
			enbuyuk=sayı3;
		}else {
			System.out.println("en buyuk sayı"+enbuyuk);
		}

	}

}

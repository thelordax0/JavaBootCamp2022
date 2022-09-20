package miniProjeAsalSayı;

public class Main {

	public static void main(String[] args) {

		int number=25;
		
		//number ın 2 ye bölümünden kalan
		int remainder=number%2;
		
		boolean isPrime=true;
		
		if(number==1) {
			System.out.println("asal değildir");
			//şuanda bulunduğumuz main methodunu bitirir.
			return;
		}
		
		if(number<1) {
			System.out.println("geçersiz sayı");
		}
		
		for(int i=2;i<number;i++) {
			if(number %i==0) {
				isPrime=false;
			}
		}
		
		if(isPrime) {
			System.out.println("sayı asaldır");
		}else {
			System.out.println("sayı asal değildir");
		}

	}

}

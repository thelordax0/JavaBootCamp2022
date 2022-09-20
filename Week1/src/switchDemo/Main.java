package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("mükemmel geçtiniz");
			break;
		case 'B':
			System.out.println("Çok güzel geçtin dostum");
			break;
		case 'C':
			System.out.println("iyi geçtiniz");
			break;
		case 'D':
			System.out.println("Fena değil geçtiniz");
			break;
		case 'F':
			System.out.println("Geçemediniz");
			break;
		default:
			System.out.println("geçersiz not girdiniz");
		}

	}

}

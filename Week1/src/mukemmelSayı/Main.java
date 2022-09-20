package mukemmelSayı;

public class Main {

	public static void main(String[] args) {
		int number = 28;
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				// bölendir
				sum += i;
			} else {
				// bölen değildir
			}
		}

		if (sum == number) {
			System.out.println("mük sayı");
		} else {
			System.out.println("mük sayı değil");
		}

	}

}

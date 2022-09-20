package sayıBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayılar = { 1, 2, 5, 7, 9, 0 };
		int aranacak = 55;
		boolean varmı = false;

		for (int sayı : sayılar) {
			if (sayı == aranacak) {
				varmı = true;
				break;
			}
		}

		if (varmı) {
			System.out.println("sayı var");
		} else {
			System.out.println("sayı yok");
		}
	}

}

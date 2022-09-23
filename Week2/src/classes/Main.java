package classes;

import java.io.PrintStream;

public class Main {

	public static void main(String[] args) {
		// Classların temel görevi gruplama yapmaktr.
		// Bir class ın çağırımı böyle yapılır
		// CustomerManager türünde bellekte bir değişken atadık
		// Classlar referans tiptir

		CustomerManager customerManager = new CustomerManager();
		customerManager.add();
		customerManager.remove();
		customerManager.update();

		// int byte gibi değişkenler value type tır.

		int sayı1 = 10;
		int sayı2 = 20;
		sayı2 = sayı1;
		sayı1 = 30;
		// >>>10
		System.out.println(sayı2);

		// Diziler referans tiptir int byte String olmasının bir önemi yoktur.

		int[] sayılar1 = new int[] { 1, 2, 3 };
		int[] sayılar2 = new int[] { 4, 5, 6 };
		sayılar2 = sayılar1;
		sayılar1[0] = 10;
		// >>>10
		System.out.println(sayılar2[0]);

	}

}

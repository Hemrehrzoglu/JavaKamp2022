package loopDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		// For döngüsü

		for (int i = 1; i <= 10; i++) {
			System.out.println("Sayı : " + i);

		}
		System.out.println("---------------------------------------------------------------------");

		// While döngüsü

		int a = 1;

		while (a <= 5) {
			System.out.println("a şuanda : " + a);
			a++;

		}
		System.out.println("---------------------------------------------------------------------");
		
		//Do - While döngüsü
		int b = 1;
		do {
			System.out.println("Ben hertürlü çalışırım " + b);
			b++;

		} while (b < 5); //b < 0 yaparsak sadece do içindeki blok bir kere çalışır

	}

}

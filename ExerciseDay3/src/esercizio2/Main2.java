package esercizio2;

import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
		int range[] = generaArray(3000);
		for (int i = 0; i < range.length; i++) {
			System.out.println(range[i] + "cose");
		}

		MultiTread th1 = new MultiTread(range, 0, 1000);
		MultiTread th2 = new MultiTread(range, 1000, 2000);
		MultiTread th3 = new MultiTread(range, 2000, 3000);

		th1.start();
		th2.start();
		th3.start();

		int somma = th1.getSum() + th3.getSum() + th2.getSum();
		System.out.println(somma + "somma dei threads");

		try {
			th1.join();
			th2.join();
			th3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int sum = 0;
		for (int i = 0; i < range.length; i++) {
			sum += range[i];
			System.out.println(sum + "conto totale");
		}

	}

	private static int[] generaArray(int n) {
		int[] range = new int[n]; // crea l ’ array da restituire
		Random rng = new Random(); // oggetto " random number generator "
		for (int i = 0; i < n; i++)
			range[i] = rng.nextInt(3000); // genera gli elementi
		return range;
	}

}

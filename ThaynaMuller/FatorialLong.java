package exercicioCinco;

public class FatorialLong {

	public static void main(String[] args) {
		long fatorial = 1;

		System.out.println("Fatorial de 0 = 1");

		for (long i = 1; i <= 30; i++) {

			fatorial *= i;

			System.out.println("Fatorial de " + i + " = " + fatorial);

		}
	}

}

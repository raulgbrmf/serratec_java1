package caelum;

public class ex05 {

	public static void main(String[] args) {

		long fatorial = 1;
		for (long n = 1; n <= 20; n++) {
			fatorial *= n;
			System.out.println("Fatorial de " + n + " é: " + fatorial);
		}
	}
}



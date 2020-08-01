package caelum;

public class ex04 {

	public static void main(String[] args) {

		int fatorial = 1;
		System.out.println("Fatorial de 0 é = 1");
		for (int n = 1; n <= 10; n++) {
			fatorial *= n;
			System.out.println("Fatorial de " + n + " é (" + (n - 1) + "!) = " + fatorial);
		}
	}
}

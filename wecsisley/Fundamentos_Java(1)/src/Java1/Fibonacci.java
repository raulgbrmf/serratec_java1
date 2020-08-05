package Java1;

public class Fibonacci {
	public static void main(String[] args) {

		int indice = 8;
		int fib = fibonacci(indice);

		System.out.println("Fib de " + indice + " vale " + fib);
	}

	static int fibonacci(int i) {
		if (i == 0) {
			return 0;
		} else if (i == 1) {
			return 1;
		} else {
			return fibonacci(i - 2) + fibonacci(i - 1);
		}
	}
}

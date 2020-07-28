package exercicios;

public class Exercicio6 {

	public static void main(String[] args) {
		int fibonacci = 0, anterior = 0;

		for (int i = 0; i <= 10; i++) {

			if (i == 1) {
				fibonacci = 1;
				anterior = 0;

			} else {
				fibonacci += anterior;
				anterior = fibonacci - anterior;
			}
			System.out.print(fibonacci + " ");

		}
	}

}

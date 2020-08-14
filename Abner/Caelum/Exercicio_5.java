
public class Exercicio_5 {

	public static void main(String[] args) {

		long fat = 1;

		System.out.println("O fatorial de 0 é : 1");

		for (int i = 1; i <= 20; i++) {
			fat = fat * i;
			System.out.println("O fatorial de " + i + " é (" + (i - 1) + "!) * " + i + " = " + fat);
		}
	}
}

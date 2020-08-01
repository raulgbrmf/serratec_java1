package exercicios;

public class apost_exercicio_05 {

	public static void main(String[] args) {
		
		long fatorial = 1;
		
		for (int i = 1; i <= 30; i++) {
			fatorial = fatorial * i;
			System.out.println("O fatorial de " + i + "! é: " + fatorial);
		}

	}

}

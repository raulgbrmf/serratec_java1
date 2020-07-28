package exercicios;

public class Exercicio5 {

	public static void main(String[] args) {
		long fatorial =1;
		
		for (long i = 1; i <=20; i++) {
			
			fatorial = fatorial * i;
			System.out.println("O fatorial de "+i+" é: "+ fatorial);
			
		}
	}

}

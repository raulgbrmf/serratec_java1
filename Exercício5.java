
public class Exercício5 {

	public static void main(String[] args) {
		long num;//usando long pois é o tipo que consegue armazenar até trilhões no java
		long fatorial = 1;
		
		//fazendo o fatorial de 1 até 40
		for(num = 1; num <= 40; num++) {
			fatorial = fatorial * num;
			System.out.println("O fatorial de " + num + " é (" +(num-1)+"!) * "+num+" = "+fatorial);
		}


	}

}

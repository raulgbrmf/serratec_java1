
public class Exerc�cio5 {

	public static void main(String[] args) {
		long num;//usando long pois � o tipo que consegue armazenar at� trilh�es no java
		long fatorial = 1;
		
		//fazendo o fatorial de 1 at� 40
		for(num = 1; num <= 40; num++) {
			fatorial = fatorial * num;
			System.out.println("O fatorial de " + num + " � (" +(num-1)+"!) * "+num+" = "+fatorial);
		}


	}

}

package Java1;

public class SomaDe1Ate1000 {
	public static void main(String[] args) {
		
		int numeroFinal = 1000; 
		int soma = 0;
		
		for(int numeroInicial = 1; numeroInicial <= numeroFinal; numeroInicial++) {
			soma += numeroInicial;
		}
		System.out.print("A soma dos números de 1 até 100 é: " + soma);
	}

}

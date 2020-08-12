package br.com.caelum.contas;

public class TestaSplit {

	public static void main(String[] args) {
		
		String frase = "Uma mensagem qualquer.";
		String[] palavras = frase.split(" ");
		
		//usando split para escrever do jeito normal
		
		for(String x : palavras) {
			System.out.println(x);
		}
		//usando split para escrever na ordem inversa
		for(int i = palavras.length - 1; i >= 0; i-- ) {
			System.out.print(palavras[i] + " ");
		}

	

	}

}

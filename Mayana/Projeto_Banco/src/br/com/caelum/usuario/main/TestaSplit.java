package br.com.caelum.usuario.main;

public class TestaSplit {

	public static void main(String[] args) {
		
		String frase = "Uma mensagem qualquer";
		String[] palavras = frase.split(" ");
		
		/*for(String x : palavras) {
			System.out.println(x);
		}*/
		
		for(int i = palavras.length - 1; i >= 0; i-- ) {
			System.out.print(palavras[i] + " ");
		}

	}

}

// Exercício - 3.

public class TestaSplit {

	public static void main(String[] args) {

		String frase = "Uma mensagem qualquer";
		String[] palavras = frase.split(" ");
		for (int i = palavras.length; i > 0; i--) {
			System.out.print(palavras[i-1]+ " ");
		}

	}

}

package br.com.g2ac.usuario.main;

public class TestaSplit {

	public static void main(String[] args) {
		
		String frase = "Socorram-me. Subi no ônibus em Marrocos";
		String[] palavras = frase.split(" ");
		
		for(int i = palavras.length; i > 0; i--) {
			System.out.print(palavras[i-1] + " ");
		}

	}
}

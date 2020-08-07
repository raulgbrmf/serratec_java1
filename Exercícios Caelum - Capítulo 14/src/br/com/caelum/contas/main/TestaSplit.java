package br.com.caelum.contas.main;


public class TestaSplit {

	public static void main(String[] args) {
		
		String frase = "Socorram-me, subi no ônibus em Marrocos";
		
		String[] palavras = frase.split(" ");
		
		for(int i=palavras.length-1;i>=0;i--)
			System.out.print(palavras[i]+" ");

	}

}

package br.com.caelum.contas.main;

/* 13.7	EXERCÍCIOS:	JAVA.LANG.STRING */

public class TestaString {

	public static void imprimeLetraPorLinha(String palavra) {
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
	}

	public static void imprimeInverso(String palavra) {
		int ultimaPosicao = palavra.length() - 1;
		for (int i = ultimaPosicao; i >= 0; i--) {
			System.out.print(palavra.charAt(i));
		}
	}

	public static void imprimeInversoBuilder(String frase) {
		int ultimaPosicao = frase.length() - 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < frase.length(); i++) {
			sb.insert(i, frase.charAt(ultimaPosicao));
			ultimaPosicao--;
		}
		System.out.println(sb);
	}

	public static void stringForInt(String x) {
		int digito = 0;
		int numero = 0;
		for (int i = 0; i < x.length(); i++) {
			digito = x.charAt(i) - '0';
			numero = (numero * 10) + digito;
		}
		System.out.println(numero);
	}

	public static void main(String[] args) {
		/* Uma String é imutável */
		String s = "fj11";
		/*
		 * Como fazer para ele imprimir fj22? Criar um novo objeto do tipo
		 * String e atribuir, já que o método replace retorna uma nova String.
		 */
		String s2 = s.replaceAll("1", "2");
		System.out.println(s);
		System.out.println(s2 + "\n");

		String nome = "     Renato     ";

		/* trim() remove os espaços em branco das pontas de uma String */
		String nomeSemEspaco = nome.trim();
		System.out.println(nomeSemEspaco);

		/* length() retorna o tamanho de uma string */
		System.out.println(nomeSemEspaco.length());

		String vazia = "";
		/* equals() compara por valor */
		if (vazia.equals("")) {
			System.out.println("String vazia!\n");
		} else {
			System.out.println("A String não está vazia\n");
		}

		imprimeLetraPorLinha("Renato");

		System.out.println("");

		imprimeInverso("Socorram-me, subi no ônibus em Marrocos");
		System.out.println("\n");
		imprimeInverso("anotaram a data da maratona");

		System.out.println("");

		/*
		 * A classe StringBuilder faz parte do pacote java.lang. Essa classe
		 * permite criar e manipular dados de Strings dinamicamente, ou seja,
		 * podem criar variáveis de String modificáveis.
		 */
		StringBuilder sb = new StringBuilder();
		sb.append("\nRenato ");
		sb.append("é um ");
		sb.append("engenheiro de ");
		sb.append("Software ");

		System.out.println(sb);

		imprimeInversoBuilder("Renato é um engenheiro de Software");
		
		System.out.println("");
		
		/* 13.8 DESAFIO */
		stringForInt("762");

	}

}

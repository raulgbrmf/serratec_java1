/* Desafio 1 - coloquei para compilar*/
public class Teste {
	static int x = 37;

	public static void main(String[] args) {
		/*
		 * Não compila porque não se pode fazer uma referência estática a um
		 * atributo não estático.
		 */
		System.out.println(x);
	}

}

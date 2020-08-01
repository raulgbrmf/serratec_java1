/* No exercício anterior a c1 estava dando diferente da c2 pois comparou o codigo da "variável" */
public class Main {

	public static void main(String[] args) {

		ContaBanco c1 = new ContaBanco();
		
		c1.nome = "Ercules";
		c1.agencia = "Inter";
		c1.numero = 123;
		c1.data = "29/07/2020";
		c1.saldo = 579.43;
		
		ContaBanco c2 = new ContaBanco();
		
		c2 = c1;
		
		if(c1 == c2) {
			System.out.println("Iguais");
		}else {
			System.out.println("Diferentes");
		}
	
	}

}

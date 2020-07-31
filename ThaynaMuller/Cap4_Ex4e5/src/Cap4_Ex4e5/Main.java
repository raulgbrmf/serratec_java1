package Cap4_Ex4e5;

public class Main {

	public static void main(String[] args) {
		
		Conta C1 = new Conta();
		Conta C2 = new Conta();

		C1.setTitular("Thayna");
		C1.setSaldo(1500.00);

		C2.setTitular("Thayna");
		C2.setSaldo(1500.00);

		C1 = C2;

		if (C1 == C2) {
			System.out.println("Contas iguais");
		} else {
			System.out.println("Contas diferentes");
		}

	}
}



// No primeiro caso , sem atribuirmos C1 a C2 (C1=C2) o retorno do if era que as contas eram diferentes
// devido ao seus ids serem diferentes e ocuparem lugares distintos na memória. Já no segundo caso, as duas contas 
// possuem o mesmo valor já que seus atributos são os mesmos, logo ambas são iguais.

	



package ExemplosCap;

public class TestaReferencia {

	public static void main(String[] args) {
		Conta C1 = new Conta();
		Cliente name1 = new Cliente();
		name1.nome = "Maria";
		name1.sobrenome = "Pereira";
		C1.saldo = 227;

		Conta C2 = new Conta();
		Cliente name2 = new Cliente();
		name2.nome = "Joana";
		name2.sobrenome = "Maria";
		C2.saldo = 543;
		
		System.out.println(name1.nome + name1.sobrenome + " " + C1.saldo);
		System.out.println(name2.nome + name2.sobrenome + " " + C2.saldo);
		
		
		System.out.println("Transferencia");
		C1.transfere(C2,100);
		System.out.println(C1.titular.nome + " " + C1.saldo);
		C2.transfere(C1,10);
		System.out.println(C2.titular.nome + " " + C2.saldo);
		
	}

}

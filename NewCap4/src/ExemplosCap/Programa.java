package ExemplosCap;

public class Programa {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		Cliente c = new Cliente();
		
		c.nome = "Maria";
		minhaConta.saldo = 1000;
		
		System.out.println("Nome: " + c.nome);		
		System.out.println("Saldo atual: " + minhaConta.saldo);
	}
}

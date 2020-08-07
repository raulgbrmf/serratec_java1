

public class Main {

	public static void main(String[] args) {
		
		Conta conta = new Conta(); // Erro previsto com a mudança ocorrida.
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		conta.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		
		
	}
}
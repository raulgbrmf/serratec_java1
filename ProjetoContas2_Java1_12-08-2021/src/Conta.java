public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	static int qtdcontas = 0;
	
	public Conta(String pTitular) {
		this.titular = pTitular;
		qtdcontas++;
		this.numero = qtdcontas;
		this.saldo = 0;

	}
	
	public void DadosBancarios() {
		System.out.println("");
		System.out.println("--Dados Bancarios --");
		System.out.println("- Operação: " + this.numero);
		System.out.println("- Titular: "  + this.titular);
		System.out.println("- Saldo: "    + this.saldo);
		System.out.println("---Fim Dados Bancarios---");
		System.out.println("");
	}
	
	
	public void Depositar(double pValor) {
		System.out.println("");
		System.out.println("--- Realizando Deposito---");
		System.out.println("- Saldo Anterior: " + this.saldo);
		
		this.saldo += pValor;
		
		System.out.println("- Saldo Posterior: " + this.saldo);
		System.out.println("---Fim do Deposito---");
		System.out.println("");
				
	}
	
	
	public void Sacar(double pValor) {
		System.out.println("");
		System.out.println("--- Realizando Saque---");
		System.out.println("- Saldo Anterior: " + this.saldo);
		
		if(pValor <= this.saldo) {
			this.saldo -= pValor;
			System.out.println("- Saldo Posterior: " + this.saldo);
		} else {
			System.out.println("- Saldo Insuficiente");
		}
				
		System.out.println("---Fim do Saque---");
		System.out.println("");
	}
	
	
	public void Transferir(Conta pDestino, double pValor) {
		System.out.println("");
		System.out.println("--- Realizando Transferencia---");
		System.out.println("- Saldo Anterior Origem: "  + this.saldo);
		System.out.println("- Saldo Anterior Destino: " + pDestino.saldo);
		
		if(pValor <= this.saldo) {
			this.saldo -= pValor;		//debitando da conta de origem
			pDestino.saldo += pValor;		//creditando o valor na conta de destino
			System.out.println("- Saldo Posterior Origem: "  + this.saldo);
			System.out.println("- Saldo Posterior Destino: " + pDestino.saldo);
		} else {
			System.out.println("- Saldo Insuficiente");
		}
				
		System.out.println("--- Fim da Transferencia ---");
		System.out.println("");
	}

}

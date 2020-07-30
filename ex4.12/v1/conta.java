package guilherme;

public class conta {

	String titular;
	int numeroDaConta;
	String agencia;
	double saldo;
	String dataDeAbertura;

	conta() {
		this.saldo = 0;
	}

	// método saque

	void saca(double valor) {
		
		if (valor > this.saldo) {
			System.out.println("Operação inválida");
		}
		
		this.saldo -= valor;
		System.out.println("Saque realizado. Seu saldo atual é: " + this.saldo);
	}

	// método depósito

	void deposita(double valor) {
		
		if(valor <= 0 ) {
			System.out.println("Operação inválida");
		} 
		
		this.saldo += valor;
		System.out.println("Depósito efetuado. Seu saldo atual é: " + this.saldo);
		
	}

	// meodo para calcular rendimento mensal, que não recebe parâmetro algum e devolve o
	// valor do saldo multiplicado
	// por 0.1

//	public double calculaRendimento() {
//			double rendimento = 0.0;
//			if (this.saldo > 0) {
//				this.saldo *= 1.1;
//				return rendimento;
//				
//			}
//			
//	}

	//metodo para transferencia, q recebe uma conta e um valor
	
//	void transfere(conta destino, double valor) {
//
//		try {
//
//		} catch (Exception e) {
//			System.out.println("Saldo insuficiente");
//			return;
//		}
//
//		if (valor > this.saldo) {
//			System.out.println("Saldo insuficiente");
//			return;
//		}
//
//	}

}

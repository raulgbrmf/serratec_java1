package java3;

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

	
	@Override
	public String toString() {
	return ("Titular = " + titular + "\nNúmero da Conta = " + numeroDaConta + "\nAgência = " + agencia);
	}
	
}

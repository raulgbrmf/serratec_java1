class Conta02 {
	
	int numero;
	String titular;
	String agencia;
	String dataDeAbertura;
	double saldo;
	
	boolean saca(double valor) {
		if (this.saldo < valor) {
			System.out.println("Saldo insulficiente!");
			return false;

		}
		else{
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
			
		}
	}

	void deposita(double valor) {
		double novoSaldo = this.saldo + valor;
		this.saldo = novoSaldo;
		//System.out.print(this.saldo);
		
	}

	double calculaRendimento() {
		double novoSaldo = this.saldo * 0.1;
		this.saldo = novoSaldo;
		return this.saldo;
		
	}
}
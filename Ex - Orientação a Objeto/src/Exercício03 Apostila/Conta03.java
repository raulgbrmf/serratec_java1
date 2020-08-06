class Conta03 {
	
	String titular;
	String agencia;
	String numero_da_conta;
	String dataDeAbertura;
	double saldo;
	
	double calculaRendimento() {
		double novoSaldo = this.saldo * 0.1;
		this.saldo = novoSaldo;
		return this.saldo;
		
	}
	String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nAgência: " + this.agencia;
		dados += "\nConta: " + this.numero_da_conta;
		dados += "\nData de Abertura: " + this.dataDeAbertura;
		dados += "\nSaldo: " + this.saldo;
		this.calculaRendimento();
		return	dados;
	}
}

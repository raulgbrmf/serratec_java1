package Banco;

public class Conta {

	String titular;
	int numero;
	String agencia;
	double saldo;
	String dataAbertura;
	
	void saca(double valor){
		saldo = this.saldo - valor;
	}
	
	void deposita(double valor) {
		saldo = this.saldo + valor;
	}
	
	double calculaRendimento() {
		return this.saldo * 0.1;
	}
	
}

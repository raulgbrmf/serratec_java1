package caelumPage65;

public class Conta {

	String titular;
	int numero;
	String agencia;
	double saldo;
	Data dataAbertura; //Modificado no exercício 7

	void saque(double valor) {
		if (saldo >= valor) {
			this.saldo += -valor;
		} else {
			System.out.print("Saque indisponível!");
		}
	}

	void deposito(double valor) {
		this.saldo += valor;
	}

	double calcRendimento() {
		if (this.saldo != 0) {
			return this.saldo * 0.1;
		} else {
			System.out.print("Não possui saldo");
			return 0;
		}
	}

	String extratoBancario() {
		return "Informações sobre a conta" 
				+ "\nTitular: " + this.titular 
				+ "\nNúmero: " + this.numero
				+ "\nAgencia: " + this.agencia 
				+ "\nSaldo: R$ " + this.saldo 
				+ "\nData de Abertura: " + this.dataAbertura 
				+ "\nRendimento Mensal: R$ " + calcRendimento()
				+ "\nCliente desde: " + this.dataAbertura.retornarData()
				+ "\n\n";
	}
}

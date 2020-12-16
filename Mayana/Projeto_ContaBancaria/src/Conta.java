
public class Conta {

	int numero;
	String agencia;
	String titular;
	double saldo;
	Data data_abertura;

	boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}

	}

	boolean transfere(Conta destino, double valor) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}

	}

	void deposita(double quantia) {
		this.saldo = this.saldo + quantia;
	}
	
	String recuperaDadosImpressao() {
		return "Nome do Titular: " + this.titular + "\nAgência: " + this.agencia + "\nNúmero da Conta: " + this.numero
				+ "\nSaldo Atual: R$" + this.saldo + "\nRendimento Mensal: R$" + calculaRendimento() + "\nData de Abertura: " + this.data_abertura.imprimeData();
	}

	double calculaRendimento() {
		return this.saldo * 0.1;
	}

	

}
package Banco;

public class Conta {

	String titular;
	int numero;
	String agencia;
	double saldo;
	Data dataAbertura;

	void saca(double valor) {
		saldo = this.saldo - valor;
	}

	void deposita(double valor) {
		saldo = this.saldo + valor; //     ---- Exercicios cap.4 num 1 e 2*/
	}

	double calculaRendimento() {
		return this.saldo * 0.1;
	}

	String recuperaDadosParaImpressao() {// ---Exercicios cap.4 num 3
		
		return "Titular: "+this.titular+
				"\nAngeica: "+this.agencia+
				"\nNº Conta: "+this.numero+
				"\nData Abertura de Conta: "+this.dataAbertura.imprimeData()+
				"\nSaldo Atual: "+this.saldo;
		
		
		
	}

}

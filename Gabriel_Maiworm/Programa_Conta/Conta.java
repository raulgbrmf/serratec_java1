
public class Conta {
	int numero;
	String titular;
	String agencia;
	String data_abertura;
	double saldo;

	void saca (double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	void deposita(double valor) {
		double novoSaldo = this.saldo + valor;
		this.saldo = novoSaldo;
		
	}
	void rendimento() {
		double novoSaldo = this.saldo * 0.1;
		this.saldo = novoSaldo;
	}
	String impressao() {
		String dados = "Titular: "+ this.titular;
		dados += "\nNumero: "+ this.numero;
		dados += "\nAgência: "+ this.agencia;
		dados += "\nData-Abertura: "+ this.data_abertura;
		dados += "\nSaldo: R$"+ this.saldo;
		return dados;
	}
}

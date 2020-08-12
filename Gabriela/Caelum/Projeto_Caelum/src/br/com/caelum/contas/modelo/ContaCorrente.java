	package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public String getTipo() {
		return "Conta Corrente";
	}
	
	public	double	getValorImposto() {
		return this.getSaldo()	*	0.01;
	}

	
	/*public void saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - (valor + 0.10);
			
		}
	}
	
	/*public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}*/
}


public class Conta {
	
	int numero;
	String nomeTitular;
	String agencia;
	Data dataDeAbertura;
	double saldo;
	
	void saca(double saque) {
		if(this.saldo >= saque) {
			this.saldo = this.saldo - saque;
			System.out.println("O valor do saque foi: " + saque + ".");
		}
		else {
			System.out.println("O saldo não é suficiente para realizar esta transação.");
		}
	}
	
	void deposita(double deposito) {
		this.saldo = this.saldo + deposito;
		System.out.println("O valor depositado foi: " + deposito + ".");
	}
	
	void calculaRendimento() {
		this.saldo = this.saldo*0.1;
		System.out.println("O rendimento atual é de: " + saldo);
	}
	
	String recuperaDados() {
		String dados = "Titular: " +this.nomeTitular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo atual: " + this.saldo;
		dados += "\nData: " + this.dataDeAbertura.dataFormatada();
		
		return dados;
	}
	
}



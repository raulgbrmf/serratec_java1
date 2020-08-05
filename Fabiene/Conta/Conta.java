package experimento_aula;

public class Conta {
	int numero;
	String titular;
	double saldo;
	String agencia;
	Data dataAbertura = new Data(); //Exerc�cio 6 p�gina 57
	
	//Exerc�cio 2 p�gina 55
	void saca(double quantidade) { 
		if (this.saldo>=quantidade) {
			double novoSaldo = this.saldo - quantidade;
			this.saldo = novoSaldo;
			
			System.out.println("O valor resgatado foi de "+quantidade);
			System.out.println("Seu novo saldo �: "+this.saldo+"\n");
		}else {
			System.out.println("Saldo insuficiente!!!");
		}	
	}
	
	//Exerc�cio 2 p�gina 55
	void deposita(double quantidade) {
		double novoSaldo = this.saldo + quantidade;
		this.saldo = novoSaldo;
		
		System.out.println("O valor depositado foi de "+quantidade);
		System.out.println("Seu novo saldo �: "+this.saldo+"\n");
	}
	
	//Exerc�cio apostila Raul
	void transfere(Conta destino, double valor) {
		if(this.saldo>=valor) {
			this.saca(valor);
			destino.deposita(valor);
			
			System.out.println("O valor transferido da conta de "+this.titular+" foi de "+valor);
			System.out.println("O saldo de "+destino.titular+" � agora de "+destino.saldo);
		}
	}
	
	//Exerc�cio 2 p�gina 55
	double calculaRendimento() {
		double novoSaldo = this.saldo+(this.saldo*0.1);
		this.saldo = novoSaldo;
		return this.saldo;
	}
	
	/*Exerc�cio 3 p�gina 56
	String recuperaDadosParaImpressao () {
		String dados = "Titular: "+ this.titular;
		dados += "\nAg�ncia: " + this.agencia;
		dados += "\nConta: " + this.numero;
		dados += "\nData de Abertura: "	+ this.dataAbertura;
		dados += "\nSaldo da conta: " + this.saldo;
		return dados;	
	}*/
	
	
	/*Exerc�cio 7 p�gina 58. Se chamarmos o m�todo antes de atribuir data 
	 * ter� como sa�da dia=0 m�s= 0 e ano =0
	 
	String recuperaDadosParaImpressao () {
		String dados = "Titular: "+ this.titular;
		dados += "\nDia: " + this.dataAbertura.dia;
		dados += "\nM�s: " + this.dataAbertura.mes;
		dados += "\nAno: "	+ this.dataAbertura.ano;
		return dados;	
	}*/
	
	
	//Exerc�cio 9 p�gina 58
	String recuperaDadosParaImpressao () {
		String dados = "Titular: "+ this.titular;
		dados += "\nData de abertura da conta: "+this.dataAbertura.dia +"/";
		dados += this.dataAbertura.mes +"/";
		dados += this.dataAbertura.ano;
		return dados;	
	}

}

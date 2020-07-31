package experimento_aula;

public class Conta {
	int numero;
	String titular;
	double saldo;
	String agencia;
	Data dataAbertura = new Data(); //Exercício 6 página 57
	
	//Exercício 2 página 55
	void saca(double quantidade) { 
		if (this.saldo>=quantidade) {
			double novoSaldo = this.saldo - quantidade;
			this.saldo = novoSaldo;
			
			System.out.println("O valor resgatado foi de "+quantidade);
			System.out.println("Seu novo saldo é: "+this.saldo+"\n");
		}else {
			System.out.println("Saldo insuficiente!!!");
		}	
	}
	
	//Exercício 2 página 55
	void deposita(double quantidade) {
		double novoSaldo = this.saldo + quantidade;
		this.saldo = novoSaldo;
		
		System.out.println("O valor depositado foi de "+quantidade);
		System.out.println("Seu novo saldo é: "+this.saldo+"\n");
	}
	
	//Exercício apostila Raul
	void transfere(Conta destino, double valor) {
		if(this.saldo>=valor) {
			this.saca(valor);
			destino.deposita(valor);
			
			System.out.println("O valor transferido da conta de "+this.titular+" foi de "+valor);
			System.out.println("O saldo de "+destino.titular+" é agora de "+destino.saldo);
		}
	}
	
	//Exercício 2 página 55
	double calculaRendimento() {
		double novoSaldo = this.saldo+(this.saldo*0.1);
		this.saldo = novoSaldo;
		return this.saldo;
	}
	
	/*Exercício 3 página 56
	String recuperaDadosParaImpressao () {
		String dados = "Titular: "+ this.titular;
		dados += "\nAgência: " + this.agencia;
		dados += "\nConta: " + this.numero;
		dados += "\nData de Abertura: "	+ this.dataAbertura;
		dados += "\nSaldo da conta: " + this.saldo;
		return dados;	
	}*/
	
	
	/*Exercício 7 página 58. Se chamarmos o método antes de atribuir data 
	 * terá como saída dia=0 mês= 0 e ano =0
	 
	String recuperaDadosParaImpressao () {
		String dados = "Titular: "+ this.titular;
		dados += "\nDia: " + this.dataAbertura.dia;
		dados += "\nMês: " + this.dataAbertura.mes;
		dados += "\nAno: "	+ this.dataAbertura.ano;
		return dados;	
	}*/
	
	
	//Exercício 9 página 58
	String recuperaDadosParaImpressao () {
		String dados = "Titular: "+ this.titular;
		dados += "\nData de abertura da conta: "+this.dataAbertura.dia +"/";
		dados += this.dataAbertura.mes +"/";
		dados += this.dataAbertura.ano;
		return dados;	
	}

}

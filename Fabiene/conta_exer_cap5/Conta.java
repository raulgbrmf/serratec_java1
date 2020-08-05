package conta_exer_cap5;

public class Conta {
	int numero;
	private String titular; //Exerc�cio 1 p�gina 75 Com private fica imposs�vel acessar a vari�vel diretamente pela main
	private double saldo;
	String agencia;
	Data dataAbertura = new Data();
	
	//Exerc�cio 2 p�gina 76
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular=titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
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
	
	
	void deposita(double quantidade) {
		double novoSaldo = this.saldo + quantidade;
		this.saldo = novoSaldo;
		
		System.out.println("O valor depositado foi de "+quantidade);
		System.out.println("Seu novo saldo �: "+this.saldo+"\n");
	}
	
	
	void transfere(Conta destino, double valor) {
		if(this.saldo>=valor) {
			this.saca(valor);
			destino.deposita(valor);
			
			System.out.println("O valor transferido da conta de "+this.titular+" foi de "+valor);
			System.out.println("O saldo de "+destino.titular+" � agora de "+destino.saldo);
		}
	}
	
	//Exerc�cio 2 p�gina 76
	double getcalculaRendimento() {
		double novoSaldo = this.saldo+(this.saldo*0.1);
		this.saldo = novoSaldo;
		return this.saldo;
	}
	
	
	
	String recuperaDadosParaImpressao () {
		String dados = "Titular: "+ this.titular;
		dados += "\nData de abertura da conta: "+this.dataAbertura.dia +"/";
		dados += this.dataAbertura.mes +"/";
		dados += this.dataAbertura.ano;
		return dados;	
	}

}



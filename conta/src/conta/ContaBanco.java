//Cada pessoa cria uma conta: corrente ou poupanca
//quem cria uma conta corrente recebe 50.00
//quem cria uma conta poupanca recebe 150.00
//a conta possui as funcoes: abrir conta, fechar conta, sacar, depositar, pagar mesalidade, veirificar status
//para fechar uma conta nao pode ter dinheiro na conta, nao pode ter debito
//para sacar conta tem que estar aberta e ter a quantidade de dinheiro suficiente para o sacque na conta
//mesalidade conta corrente custa 12.00, mesalidade conta poupanca custa 20.00
package conta;

public class ContaBanco {
	// ATRIBUTOS
	public int numConta;
	protected String tipo; 			//tipo da conta:CC ou CP
	private String titular;
	private float saldo;
	private boolean status;			// conta aberta ou fechada
	
	//METODO PARA ABRIR CONTA
	public void estadoAtual() {
		System.out.println("________________________________________");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Titular: " + this.getTitular());
		System.out.println("Saldo: R$" + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
		System.out.println("________________________________________");
	}
	public void abrirConta (String t) {
		this.setTipo(t);
		this.setStatus(true);
		if ( t == "CC" ) {
			this.setSaldo(50);
		} else if ( t == "CP" ){
			this.setSaldo(150);
		} else {
			System.out.println("Erro! Escolha um tipo de conta.");
		}
		System.out.println("Conta " + getTitular() + " aberta com sucesso!");
	}
	
	//METODO PARA FECHAR CONTA
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada porque ainda há dinheiro na conta " + this.getTitular());
		} else if(this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada pois consta débito na conta " + this.getTitular());
		} else {
			this.setStatus(false);
			System.out.println("Conta " + getTitular() + " fechada com sucesso!");
		}
	}
	
	//METODO PARA DEPOSITAR NA CONTA
	public void depositar (float v){
		if(this.getStatus()){
			//this.saldo = this.saldo + v;
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito de R$" + v + " realizado com sucesso na conta de " + this.getTitular());
		} else {
			System.out.println("Impossível realizar o depósito.");
		}
	}
	
	//METODO PARA SACAR
	public void sacar (float v){
		if(this.getStatus()){
			if(this.getSaldo() >= v) {
				this.setSaldo((this.getSaldo() - v));
				System.out.println("Saque de R$"+ v +" realizado na conta de " + this.getTitular());
			} else {
				System.out.println("Saldo na conta " + this.getTitular() + " insuficiente para saque.");
			}
		} else {
			System.out.println("Impossível sacar an conta " + this.getTitular());
		}
	}
	
	//METODO PARA PAGAR MESALIDADE
	public void pagarMensal(){			//mesalidade para manter a conta aberta
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + getTitular());
		} else {
			System.out.println("Impossível pagar uma conta fechada.");
		}
	}
	
	//GETTERS AND SETTERS
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
		
	}

	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}


}

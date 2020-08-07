package br.com.caelum.contas.modelo;

public abstract class Conta {
	
	protected static int IDcount=0;
	protected int id;
	protected int numero;
	protected String titular,agencia;
	protected double saldo;
	protected Data dataabertura;
	
	public Conta() {
		//Construtor sem argumentos
		Conta.IDcount++;
		this.id=IDcount;
	}
	
	public Conta(String titular) {
		//Construtor com titular.
		this.titular=titular;
		Conta.IDcount++;
		this.id=IDcount;
	}
	
	public abstract void saca(double quantidade);
	
	/*public void saca(double quantidade) {
		
		if(this.saldo < quantidade)
			System.out.println("Saldo insuficiente.");
		
		else{
			double novoSaldo = this.saldo - quantidade;
			this.saldo = novoSaldo;
			}
		
		}*/
	
	
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", agencia=" + agencia + ", saldo=" + saldo + "]";
	}

	public void deposita(double quantidade) {
		if(quantidade<0)
			throw new IllegalArgumentException("Você tentou depositar um valor negativo.");
		else {
			double novoSaldo = this.saldo + quantidade;
			this.saldo = novoSaldo;
		}
	}
	
	public double getRendimento() {
		
		return this.saldo*0.1;
	}
	
	public String recuperaDadosParaImpressao() {
		
		return "Conta [numero= " + numero + ", titular= " + titular + ", agencia= " + 
		 agencia + ", Data de abertura= "+ dataabertura.formatada() +", saldo= " + saldo + "]";
		
	}

	
	public int getNumero() {
		return this.numero;
	}
	

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

	public String getTitular() {
		return this.titular;
	}
	

	public void setTitular(String titular) {
		this.titular = titular;
	}
	

	public String getAgencia() {
		return this.agencia;
	}
	

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	

	public double getSaldo() {
		return this.saldo;
	}
	

	public Data getDataabertura() {
		return this.dataabertura;
	}
	

	public void setDataabertura(Data dataabertura) {
		this.dataabertura = dataabertura;
	}
	
	public int getId() {
		return this.id;
	}
	
	//public abstract String getTipo() ;
	
	public String getTipo() {
		return "Conta";
	}
	

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
}

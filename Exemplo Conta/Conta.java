package encapsulamento;

public class Conta {
	
	private static int IDcount=0;
	private int id;
	private int numero;
	private String titular,agencia;
	private double saldo;
	private Data dataabertura;
	
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
	
	boolean saca(double quantidade) {
		
		if(this.saldo < quantidade)
			return false;
		
		else{
			double novoSaldo = this.saldo - quantidade;
			this.saldo = novoSaldo;
			return true;
			}
		
		}
	
	void deposita(double quantidade) {
		
		double novoSaldo = this.saldo + quantidade;
		this.saldo = novoSaldo;
	}
	
	double getRendimento() {
		
		return this.saldo*0.1;
	}
	
	String recuperaDadosParaImpressao() {
		
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
	
	

}

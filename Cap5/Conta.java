
public class Conta {
	
	private String titular;  
	private int numero; 
	private String agencia; 
	private double saldo = 2000; //apenas para as operacoes serem feitas.
	private String dataDeAbertura;
	private double rendimento;
	
	
		//Construtor
	
		public Conta() {
			
		}
		
		public Conta(String titular) {
			this.titular = titular;
		}
	
	
	
		//Titular
	
		public String getTitular() {
			return this.titular;
		}
		/*public void setTitular(String titular) { //Estou passando o nome do titular pelo construtor.
			this.titular = titular;
		}*/
		
		//Numero
		
		public int getNumero() {
			return this.numero;
		}
		
		//Agencia
		
		public String getAgencia() {
			return this.agencia;
		}
		
		//Saldo
		
		public double getSaldo() {
			return this.saldo;
			
		}
		
		//Data de abertura
		
		public String getDataDeAbertura() {
			return this.dataDeAbertura;
		}
		
		//Rendimento
		
		public double getCalculoRendimento(){
			
			rendimento = this.saldo * 0.1;
			return rendimento;

		}
	
	//OPERACOES
		
		void saca (double valor) {
		
		if (this.saldo >= valor) {
			System.out.println("Voce sacou R$ " + valor);
			this.saldo = this.saldo - valor;
			System.out.println("Seu saldo agora e de R$ " + this.saldo);
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	
	}
		void deposita (double valor) {
			
			if (valor > 0 ) {
				System.out.println("Voce depositou R$ " + valor);
				this.saldo = this.saldo + valor;
				System.out.println("Seu saldo agora e de R$ " + this.saldo);
			}
			
		}
		
}

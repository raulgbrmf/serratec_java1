//Exercicio 1 ) O atributo que recebe PRIVATE nao consegue ser lido. 
//			Aparece,por exemplo, a seguinte mensagem: The field Conta.titular is not visible.
public class Conta {
	
		//private String Titular;
		String Titular;
		private int Numero = 01;
		private String Agencia;
		private double Saldo = 100;
		private String DataAberturaConta = "30/07/2020";
			
		/*
		//TITULAR
		public String getTitular() { return this.Titular; }
		public void setTitular(String Titular) { this.Titular = Titular; }
	
		//NUMERO
		public int getNumero() { return this.Numero; }
		public void setNumero(int Numero) { this.Numero = Numero; }
		
		//AGENCIA
		public String getAgencia() { return this.Agencia; }
		public void setAgencia(String Agencia) { this.Agencia = Agencia; }
		
		//SALDO
		public double getSaldo() { return this.Saldo; }
		public void setSaldo(double Saldo) { this.Saldo = Saldo; }
		
		//DATA DE ABERTURA DE CONTA
		public String getDataAberturaConta() { return this.DataAberturaConta; }
		
		//SACA
		void saca(double valor)
		{
			double novoSaldo = this.Saldo - valor;
			this.Saldo = novoSaldo;
			
			System.out.println("\nSaque: R$" + valor);
			System.out.println("Seu saldo após o saque: R$" + this.Saldo);
			
		}
		
		void deposita(double valor) 
		{
			double novoSaldo = this.Saldo + valor;
			this.Saldo = novoSaldo;
			System.out.println("\nDepósito: R$" + valor);
			System.out.println("Seu saldo após o depósito: R$" + this.Saldo);
			
		}
	*/
		
		//exercicio4
		public Conta() {
			
		}
		public Conta(String Titular) {
			this.Titular = Titular;
		}
}


public class Conta {
	
	//Exerc�cio 1, cap. 5//
		private String titular;
		private int numero;
		private double saldo;
		private String agencia;
		private String datadeabertura;
		 
		
		

		//Exerc�cio 2
		public String getTitular(String titular) {
			return this.titular;
		}
		
		 public int getNumero(int numero) {
			 return this.numero;
		 }
		 
		 public double setSaldo(double saldo) {
			 return this.saldo;
		 }
		 
		 public String getAgencia(String agencia) {
			 return this.agencia;
		 }
		 
		 public String getDatadeAbertura(String datadeabertura) {
			 return this.datadeabertura;
		 }
		 
		 //construtor - Exerc�cio 4 
		 Conta (String titular) {
			 this.titular = titular;
		}
}
		 
		


public class Conta {
	
	//Exercício 1, cap. 5//
		private String titular;
		private int numero;
		private double saldo;
		private String agencia;
		private String datadeabertura;
		 
		
		

		//Exercício 2
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
		 
		 //construtor - Exercício 4 
		 Conta (String titular) {
			 this.titular = titular;
		}
}
		 
		

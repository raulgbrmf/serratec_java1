
public class Conta {

	String titular;
	String datadeabertura;
	String agencia; 
	int numero;
	double saldo;
	
			
	//Exercício 2
	void saca(double valor) {
		double novosaldo = this.saldo - valor;
		this.saldo = novosaldo;
		
		System.out.println("O valor sacado foi:  " + novosaldo);
		
	}
	
	 void deposita(double valor) {
		 double saldonovo = this.saldo + valor;
		 this.saldo = saldonovo;
		 System.out.println("O saldo depois do depósito é: " + saldonovo); 
	 }
	 
	 double calculaRendimento() {
		 return saldo * 0.1;
		 
	 }
	 
	   	//Exercício 3
		String	recuperaDadosParaImpressao() {
			String	dados	=	"Titular:	"	+	this.titular;
			dados	+=	"\nNúmero:	"	+	this.numero;
			this.calculaRendimento();
			return	dados;
				
		}
			
			 
			
			
			

	
	

}

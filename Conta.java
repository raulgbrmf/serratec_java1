
public class Conta {

	String titular;
	String datadeabertura;
	String agencia; 
	int numero;
	double saldo;
	
			
	//Exerc�cio 2
	void saca(double valor) {
		double novosaldo = this.saldo - valor;
		this.saldo = novosaldo;
		
		System.out.println("O valor sacado foi:  " + novosaldo);
		
	}
	
	 void deposita(double valor) {
		 double saldonovo = this.saldo + valor;
		 this.saldo = saldonovo;
		 System.out.println("O saldo depois do dep�sito �: " + saldonovo); 
	 }
	 
	 double calculaRendimento() {
		 return saldo * 0.1;
		 
	 }
	 
	   	//Exerc�cio 3
		String	recuperaDadosParaImpressao() {
			String	dados	=	"Titular:	"	+	this.titular;
			dados	+=	"\nN�mero:	"	+	this.numero;
			this.calculaRendimento();
			return	dados;
				
		}
			
			 
			
			
			

	
	

}

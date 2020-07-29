package experimento_sala;

public class Conta1 {
	
	
		
		String titular;
	    int numero;
	    String agencia;
	    double saldo;
	    String datadeabertura;
	    
	    void saca(double valor)
	    {
	        saldo = saldo-valor;
	    }
	    void deposita(double valor)
	    {
	        saldo = saldo + valor;
	    }
	    void calcularrendimento (double valor)
	    {
	        System.out.println(saldo);
	    }
	   
	     
	  }        

		

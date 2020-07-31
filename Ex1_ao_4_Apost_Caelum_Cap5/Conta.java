
  import java.util.Scanner; 

public class Conta {

	//private String titular;
	String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private String DataAbertura= "01.07.2020";

	
	/*Scanner scanner = new Scanner(System.in);
	
	boolean saca (double quantidade)
	{
		if(this.saldo<quantidade)
		{
			System.out.println("Você não possui saldo suficiente.");
			return false;
			
		}
		else
		{
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
		
		System.out.println ("Saque de R$ " + quantidade + " efetuado. " );
		System.out.println ("Seu novo saldo é: R$ " + this.saldo );
		return true;
		}
	}
	void deposita (double valordeposito)
	{
		System.out.println ( "Qual valor deseja depositar?" );
		
	      	valordeposito = scanner.nextDouble();
	      	
	      double novoSaldo = this.saldo + valordeposito;
	      this.saldo = novoSaldo; 
	      System.out.println ("Depósito de R$ " + valordeposito + " efetuado. " );
	      scanner.close();
	}
	
	*/
	

		//Exercício 2_ Criando getters e setters
		
		//Get titular
	
	/*public String getTitular ()
	{
		return this.titular;
	}
	
		//Get numero
	
	public int getNumero ()
	{
		return this.numero;
	}
	
		// Get agencia
	public String getAgencia ()
	{
		return this.agencia;
	}
	
	 // Get saldo
		public double getSaldo()
		{
			return this.saldo;
		}
		
	// Get Data de Abertura
		
		public String getDataAbertura ()
		{
			return this.DataAbertura;
		}
	   
		// Set titular
		
		public void setTitular (String titular)
		{
			this.titular = titular;
		}
		
		//Set agencia
		
		public void setAgencia ( String agencia)
		{
			this.agencia = agencia;
		}
		
		public void setNumero (int numero)
		{
			this.numero = numero;
		}
		*/
	
	    //Exercício 4
	
	  public Conta ()
	  {
		  
	  }
	  public Conta ( String titular)
	  {
		  this.titular = titular;
	  }
	}
		
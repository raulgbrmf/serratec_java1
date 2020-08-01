
public class Conta2 
{
	private String titular;
	private int numeroConta;
	private String agencia;
	private Data2 dataAbertura;
	private double saldo;
	
	

	public String getTitular()
	{
		return this.titular;
	}
	
	public void setTitular(String titular)
	{
		this.titular = titular;
	}
	
	public int getNumeroConta()
	{
		return this.numeroConta;
	}
	
	public void setNumeroConta(int numeroConta)
	{
		this.numeroConta = numeroConta;
	}
	
	public String getAgencia()
	{
		return this.agencia;
	}
	
	public void setAgencia(String agencia)
	{
		this.agencia = agencia;
	}

	public Data2 getDataAbertura()
	{
		return this.dataAbertura;
	}
	
	public void setDataAbertura(Data2 dataAbertura)
	{
		this.dataAbertura = dataAbertura;
	}
	
	public double getSaldo()
	{
		return this.saldo;
	}
	
	public void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}
	
	
	
	public void saca(double valorSaque)
	{
		if(valorSaque <= this.saldo)
		{
			this.saldo += - valorSaque;
		}
		else
		{
			System.out.print("Não é possível sacar esse valor dessa conta.");
		}
	}
	
	public void deposita(double valorDeposito)
	{
		this.saldo += valorDeposito;
	}
	
	public double calculaRendimento()
	{
		if(this.saldo != 0)
		{
			return this.saldo * 0.1;
		}
		else
		{
			System.out.print("Essa conta não possui saldo.");
			return 0;
		}
	}

	public String recuperaDadosParaImpressao() 
	{
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero da conta: " + this.numeroConta;
		dados += "\nAgência: " + this.agencia;
		dados += "\nData de abertura: " + this.dataAbertura.retornaData();
		dados += "\nSaldo atual: " + this.saldo;
		dados += "\nRendimento mensal: " + calculaRendimento();
		
		return dados;
	}
	
	
}

package Cap5_Exercicios;

public class Conta {
	
	private String Titular;
	private int Numero_conta;
	private int Agencia;
	private double Saldo;
	private double Limite = 1000.00;
	private int Identificador;
	private static int totalDeContas;
	private Data dataDeAbertura = new Data();
	

	public Data getdataDeAbertura() {
		return this.dataDeAbertura;

	}
			
	public Conta() { //Sem o construtor sem argumentos seriamos obrigados a preencher o campo de nome do titular no Main.
		Conta.totalDeContas = Conta.totalDeContas + 1;
		this.Identificador = Conta.totalDeContas;
	}
	
	public Conta(String nome) {
		this.Titular = nome;
		Conta.totalDeContas = Conta.totalDeContas + 1;
		this.Identificador = Conta.totalDeContas;
	}	
		
	public int getIdentificador() {
		return this.Identificador;
	}
	
	public String getTitular() {
		return this.Titular;		
	}
		
	public void setTitular(String Titular) {
		this.Titular = Titular;
	}
	
	public void setNumero_conta(int Numero_conta) {
		this.Numero_conta = Numero_conta;
	}
	
	public void setAgencia(int Agencia) {
		this.Agencia = Agencia;
	}
	
	public double getSaldo() {
		return this.Saldo;
	}
		
	public double getRendimento() {
		return this.Saldo*0.1;
	}
	
	public void Deposito(double Valor) {
		this.Saldo += Valor;		
	}
	
	public int Transferencia(Conta destino , double Valor){
		
		if(this.Saldo < Valor)
			return 100; // Erro de saldo insuficiente
		else if(Valor > this.Limite)
			return 101; // Erro de limite excedido
			else { 
				this.Saldo -= Valor;
				destino.Saldo += Valor;
				return 1; // Operação realizada com sucesso.
			} 
				
					
		}
	
	public String recuperaDadosParaImpressao() {
		String dados = "Titular : " +this.Titular;
		dados += "\nNumero da conta: " +this.Numero_conta;
		dados += "\nNumero da agencia: " +this.Agencia;
		dados += "\nSeu saldo: " + this.Saldo;
		dados += "\nData de abertura da conta: " + Data.getData();

		return dados;

	
	
	
	
	}
}
	
	



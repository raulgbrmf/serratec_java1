package ex09;

public abstract class Conta {
	
	String nome;
	int numeroDaConta;
	int agencia;
	double saldo;
	String tipo;
	
	Conta(String nome, int numeroDaConta, int agencia, String tipo){
		this.nome = nome;
		this.numeroDaConta = numeroDaConta;
		this.agencia = agencia;
		this.saldo = 0.00;
		this.tipo = tipo;
	}
		
	public  String getTipo() {
		return this.tipo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	//não foi possível chamar um método abstrato de dentro de um outro método da própria classe abstrata
	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.nome;
		dados += "\nNúmero: " + this.numeroDaConta;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo: R$" + this.saldo;
		dados += "\nTipo: " + this.getTipo();
		return dados;
		}

//	@Override
//	public String toString() {
//	return ("Titular = " + nome + "\nNúmero da Conta = " + numeroDaConta + "\nTipo = " + tipo +
//			"\nAgência = " + agencia + "\nSaldo = " + saldo);
//	}
	
	public boolean depositar(double valor)
	{
		if (valor < 0) {
			return false;			
		}
		
		this.saldo += valor;
		return true;
	}
	
	public boolean sacar(double valor)
	{
		if(!validarSaldo(valor))
			return false;

			this.saldo -= valor;
			return true;
			
	}

	boolean validarSaldo(double valor)
	{
		if (valor > 0.0 && this.saldo > 0.0 && valor <= this.saldo ) {
			return true;
		}
		else
			return false;
	}

	public boolean transferir(Conta contaDestino, double valor)
	{
		if(!validarSaldo(valor))
			return false;

			this.saldo -= valor;
			contaDestino.saldo += valor;

		return true;
	}	
}

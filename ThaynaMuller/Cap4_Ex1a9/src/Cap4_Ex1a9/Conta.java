package Cap4_Ex1a9;

public class Conta {

	private String NomeTitular;
	private int Num_conta;
	private int Agencia;
	private double saldo;
	private double LimiteDiario;
	private Data dataDeAbertura = new Data();

	public Data getdataDeAbertura() {
		return this.dataDeAbertura;

	}

	public void setdataDeAbertura(Data dataAbertura) {
		this.dataDeAbertura = dataAbertura;
	}

	public String getNomeTitular() {
		return this.NomeTitular;

	}

	public void setNomeTitular(String nome) {
		this.NomeTitular = nome;
	}

	public int getNum_conta() {
		return this.Num_conta;
	}

	public void setNum_conta(int numero) {
		this.Num_conta = numero;

	}

	public int getAgencia() {
		return this.Agencia;
	}

	public void setAgencia(int Agencia) {
		this.Agencia = Agencia;
	}

	public double getSaldo() {
		return this.saldo;

	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteDiario() {
		return this.LimiteDiario;
	}

	public void setLimiteDiario(double LimiteDiario) {
		this.LimiteDiario = LimiteDiario;
	}

	public void sacar(double valor) {

		this.saldo = this.saldo - valor;

	}

	public void depositar(double valor) {

		this.saldo = this.saldo + valor;
	}

	public double calculoRendimento() {

		return this.saldo * 0.1;
	}

	public void transferencia(double valor, Conta destino) {

		if (this.saldo < valor) {
			System.out.println("Saldo indisponivel");
		}

		else if (valor > LimiteDiario) {

			System.out.println("Limite diário excedido");

		} else {

			this.saldo = this.saldo - valor;
			destino.saldo = destino.saldo + valor;

		}
	}

	public String recuperaDadosParaImpressao() {
		String dados = "Titular : " + this.NomeTitular;
		dados += "\nNumero da conta: " + this.Num_conta;
		dados += "\nNumero da agencia: " + this.Agencia;
		dados += "\nSeu saldo: " + this.saldo;
		dados += "\nData de abertura da conta: " + this.dataDeAbertura.DataFormatada();

		return dados;

	}

}







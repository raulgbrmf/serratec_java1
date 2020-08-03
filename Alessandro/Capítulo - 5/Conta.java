/*
/* Exercício - 1. Coloquei o modificador de visibilidade "private" nos atributos e métodos.
/* Depois os retirei dos métodos. Após a criação, não foi possível a leitura ou modificação
/* dos dados privdos.
 */


/* Exercício - 2. Coloquei "getters" e "setters" em todos os objetos, apesar de alguns não
 * precisarem. Fiz para poder treinar e observar o comportamento.
 */

public class Conta {

	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataAbertura;

	/*
	 * Exercício - 5. Atributos adicionados. Não acho que seja necessário um "set",
	 * já que não houve necessidade de mudanças na Main.java.
	 */

	private int idUsuario;
	private static int GeraId;

	public int getId() {
		return this.idUsuario;
	}

	/*
	 * Exercício - 4. O construtor sem argumento, torna opcional a colocação de um
	 * argumento dentro da Main.java.
	 * Com a colocação de um argumento dentro do construtor,
	 * tornou-se necessário a colocação de uma "String" na Main.java, sob pena de
	 * erro.
	 */

	public Conta() {
		Conta.GeraId = Conta.GeraId + 1;
		this.idUsuario = Conta.GeraId;
	}

	public Conta(String titular) {
		Conta.GeraId = Conta.GeraId + 1;
		this.idUsuario = Conta.GeraId;
		this.titular = titular;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String nome) {
		this.titular = nome;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Data getDataAbertura() {
		return this.dataAbertura;
	}

	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public void saca(double valor) {
		if (saldo >= valor) {
			this.saldo = saldo - valor;
		} else {
			System.out.println("Saldo insuficiente para saque.");
		}
	}

	public void deposita(double valor) {
		this.saldo = saldo + valor;
	}

	public double calculaRendimento() {
		if (this.saldo > 0) {
			return this.saldo * 0.1;
		} else {
			System.out.println("Sua conta não possui saldo para receber rendimentos.");
			return 0;
		}

	}

	/*
	 * public String recuperaDadosParaImpressao() { return "Extrato da conta nº: " +
	 * this.numero + "\nTitular: " + this.titular + "\nAgência: " + this.agencia +
	 * "\nSaldo: " + this.saldo + "\nRendimentos : " + this.calculaRendimento() +
	 * "\nData de abertura da conta: " + this.dataAbertura.retornaData();
	 * 
	 * }
	 */

}

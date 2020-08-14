public class Conta {

	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataAbertura;
	private int id_Usuario;
	private static int GeraId;

	public Conta(String titular) {		
		this.id_Usuario = geraId();
		this.titular = titular;
	}

	public Conta() { // Exercicio 4: E necessario pois retira a obrigatoriedade da criacao do objeto
						// com titular		
		this.id_Usuario = geraId();
	}

	public int getId() {
		return this.id_Usuario;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	private int geraId() {
		Conta.GeraId = Conta.GeraId + 1;
		return Conta.GeraId;
	}

	public void saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo += -valor;
		} else {
			System.out.print("Não é possivel realizar o saque");
		}
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void transfere(Conta destino, double valor) {
		saca(valor);

	}

	public double calculaRendimento() {
		if (this.saldo != 0) {
			return this.saldo * 0.1;
		} else {
			System.out.print("Não possui saldo");
			return 0;
		}
	}

	public String recuperaDadosImpressao() {
		return "Dados de extrado: " + "\nTitular: " + this.titular + "\nNumero c/c: " + this.numero + "\nAgencia: "
				+ this.agencia + "\nSaldo: R$ " + this.saldo + "\nRendimento Mensal: R$ " + calculaRendimento()
				+ "\nCliente desde: " + this.dataAbertura.getRetornarData(); // Retorno da string Exercicio 9
	}
}

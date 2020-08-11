package exerciocio_encapsulamento;
public class Conta {
	
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	Data dataAbertura;
	static int identificador = 0;
	int codIdentificador;
	
	
	public Conta () {
		setIdentificador();
			} //Construtor vazio para exercicio 4
	public Conta(String titular) {
		this.titular = titular;
		} // Exercicio 4
	
	
	void saca(double saque) {
		double novosaldo = this.saldo - saque;
		this.saldo = novosaldo;
	}
	
	void deposita(double deposito) {
		double novosaldo = this.saldo + deposito;
		this.saldo = novosaldo;
	}
	
	void calcularRendimento (double Calcularendimento) {
		double novosaldo = this.saldo * 0.1;
		this.saldo = novosaldo;	
	}
	 String recuperaDadosParaImpressao () {
		String dados = "Titular é : " + this.titular; 
		dados += "\nnumero da conta é: " + this.numero;
		dados += "\nAgencia é: " + this.agencia;
		dados += "\nO saldo é: " + this.saldo;
		dados += "\nA data da abertura da conta é: " + this.dataAbertura.formatada();
		
		//" + dataAbertura.dia + "/" + dataAbertura.mes + "/" + dataAbertura.ano
		return dados;
	}
	 //Exercicio 8 - Não é possível acessar o atributo através da classe.
	 //minhaconta.saldo = 1234;
	 //minhaconta.calculaRendimento(0);
	 
	 
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
	 //Exercicio 6 criação do set
	 public void setIdentificador() {
		identificador = identificador + 1;
		codIdentificador = identificador;
	 }
}

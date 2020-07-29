public class Conta {

	String titular;
	int numero;
	String agencia;
	double saldo;
	Data dataAbertura; // Criado tipo data Exercicio 7
	

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

	public double calculaRendimento() {
		if (this.saldo != 0) {			
			return this.saldo * 0.1;
		} else {
			System.out.print("Não possui saldo");
			return 0;
		}
	}
	
	public String recuperaDadosImpressao() {
		return "Dados de extrado: " 
				+ "\nTitular: " 
				+ this.titular
				+ "\nNumero c/c: "
				+ this.numero
				+ "\nAgencia: "
				+ this.agencia
				+ "\nSaldo: R$ "
				+ this.saldo
				+ "\nRendimento Mensal: R$ "
				+ calculaRendimento()
				+ "\nCliente desde: "
				+ this.dataAbertura.retornaData(); // Retorno da string Exercicio 9
	}
}

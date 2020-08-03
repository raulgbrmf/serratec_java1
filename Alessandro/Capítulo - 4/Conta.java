/*
 * Exercício - 1. Fiz a modelagem no papel, de acordo com o solicitado. Após, iniciei
 * a construção das classes Conta e Main.
 */

// Exercício - 2. Construção das classes Conta e Main.

public class Conta {

	String titular;
	int numero;
	String agencia;
	double saldo = 1234;
	Data dataAbertura; // Exercício - 7. Foi feita a modificação da variável "String" para "Data".

	// Exercício - 8. Feita a verificação pedida.

	public void saca(double valor) {
		if (saldo >= valor) {
			this.saldo = saldo - valor;
		} 
		else {
			System.out.println("Saldo insuficiente para saque.");
		}
	}

	public void deposita(double valor) {
		this.saldo = saldo + valor;
	}

	public double calculaRendimento() {
		if (this.saldo > 0) {
			return this.saldo * 0.1;
		} 
		else {
			System.out.println("Sua conta não possui saldo para receber rendimentos.");
			return 1;
		}

	}

	// Exercício - 3.

	public String recuperaDadosParaImpressao() {
		String dados = "Extrato da conta nº: " + this.numero +
					   "\nTitular: " + this.titular +
					   "\nAgência: " + this.agencia +
					   "\nSaldo: " + this.saldo + 
					   "\nRendimentos : " + this.calculaRendimento() +
					   "\nData de abertura da conta: " + this.dataAbertura.retornaData() + // Exercício - 9.
					   "\nDia: " + this.dataAbertura.dia + // Exercício - 7. Montagem da estrutura dia, mês e ano.
					   "\nMes: " + this.dataAbertura.mes + 
					   "\nAno: " + this.dataAbertura.ano;
					   return dados;

	/* Exercício - 7. Se chamarmos o método "recuperaDadosParaImpressao()" antes de
	 * atribuirmos uma data para este, ocorrerá o aparecimento desta informação: Data@15db9742
	 */
					   
	}

}


public class Conta {

	String titular;
	int NumeroDaConta;
	String agencia;
	double saldo;
	Data DataDeAbertura;

	public void sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo += -valor;
		} else {
			System.out.print("Saldo insuficiente");
		}
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public double calcularRend() {
		if (this.saldo != 0) {
			return this.saldo * 0.1;
		} else {
			System.out.print("Sem saldo");
			return 0;
		}
	}

	public String Extrato() {
		return "Extrato Bancário"
				+"\nTitular: "
				+ this.titular
				+"\nAgência: " 
				+this.agencia
				+"\nNumero da Conta:" 
				+ this.NumeroDaConta
				+"\nData de Abertura: "
				+this.DataDeAbertura.Redata()  //Exercício9
				+ "\nSaldo: " 
				+ this.saldo
				+"\nRedimento Mensal:"
				+this.calcularRend()
				+"\n\n\n";
	}
}
	
	

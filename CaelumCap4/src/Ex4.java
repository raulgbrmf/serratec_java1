
public class Ex4 {

	public static void main(String[] args) {

		Data d1 = new Data();

		Conta C2 = new Conta();

		C2.titular = "Maria";
		C2.NumeroDaConta = 1234;
		C2.agencia = "33333-7";
		C2.saldo = 200;
		C2.DataDeAbertura = d1;

		Conta C3 = new Conta();
		C3.titular = "Maria";
		C3.NumeroDaConta = 1234;
		C3.agencia = "33333-7";
		C3.saldo = 200;
		C3.DataDeAbertura = d1;

		if (C2 == C3) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
	}
}

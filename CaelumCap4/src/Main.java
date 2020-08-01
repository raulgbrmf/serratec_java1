
public class Main {

	public static void main(String[] args) {

		Data d1 = new Data(); 
		d1.dia = 20;
		d1.mes = 12;
		d1.ano = 2019;
		
		Conta C1 = new Conta();
		C1.titular = "Hugo";
		C1.NumeroDaConta = 1234;
		C1.agencia = "33333-7";
		C1.saldo = 200;
		C1.DataDeAbertura = d1;

		System.out.println("Saldo atual: " + C1.saldo);
		System.out.println("Rendimento mensal: " + C1.calcularRend());

		C1.saldo = C1.saldo + C1.calcularRend();
		System.out.println("saldo atual: " + C1.saldo);

		C1.depositar(100);
		System.out.println("Saldo atual: " + C1.saldo);

		System.out.println();

		System.out.print(C1.Extrato());

		C1.sacar(30);
		System.out.println(C1.Extrato());
		
	}
}

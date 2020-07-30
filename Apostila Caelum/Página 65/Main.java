package caelumPage65;

public class Main {

	public static void main(String[] args) {
		
		Data data = new Data();
		Conta usuario = new Conta();
		
		data.dia = 20;
		data.mes = 10;
		data.ano = 2019;

		usuario.titular = "Hugo";
		usuario.numero = 123;
		usuario.agencia = "45678-9";
		usuario.saldo = 50.0;
		usuario.dataAbertura = data;

		usuario.deposito(200);
		System.out.print(usuario.extratoBancario());
		usuario.saque(20);
		System.out.print(usuario.extratoBancario());
	}
}

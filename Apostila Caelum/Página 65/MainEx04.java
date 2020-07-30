package caelumPage65;

public class MainEx04 {

	public static void main(String[] args) {

		Conta usuario1 = new Conta();
		Conta usuario2 = new Conta();

		usuario1.titular = "Danilo";
		usuario1.numero = 321;
		usuario1.agencia = "45678-7";
		usuario1.saldo = 100;

		usuario2.titular = "Danilo";
		usuario2.numero = 321;
		usuario2.agencia = "45678-7";
		usuario2.saldo = 100;

		if (usuario1 == usuario2) {
			System.out.print("Iguais");
		} else {
			System.out.print("Diferentes");
		}
	}
}

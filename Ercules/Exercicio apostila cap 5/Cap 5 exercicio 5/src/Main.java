/* Não devemos ter um setter para esse tipo de problema. */
public class Main {

	public static void main(String[] args) {

		ContaBanco c1 = new ContaBanco("João", 123, "Inter", new Data("31", "07", "2020"));
		ContaBanco c2 = new ContaBanco("oãoJ", 321, "Gremio", new Data("13", "70", "2020"));
		ContaBanco c3 = new ContaBanco("Paulo", 456654, "Flamengo", new Data("23", "11", "2019"));

		c1.depositar(123456);
		c2.depositar(654321);
		c3.depositar(9999999);
		System.out.println("Saldo do Inter no deposito: " + c1.getSaldo());
		System.out.println("Saldo do Gremio no deposito: " + c2.getSaldo());
		System.out.println("Saldo do Flamengo no deposito: " + c3.getSaldo());
		c1.sacar(1234);
		c2.sacar(4321);
		c3.sacar(5000000);
		System.out.println("Saldo do Inter no saque: " + c1.getSaldo());
		System.out.println("Saldo do Gremio no saque: " + c2.getSaldo());
		System.out.println("Saldo do Flamengo no saque: " + c3.getSaldo());
		System.out.println(c3.setIdConta());
	}
}

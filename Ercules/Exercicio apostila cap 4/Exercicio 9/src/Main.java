
public class Main {

	public static void main(String[] args) {

		ContaBanco c1 = new ContaBanco();
		
		c1.nome = "Ercules";
		c1.agencia = "Inter";
		c1.numero = 123;
		c1.saldo = 579.43;
		c1.dataAbertura.dia = "31";
		c1.dataAbertura.mes = "07";
		c1.dataAbertura.ano = "2020";
		
		c1.sacar(70.0);
		c1.depositar(100.07);
		c1.calculaRendimento(c1.saldo);
		System.out.println(c1.recuperarDados());
	}
}


public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {

		Conta conta = new Conta();
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciador.adiciona(cc);
		System.out.println(gerenciador.getTotal());
		System.out.printf("O saldo é: %.2f", conta.getSaldo());
	}

}

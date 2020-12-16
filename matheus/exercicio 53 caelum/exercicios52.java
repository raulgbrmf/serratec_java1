
public class exercicios52 {
	// questão 1 o main nao tem acesso a funções private de um objeto

	// questão 4 no momento em que voce declara um argumento se torna obrigatorio
	// informa-la.

	// questão 5 não precisa de setter ele vai se auincrementar a cada nova conta

	public static void main(String[] args) {
		funcoes_exercicios52 c1 = new funcoes_exercicios52("hugo");
		data Data = new data();
		// c1.setTitular( "hugo");
		c1.setNumero(123);
		c1.setAgencia("45678-9");
		c1.setSaldo(50.0);

		Data.dia = 04;
		Data.mes = 06;
		Data.ano = 2015;
		c1.setDataAbertura(Data);

		c1.deposita(100.0);
		System.out.println("saldo atual: " + c1.getSaldo());
		System.out.println("rendimento mensal: " + c1.getRendimento());

		System.out.println(c1.recuperaDadosParaImpressao());

		funcoes_exercicios52 c2 = new funcoes_exercicios52("hugo");
		// c2.setTitular ( "hugo");
		c2 = c1;
		c2.setSaldo(100);
		if (c1 == c2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
	}

}

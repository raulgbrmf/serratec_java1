// Exercício - 1.

public class TestaArray {

	public static void main(String[] args) {

		// double mediaSaldos;

		Conta[] contas = new Conta[10];
		for (int i = 0; i < 10; i++) {
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100.0);
			contas[i] = conta;
			System.out.println(contas[i].getSaldo());
		}
		double soma = 0;
		for (int j = 0; j < contas.length; j++) {
			soma = soma + contas[j].getSaldo();
		}
		// Exercício - 2.
		
		System.out.println("A soma total do vetor Conta é: " + soma);
		System.out.println("A média do vetor Contas é: " + soma / contas.length);
	}
}

package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.funcionario.Gerente;

public class TestaGerente {
	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setNome("João	da	Silva");
		gerente.setSenha(4231);
		gerente.setSalario(5000);
		System.out.println(gerente.getBonificacao());
		ContaCorrente conta = new ContaCorrente();
		
		
		System.out.println(conta.recuperaDadosParaImpressao());
	}
}

package br.com.lezerck.main;
import br.com.lezerck.conta.ContaCorrente;
import br.com.lezerck.funcionario.Gerente;

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

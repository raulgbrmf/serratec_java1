package br.com.caelum.controle;
import br.com.caelum.contas.ContaCorrente;
import br.com.caelum.contas.SeguroDeVida;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {
		
		GerenciadorDeImpostoDeRenda ir = new GerenciadorDeImpostoDeRenda();
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1500);
		ir.adicionar(cc);
		System.out.println(ir.getTotal());
		
		
		SeguroDeVida sv = new SeguroDeVida();
		ir.adicionar(sv);
		System.out.println(ir.getTotal());
		
		System.out.printf("O saldo é: %.2f ", cc.getSaldo());
	}

}

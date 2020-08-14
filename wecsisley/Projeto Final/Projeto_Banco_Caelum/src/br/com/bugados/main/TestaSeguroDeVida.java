package br.com.bugados.main;

import br.com.bugados.conta.ContaCorrente;
import br.com.bugados.util.InteracaoUsuario;

public class TestaSeguroDeVida {
	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.deposita(150);
		double valorSeguro = InteracaoUsuario.lerDoubles("Informe o valor que deseja assegurar: ");
		
		conta.seguroDeVida(valorSeguro);
	}

}

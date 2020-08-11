package br.com.g2ac.conta;

import br.com.g2ac.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {

	public double calculaTributos() {
		return 42;
	}

	@Override
	public double getSaldo() {
		return 0;
	}

}

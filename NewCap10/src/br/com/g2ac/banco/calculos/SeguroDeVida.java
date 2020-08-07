package br.com.g2ac.banco.calculos;

public class SeguroDeVida implements Tributavel {
	public double calculaTributos() {
		return 42;
	}

	@Override
	public double getSaldo() {
		return 0;
	}
}

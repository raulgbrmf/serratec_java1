package br.com.bugados.impostos;

public class SeguroDeVida implements Tributavel {
	
	
	@Override
	public String toString() {
		return "SeguroDeVida " + calculaTributos();
	}

	public double calculaTributos() {
		return 42;
	}
}

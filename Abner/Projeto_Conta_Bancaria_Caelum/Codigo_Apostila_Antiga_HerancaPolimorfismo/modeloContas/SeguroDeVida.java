package modeloContas;

import interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {
	
	public double calculaTributos() {
		return 42;
	}

	@Override
	public double getSaldo() {
		
		return 0;
	}	
}

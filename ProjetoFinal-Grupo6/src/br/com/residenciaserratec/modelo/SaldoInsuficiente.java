package br.com.residenciaserratec.modelo;

public class SaldoInsuficiente extends RuntimeException {

		    private static final long serialVersionUID = 1L;
		 
		    public SaldoInsuficiente(double valor) {
		        super("Saldo insuficiente para a opera��o no valor: "+valor);
	}
}


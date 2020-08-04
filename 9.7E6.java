package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.main.SistemaBancario;

public class ContaCorrente extends Conta {  
	
	
	public String getTipo() {
        return "Conta Corrente";
    }
	
	  @Override
	
	public void saca(double valor) { 
    this.saldo -= (valor + 0.10);
}


}



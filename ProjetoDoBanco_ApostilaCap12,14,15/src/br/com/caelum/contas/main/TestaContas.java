package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.*;
import br.com.caelum.contas.modelo.IllegalArgumentException;
import br.com.caelum.javafx.api.main.SistemaBancario;
//import br.com.caelum.javafx.api.main.TelaDeContas;

public class TestaContas {

	public static void main(String[] args) {
		//SistemaBancario.mostraTela(false);
		SistemaBancario.mostraTela(true); 	//11.5.5
		//TelaDeContas.main(args);
	}

	Conta[] contas = new Conta[10]; {
		
		for (int i = 0; i < contas.length; i ++) {
			Conta conta = new ContaCorrente();
			try {
				conta.deposita(i * 100.0);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Conta " + (i+1) + ": " + conta);
		}
		}
}

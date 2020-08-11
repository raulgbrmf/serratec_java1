package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.IllegalArgumentException;

public class TestaArrays {
	
	public static void main(String[] args) throws IllegalArgumentException {	//Cap14.5.1-2
		Conta[] contas = new Conta[10]; {
			int j= 0;
			for (int i = 0; i < contas.length; i ++) {
				Conta conta = new ContaCorrente();
				conta.deposita(i * 100.0);		//saldo distintos	
				conta.setNumero(i+1);		//numeros distintos de contas	
				System.out.println(conta);
				
				j = (int) (j + conta.getSaldo());	//soma dos saldos
			}
			
			System.out.println("A média total dos saldos: R$" + j/contas.length);

		}
	}
}
	


package br.com.caelum.controle;

import br.com.caelum.contas.*;
import br.com.caelum.exceptions.*;

public class TestaContas {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente();

		try {
			cc.deposita(-100);
		} catch (ValorInvalidoException v) {
			System.out.println(v.getMessage());

		}

		try {
			cc.saca(2000);
		} catch (RuntimeException r) {
			System.out.println(r.getMessage());

		}

	}
}

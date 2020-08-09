package mainsTestes;

import modeloContas.Banco;
import modeloContas.ContaCorrente;
import modeloContas.ContaPoupanca;

public class TestaBanco {

	public static void main(String[] args) {

		Banco banco = new Banco("G2ACBANK", 1010);

		for (int i = 0; i < 5; i++) {
			ContaCorrente cc = new ContaCorrente();
			cc.setTitular("titular_ContaCorrente" + i);
			cc.setNumero(i);
			cc.setAgencia("1023");
			cc.deposita(100.00 * (i + 1));
			banco.adiciona(cc);
		}

		// Tive que realizar o tratamento pois em algum exercicio anterior foi incluida
		// uma
		// exception no metodo deposita da conta poupança
		
		try { 
			for (int i = 0; i < 5; i++) {
				ContaPoupanca cp = new ContaPoupanca();
				cp.setTitular("titular_ContaPoupança" + i);
				cp.setNumero(i);
				cp.setAgencia("1023");
				cp.deposita(50.00 * (i + 1));
				banco.adiciona(cp);
			}

		} catch (NullPointerException e) {
			System.out.println("Ops! Parece que o vetor já está cheio!");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		banco.mostraConta();
		
		
		
		//Exercicio 9
		ContaCorrente cc1 = new ContaCorrente();
		cc1.setTitular("teste");
		cc1.setNumero(10);
		cc1.setAgencia("1023");
		cc1.deposita(50.00);
		banco.adiciona(cc1);
		
		ContaCorrente cc2 = new ContaCorrente();
		cc1.setTitular("teste2");
		cc1.setNumero(10);
		cc1.setAgencia("1023");
		cc1.deposita(50.00);		
		
		System.out.println(banco.contem(cc1));
		System.out.println(banco.contem(cc2));
	}

}

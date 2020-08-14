package mainsTestes;

//import interfaces.Tributavel;
import modeloContas.ContaCorrente;
import modeloContas.ContaPoupanca;
import exception.ValorInvalidoException;

public class TestaTributavel {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		try {
			
			cc.deposita(-100);
			cp.deposita(-100);
			
		}catch(ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}		

		try {
			cc.saca(50);
			System.out.println("consegui sacar da corrente!");
			cp.saca(50);
			System.out.println("consegui sacar da poupanca!");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		/*Tributavel t = cc;
		System.out.println(t.calculaTributos());
		System.out.println(t.getSaldo());*/

	}

}

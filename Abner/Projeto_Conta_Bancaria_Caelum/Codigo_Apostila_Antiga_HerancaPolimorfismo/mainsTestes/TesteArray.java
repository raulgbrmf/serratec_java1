package mainsTestes;

import modeloContas.Conta;
import modeloContas.ContaCorrente;

public class TesteArray {

	public static void main(String[] args) {
		
		Conta contas[] = new Conta[10];			
		
		for(int i = 0; i < contas.length; i++) {
			ContaCorrente cc = new ContaCorrente();
			contas[i] = cc;
			cc.deposita(i * 100);
		}	
		
		double total = 0;
		
		for(Conta x : contas) {			
			total +=  x.getSaldo();
		}
		
		System.out.println("A media do valor das contas no array é: " + total/contas.length);
	}
}

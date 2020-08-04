package fixacaoCap4.casa;

import fixacaoCap4.porta.Porta;

public class Main {
	public static void main(String[] args) {
		Porta p1 = new Porta(true, "amarela", 2.10, 0.70,0.10);
		Porta p2 = new Porta(true, "branca", 2.10, 0.70,0.10);
		Porta p3 = new Porta(true, "amarela", 2.10, 0.70,0.10);
		
		Casa c1 = new Casa("Roxo", p1,p2,p3);
		
		c1.pinta("Cinza");
		c1.quantasPortasEstaoAbertas();
		
		System.out.print(c1);
	}
}

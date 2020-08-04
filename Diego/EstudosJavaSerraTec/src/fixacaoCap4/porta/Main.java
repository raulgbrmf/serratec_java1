package fixacaoCap4.porta;

public class Main {
	public static void main(String[] args) {
		Porta p1 = new Porta(true, "branca", 2.10, 0.70,0.10);
		p1.fecha();
		
		if(p1.isAberta())
			System.out.println("Porta aberta");
		else
			System.out.println("Porta fechada");
	}
}

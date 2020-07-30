
public class Comparacao {

	public static void main(String[] args) {
	
	Conta c1 = new Conta();
	c1.titular = "Danilo";
	c1.saldo = 100;
	
	//c1.titular="Hugo";
	//c1.saldo = 100;

	Conta c2 = new Conta();
	c2.titular = "Danilo";
	c2.saldo = 100;
	
	//c2 = c1;
	
	if (c1==c2) {
		System.out.println("|   Iguais   |");
	} else {
		System.out.println("|   Diferentes   |");
	}
	/* ---- para um resultado correto
	 if (c1.titular==c2.titular) {
		System.out.println("|   Iguais   |");
	} else {
		System.out.println("|   Diferentes   |");
	}*/
	}
}
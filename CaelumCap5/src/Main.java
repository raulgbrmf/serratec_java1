
public class Main {

	public static void main(String[] args) {
		Conta C1 = new Conta();
		Conta C2 = new Conta("Joana");
		System.out.println(C1.getid());
		System.out.println(C2.getid());

		C1.settitular("Fernanda");
		System.out.println(C1.gettitular());
		C1.setNumeroDaConta(1234);
		System.out.println(C1.getNumeroDaConta());

	}
}


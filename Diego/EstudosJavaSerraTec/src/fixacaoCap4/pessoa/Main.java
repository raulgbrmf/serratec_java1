package fixacaoCap4.pessoa;

public class Main {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Ana", 30);
		p1.fazAniversario();
		System.out.println(p1.getIdade());
	}
}

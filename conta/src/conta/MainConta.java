package conta;

public class MainConta {

	public static void main(String[] args) {
		ContaBanco titular1 = new ContaBanco();
		titular1.setNumConta(11111);
		titular1.setTitular("Chewbacca");
		titular1.abrirConta("CC");
		
		ContaBanco titular2 = new ContaBanco();
		titular2.setNumConta(22222);
		titular2.setTitular("Isolda");
		titular2.abrirConta("CP");
		
		titular1.depositar(100);
		titular2.depositar(500);
		titular2.sacar(100);
		
		titular1.sacar(150);
		titular1.fecharConta();
		
		titular2.pagarMensal();
		
		titular1.estadoAtual();
		titular2.estadoAtual();
	}

}

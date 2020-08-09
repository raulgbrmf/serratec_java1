
public class TestaSistemaInterno {

	public static void main(String[] args) {
		
		SistemaInterno si = new SistemaInterno();
		Cliente c1 = new Cliente();
		Funcionario f1 = new Funcionario();
		
		c1.setSenha(123);
		f1.setSenha(222);
		
		si.entrar(c1,c1.getSenha());
	}

}

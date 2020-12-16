
public class Gerente extends Funcionario {

	int senha;
	int numeroDeFuncionariosGerenciados;
	
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}
}

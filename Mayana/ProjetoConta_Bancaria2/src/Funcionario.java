
public class Funcionario {

	private String nome;
	private String cpf;
	protected double salario;
	
	
	
	public double getBonificacao() {
		return this.salario * 0.10;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}

/*Um atributo protected só pode ser acessado (visível) pela própria classe, por 
 * suas subclasses, e pelas classes que se encontram no mesmo pacote.*/

public class Funcionario {
	private String nome;
	private String cpf;
	protected double salario = 1000;

	public Funcionario() {
	};

	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getBonificacao() {
		return this.salario * 0.10;
	}
}

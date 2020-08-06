package br.com.Serratec.contas;

public class Aluno extends Pessoa {

	private int matricula;
	private String curso;
	
	public void pagarMensalidade() {
		System.out.println("O aluno " + getNome() + ", pagou a mensalidade!");
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public void fazerAniversario() {
		this.idade ++;
		System.out.println("\nFeliz Aniversário " + this.nome);
		System.out.println("Você está completando " + this.idade + " anos!");
		
	}
	
}

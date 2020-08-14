package modelo.usuario;

public abstract class Usuario {

	private String nome;
	private String cpf;
	private String senha;
	private static final int tamanhoCPF = 11;

	public Usuario(String nome, String cpf, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getSenha() {
		return senha;
	}
	
	public String formatCpf() {
		if (this.cpf != null) {
			if (cpf.length() == tamanhoCPF) {
				return cpf.replaceAll("([0-9]{3})([0-9]{3})([0-9]{3})([0-9]{2})", "$1\\.$2\\.$3-$4");
			}
		}
		return ("Cpf inválido.");
	}
}


package br.com.caelum.usuario;

public class TesteGerente {

	public static void main(String[] args) {
			// podemos chamar métodos do Funcionario:
			// e também métodos do Gerente!
			//gerente.autentica(4231);
			
		Gerente gerente = new Gerente();
		gerente.setNome("Ingrid");
		gerente.setSenha(4231);
		gerente.setSalario(5000.0);
			
		System.out.println("Seu nome: " + gerente.getNome());
		System.out.println("Sua senha: " + gerente.getSenha());
		System.out.println("Bonificação: " + gerente.getBonificacao());
		
		//passo 9.4
		Funcionario funcionario = gerente;
		funcionario.setSalario(5000.0);
		funcionario.getBonificacao();
	}
}
	


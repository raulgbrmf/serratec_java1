package br.com.caelum.usuario;

public class TestaGerentePolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Gerente gerente = new Gerente ();
		
		Funcionario funcionario = gerente;
		
		funcionario.setSalario(5000); 
		
		funcionario.getBonificacao();
		System.out.println("Bonificação : " + funcionario.getBonificacao());
		
	}

}

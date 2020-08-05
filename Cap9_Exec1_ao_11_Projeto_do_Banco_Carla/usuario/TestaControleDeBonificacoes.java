package br.com.caelum.usuario;

public class TestaControleDeBonificacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  ControleDeBonificacoes controle = new ControleDeBonificacoes ();
	  
	  Gerente funcionario1 = new Gerente ();
	  funcionario1.setSalario(5000);
	  controle.registra(funcionario1);
	  
	  Funcionario funcionario2 = new Funcionario ();
	  funcionario2.setSalario (10000);
	  controle.registra (funcionario2);
	  
	  // Resultado 750 do gerente + 1000 do funcionario "normal" = 1750
	  
	  System.out.println(controle.getTotalBonificacoes());
	  
	
	}

}

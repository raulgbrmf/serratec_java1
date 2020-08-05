package br.com.caelum.contas.main;

//import br.com.caelum.usuario.ControleDeBonificacoes;
//import br.com.caelum.usuario.Funcionario;
import br.com.caelum.usuario.Gerente;

public class TestaGerente { 

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setNome("Raul Gabrich");
		gerente.setSenha(2126);
		
		gerente.autentica(2126); //ACESSO PERMITIDO.
		//gerente.autentica(2011); //ACESSO NEGADO.
		
		 //System.out.println(gerente.getNome());        //teste 
		 //System.out.println(gerente.getSenha());  
	
		gerente.setSalario(5000);
		System.out.println("Bonificacao do gerente: " + gerente.getBonificacao());
		
		/*ControleDeBonificacoes controle = new ControleDeBonificacoes();
		
		Gerente funcio1 = new Gerente();
		funcio1.setSalario(5000);
		controle.registra(funcio1);
		
		Funcionario funcio2 = new Funcionario();
		funcio2.setSalario(1000);
		controle.registra(funcio2);	
		
		System.out.println(controle.getTotalDeBonificacoes());*/

	}

}

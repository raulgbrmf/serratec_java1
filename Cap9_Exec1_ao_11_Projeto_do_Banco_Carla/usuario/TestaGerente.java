package br.com.caelum.usuario;

public class TestaGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente gerente = new Gerente ();
				
		// método da Classe mãe Funcionário
		
		gerente.setNome("CarlaH");
		
		//System.out.println ( "Gerente : " + gerente.getNome() );
		
		
		// método da Classe filha Gerente
		
		   gerente.setSenha(4231);
		
		   gerente.autentica (4231);
		
		// 1º teste Bonificação-sem reescrever o método ( Resultado : 500)
		// 2º teste Bonificação-reescrevendo o método ( Resultado: 750)   
		// 3º teste Bonificação-reescrevendo o método com "super" ( Resultado: 1000)   
			   
		 gerente.setSalario ( 5000.0);
		 
		 System.out.println( gerente.getBonificacao ()); 
		 
		
		
		   
		
	}

}

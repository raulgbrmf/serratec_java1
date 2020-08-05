package br.com.caelum.usuario;

public class ControleDeBonificacoes {
	 
		//Inserindo println para ficar de acordo com o Cap. 10
	
		private double totalDeBonificacoes = 0;
		
		public void registra (Funcionario funcionario)
		{
			System.out.println ("Adicionando bonificação do funcionário: " + funcionario);
			this.totalDeBonificacoes += funcionario.getBonificacao ();
			
		}
		
		public double getTotalBonificacoes ()
		{
			return this.totalDeBonificacoes;
		}
	
	
	

}

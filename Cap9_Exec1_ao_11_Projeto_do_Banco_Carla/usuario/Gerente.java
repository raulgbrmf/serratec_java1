package br.com.caelum.usuario;

public class Gerente extends Funcionario {

	
	   // Atributos comentados por utilizar o "extends"
	//private String nome;
	//private String cpf;
	//private double salario;
	
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	// Reescrevendo o método da Classe mãe ( Bonificação)
	
	@Override
	public double getBonificacao ()
	{
		return this.salario*0.15;
	}
	
	
	// Usando o "super"

	/*public double getBonificacao()
	{
		return super.getBonificacao() + 1000;
	}*/
	
	public boolean autentica ( int senha)
	{
		if (this.senha == senha)
		{
			System.out.println ("Acesso permitido!");
			return true;
		} else
		{
			System.out.println ("Acesso negado!");
			return false;
		}
	}	
		
		
		/*public int getSenha()
		{
			return this.senha;
		}*/
	
		public void setSenha (int senha)
		{
			this.senha = senha;
		}
	
	
	
	
	
}

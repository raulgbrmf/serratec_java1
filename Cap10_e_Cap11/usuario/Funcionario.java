package br.com.caelum.usuario;

 public class Funcionario {
  

	  
	// Atributos comentados por utilizar o "protected"
	
	/*private String nome;
	private String cpf;
	private double salario;*/

	protected String nome;
	protected String cpf;
	protected double salario;
	
	// Getters	
     
		 //Cap. 9 
		/*public double getBonificacao ()
		{
			return this.salario*0.10;
		}*/
	
	public double getBonificacao ()
	{
		return this.salario*1.2;
	}
	


	public String getNome ()
	{
		return this.nome;
	}
	
	public double getSalario ()
	{
		return this.salario;
	}
	
	public String getCpf ()
	{
		return this.cpf;
	}
	
	//Setters 
	
	public void setNome (String nome)
	{
		this.nome = nome;
	}
	
	public void setSalario (double salario)
	{
		this.salario = salario;
	}
	
}


package br.com.g2ac.banco.usuario;

public class Cliente 
{
	private String nome;
	private String sobreNome;
	
	public Cliente (String nome, String sobreNome)
	{
		this.nome = nome;
		this.sobreNome = sobreNome;
	}

	public String getNome() 
	{
		return nome;
	}
	
	public String getSobreNome()
	{
		return sobreNome;
	}
}

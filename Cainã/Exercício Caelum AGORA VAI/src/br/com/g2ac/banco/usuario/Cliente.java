package br.com.g2ac.banco.usuario;

import br.com.g2ac.banco.util.Autenticavel;

public class Cliente implements Autenticavel
{
	private String nome;
	private String sobreNome;
	private int senha;
	
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
	
	public boolean autenticaSenha(int senha)
	{
		if(this.senha == senha)
		{
			System.out.println("Acesso permitido!");
			return true;
		}
		else
		{
			System.out.println("Acesso negado!");
			return false;
		}
	}
}

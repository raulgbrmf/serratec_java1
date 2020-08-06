package br.com.g2ac.banco.util;

public class PessoaFisica 
{
	private String cpf;
	
	public PessoaFisica(String cpf)
	{
		if(verificaDigitos(cpf) == true && validaCpf(cpf) == true)
		{
			System.out.println("CPF: " + cpf);
		}
		else
		{
			System.out.println("CPF inválido!");
		}
	}
	
	private boolean verificaDigitos(String cpf)
	{
		long num = Long.parseLong(cpf);
		
		if(num != 0)
		{
			return true;
		}
		return false;
	}
	
	private boolean validaCpf(String cpf)
	{
		int digitos = cpf.length();
		
		if(digitos == 11)
		{
			return true;
		}
		return false;
	}
}

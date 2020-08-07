package br.com.g2ac.banco.funcionario;

public class ControleDeBonificacoes 
{
	private double totalDeBonificacoes = 0;
	
	public void registra(Funcionario funcionario)
	{
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}
	
	public double getTotalDeBonificacoes()
	{
		return this.totalDeBonificacoes;
	}
}

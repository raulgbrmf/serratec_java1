package br.com.g2ac.banco.funcionario;
import br.com.g2ac.banco.util.Data;

abstract class Funcionario 
{
	private String nome;
	protected double salario;
	private Data dataEntrada;
	private boolean trabalha = true;
	private static int identificador = 0;
	
	public Funcionario (String nome, Data dataEntrada)
	{
		Funcionario.identificador = Funcionario.identificador + 1;
		this.nome = nome;
		this.dataEntrada = dataEntrada;
	}
	
	public Funcionario (String nome, double salario, Data dataEntrada)
	{
		Funcionario.identificador = Funcionario.identificador + 1;
		this.nome = nome;
		this.salario = salario;
		this.dataEntrada = dataEntrada;
	}
	
	public void bonifica (double valor)
	{
		this.salario = this.salario + valor;
	}
	
	public void demite()
	{
		this.trabalha = false;
	}
	
	private String verificaDemicao()
	{
		if(this.trabalha == true)
		{
			return "Ainda trabalhando";
		}
		else
		{
			return "Demitido";
		}
	}
	
	abstract double getBonificacao();
	
	public void mostraFuncionario()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("Identificador: " + Funcionario.identificador);
		System.out.println("Salário: " + this.salario);
		System.out.println("Data de entrada: " + dataEntrada.imprimeData());
		System.out.println("Estado na empresa: " + this.verificaDemicao());
		System.out.println("Bonificações: " + this.getBonificacao());
		System.out.println();
	}
}

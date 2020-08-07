package br.com.g2ac.banco.funcionario;
import br.com.g2ac.banco.util.Data;

public class TestaFuncionario 
{
	public static void main(String[] args) 
	{
		Data data1 = new Data(28, 2, 1800);
		
		Gerente f1 = new Gerente("Carlos", 5000, data1, 1234);
		Diretor f2 = new Diretor("Diego", 1000, data1, 4321);
		
		/*
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		
		controle.registra(f1);
		controle.registra(f2);
		
		System.out.println(controle.getTotalDeBonificacoes());
		*/
		
		f1.mostraFuncionario();
	}
}

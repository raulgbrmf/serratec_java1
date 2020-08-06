package br.com.g2ac.contas.main;

import br.com.g2ac.usuario.Funcionario;
import br.com.g2ac.util.Data;

public class TestaFuncionarios {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario ();
		Data data = new Data(20,11,1998);
			
		func.setNome("Giulia");
		func.setSalario(1000);
		func.setDataEntrada(data);
		func.setDepartamento("Gerência"); 
		func.admissao = data; 
		func.rg = "23.999.543-8";
		
		
		System.out.println(func.mostra());
		
	}
}

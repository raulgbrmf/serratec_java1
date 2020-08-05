package br.com.g2ac.contas.main;

import br.com.g2ac.usuario.Funcionario;
import br.com.g2ac.util.Data;

public class TestaFuncionarios {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario ();
		Data data = new Data(20,11,1998);
			
		func.nome = "Giulia";
		func.setSalario(1000);
		func.setDataEntrada(data);
		func.mostra();
		
	}
}

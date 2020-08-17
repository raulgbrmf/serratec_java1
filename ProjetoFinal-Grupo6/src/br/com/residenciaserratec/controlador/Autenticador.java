package br.com.residenciaserratec.controlador;

import java.util.HashMap;
import br.com.residenciaserratec.modelo.Cliente;
import br.com.residenciaserratec.modelo.Funcionario;

public class Autenticador {

	public static boolean autentica(HashMap<Long, Funcionario> funcionarios, HashMap<Long, Cliente> clientes, long cpf,
			int senha) {

		if (clientes.containsKey(cpf) == true) {
			Cliente clienteLogado = clientes.get(cpf);

			if (clienteLogado.getSenha() == senha) {
				return true;

			}
			else return false;

		} else if (funcionarios.containsKey(cpf) == true) {
			Funcionario funcionarioLogado = funcionarios.get(cpf);

			if (funcionarioLogado.getSenha() == senha) {
				return true;
			}
			else return false;
		}
		else 
		return false;
	}
}

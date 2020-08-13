package br.com.bugados.main;

import java.io.*;
import java.util.Map;

import br.com.bugados.conta.Conta;
import br.com.bugados.funcionario.Funcionario;
import br.com.bugados.usuario.Cliente;
import static br.com.bugados.util.Constantes.*;
import br.com.bugados.util.InteracaoUsuario;

public class SistemaInterno {

	static Map<Integer, Funcionario> mapFuncionario;
	static Map<Integer, Cliente> mapCliente;
	static Map<Integer, Conta> mapConta;

	public static void main(String[] args) {

		try {
			mapFuncionario = Funcionario.lerFuncionarios();
			mapCliente = Cliente.lerCliente(mapFuncionario);
			mapConta = Conta.lerConta();
		} catch (FileNotFoundException e) {
			System.out.println("Deu tosse !");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Deu ruim, não sei o que foi. se vira");
			e.printStackTrace();
		}

		int cpfLogin = InteracaoUsuario.lerInteiros("Informe um cpf (somente números) para login: ");
		int senhaLogin = InteracaoUsuario.lerInteiros("Informe a senha (somente números) para login: ");

		boolean clienteCadastrado = mapCliente.containsKey(cpfLogin);
		if (clienteCadastrado) {
			Cliente cliente = mapCliente.get(cpfLogin);
			if (senhaLogin == cliente.getSenha()) {
				if (cliente.getFuncionario() != null) {
					// Aqui ele é um funcionario
					switch (cliente.getFuncionario().getCargo()) {
					case CARGO_GERENTE:
						// Aqui ele é um Gerente
						break;
					case CARGO_DIRETOR:
						// Aqui ele é um Direetor
						break;
					case CARGO_PRESIDENTE:
						// Aqui ele é um Presidente
						break;
					}
				} else {
					// Aqui ele é só um cliente
				}
			}
		} else {
					//Cliente não cadastrado
		}

	}
}
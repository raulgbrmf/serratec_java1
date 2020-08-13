package br.com.bugados.main;

import static br.com.bugados.util.Constantes.CARGO_DIRETOR;
import static br.com.bugados.util.Constantes.CARGO_GERENTE;
import static br.com.bugados.util.Constantes.CARGO_PRESIDENTE;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import javax.swing.JOptionPane;

import br.com.bugados.conta.Conta;
import br.com.bugados.conta.ContaCorrente;
import br.com.bugados.conta.ContaPoupanca;
import br.com.bugados.conta.MapaDasContas;
import br.com.bugados.funcionario.Funcionario;
import br.com.bugados.funcionario.MapaDeFuncionario;
import br.com.bugados.usuario.Cliente;
import br.com.bugados.util.InteracaoUsuario;
import br.com.bugados.util.MenuDeOpcoes;

public class SistemaInterno {

	static Map<Integer, Funcionario> mapFuncionario;
	static Map<Integer, Cliente> mapCliente;
	static Map<Integer, Conta> mapConta;

	public static void main(String[] args) {

		try {
			mapFuncionario = MapaDeFuncionario.lerFuncionarios();
			mapCliente = Cliente.lerCliente(mapFuncionario);
			mapConta = MapaDasContas.lerConta();
		} catch (FileNotFoundException e) {
			System.out.println("Deu tosse !, arquivo não encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("deu ruim na entrada ou saida do arquivo");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Deu ruim, não sei o que foi. se vira");
			e.printStackTrace();
		}

		int cpfLogin = InteracaoUsuario.lerInteiros("Informe um cpf (somente números) para login: ");

		boolean clienteCadastrado = mapCliente.containsKey(cpfLogin);
		if (clienteCadastrado) {
			Cliente cliente = mapCliente.get(cpfLogin);
			
			int senhaLogin = InteracaoUsuario.lerInteiros("Informe a senha (somente números) para login: ");
			if (senhaLogin == cliente.getSenha()) {
				if (cliente.getFuncionario() != null) {
					//Funcionario cliente = (Funcionario) mapConta.get(cpfLogin);
					switch (cliente.getFuncionario().getCargo()) {
					case CARGO_GERENTE:
						MenuDeOpcoes.menuCliente(cpfLogin, mapConta, mapCliente, mapFuncionario);
						break;
					case CARGO_DIRETOR:
						MenuDeOpcoes.menuCliente(cpfLogin, mapConta, mapCliente, mapFuncionario);
						break;
					case CARGO_PRESIDENTE:
						MenuDeOpcoes.menuCliente(cpfLogin, mapConta, mapCliente, mapFuncionario);
						break;
					}
				} else {
					MenuDeOpcoes.menuCliente(cpfLogin, mapConta, mapCliente, mapFuncionario);
				}
			} else {
				// Senha errado
			}
		} else {
			System.out.println("Cliente não cadastrado !");
		}
	}
}
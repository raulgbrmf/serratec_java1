package br.com.bugados.usuario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import br.com.bugados.funcionario.Diretor;
import br.com.bugados.funcionario.Funcionario;
import br.com.bugados.funcionario.Gerente;
import br.com.bugados.funcionario.Presidente;

public class Cliente {

	private String nome;
	private int cpf;
	private int senha;
	private Funcionario funcionario;

	public Cliente() {
	}

	public Cliente(String nome, int senha, int cpf) {

		this.nome = nome;
		this.senha = senha;
		this.cpf = cpf;
	}

	public static Map<Integer, Cliente> lerCliente(Map<Integer, Funcionario> mapFuncionario)
			throws FileNotFoundException, IOException {
		String linha;

		try (BufferedReader csvReader = new BufferedReader(new FileReader("Cliente.txt"))) {
			linha = csvReader.readLine();

			Map<Integer, Cliente> mapCliente = new HashMap<>();

			while ((linha = csvReader.readLine()) != null) {

				linha = linha.replace("\"", "");

				String[] data = linha.split(";");

				String nome = data[0];
				int cpf = Integer.parseInt(data[1]);
				int senha = Integer.parseInt(data[2]);
				int idFuncionario = Integer.parseInt(data[3]);
				
				if(idFuncionario == 0) {
					Cliente novoCliente = new Cliente(nome, senha, cpf);
					novoCliente.setFuncionario(mapFuncionario.get(idFuncionario));
					mapCliente.put(cpf, novoCliente);
				}else if(idFuncionario == 1) {
					Gerente novoGerente = new Gerente();
				}else if(idFuncionario == 2) {
					Diretor novoDiretor = new Diretor();
				}else if(idFuncionario ==3){
					Presidente novoPresidente = new Presidente();
				}

			}
			return mapCliente;
		}
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", senha=" + senha + "]";
	}
}

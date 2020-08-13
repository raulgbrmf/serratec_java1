package br.com.bugados.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.com.bugados.conta.Conta;
import br.com.bugados.funcionario.Funcionario;

public class TestaLeitorCsvFuncionarioEConta {

	public static void main(String[] args) throws IOException {

		String linha;

		BufferedReader csvReader = new BufferedReader(new FileReader("Funcionario.txt"));
		linha = csvReader.readLine();

		Map<Integer, Conta> mapConta = new HashMap<>();
		Map<Integer, Funcionario> mapFuncionario = new HashMap<>();

		while ((linha = csvReader.readLine()) != null ) {
			
			linha = linha.replace("\"", "");

			String[] data = linha.split(";"); 

			String nome = data[0];
			String tipo = data[4];
			String cargo = data[3];
			int cpf = Integer.parseInt(data[1]);
			int senha = Integer.parseInt(data[2]);
			int numero = Integer.parseInt(data[5]);
			int agencia = Integer.parseInt(data[6]);
			
			Conta novaConta = new Conta(nome, numero, agencia, tipo, cpf);
			Funcionario novoFuncionario = new Funcionario(nome, cargo, cpf, senha);
			
			mapConta.put(cpf, novaConta);
			mapFuncionario.put(cpf, novoFuncionario);
			
		}
		
		Funcionario funcionario1 = mapFuncionario.get(112);
		Conta conta1 = mapConta.get(112);
		Funcionario funcionario2 = mapFuncionario.get(221);
		Conta conta2 = mapConta.get(221);
		Funcionario funcionario3 = mapFuncionario.get(121);
		Conta conta3 = mapConta.get(121);
		
		System.out.println(funcionario1.getNome() + " " + funcionario1.getCpf() + " " + funcionario1.getCargo());
		System.out.println(funcionario2.getNome() + " " + funcionario2.getCpf() + " " + funcionario2.getCargo());
		System.out.println(funcionario3.getNome() + " " + funcionario3.getCpf() + " " + funcionario3.getCargo());
		System.out.println();
		
		ArrayList lista = new ArrayList();
		
		csvReader.close();
	}
}

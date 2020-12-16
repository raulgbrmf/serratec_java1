package br.com.bugados.main;

import java.io.*;
import java.util.*;
import br.com.bugados.conta.*;
import br.com.bugados.usuario.Cliente;

public class TestaLeitorCsvClienteEConta {

	public static void main(String[] args) throws IOException {

		String linha;

		BufferedReader csvReader = new BufferedReader(new FileReader("csvCliente.csv"));
		linha = csvReader.readLine();


		Map<Integer, Conta> mapConta = new HashMap<>();
		Map<Integer, Cliente> mapCliente = new HashMap<>();

		while ((linha = csvReader.readLine()) != null) {
			
			linha = linha.replace("\"", "");

			String[] data = linha.split(";");

			String nome = data[0];
			String tipo = data[3];
			int cpf = Integer.parseInt(data[1]);
			int senha = Integer.parseInt(data[2]);
			int numero = Integer.parseInt(data[4]);
			int agencia = Integer.parseInt(data[5]);

			Conta novaConta = new Conta(nome, numero, agencia, tipo, cpf);
			Cliente novoCliente = new Cliente(nome, senha, cpf);

			mapConta.put(cpf, novaConta);
			mapCliente.put(cpf, novoCliente);
			
		}
		
		Conta conta1 = mapConta.get(111);
		System.out.println(conta1.getTitular());
		csvReader.close();
	}
}

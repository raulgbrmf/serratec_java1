package br.com.residenciaserratec.controlador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.sun.javafx.collections.MappingChange.Map;

import br.com.residenciaserratec.modelo.Agencia;
import br.com.residenciaserratec.modelo.Cliente;
import br.com.residenciaserratec.modelo.Conta;
import br.com.residenciaserratec.modelo.ContaCorrente;
import br.com.residenciaserratec.modelo.ContaPoupanca;
import br.com.residenciaserratec.modelo.Diretor;
import br.com.residenciaserratec.modelo.Funcionario;
import br.com.residenciaserratec.modelo.Gerente;
import br.com.residenciaserratec.modelo.Presidente;
import java.util.HashMap;
public class ControladorLeitura {

	public HashMap<Long, Conta> leituraContas() throws FileNotFoundException, IOException {
		BufferedReader csvReader;
		String linha;
		String header;
		HashMap <Long , Conta> contas = new HashMap<Long , Conta>();
		csvReader = new BufferedReader(new FileReader("Conta.csv"));

		header = csvReader.readLine();
		while ((linha = csvReader.readLine()) != null) {

			String[] data = linha.split(",");

			String tipo = (data[0]);
			int agencia = Integer.parseInt(data[1]);
			long cpfTitular = Long.parseLong(data[2]);
			double saldo = Double.parseDouble(data[3]);
			if (tipo.equals("Corrente")) {

				contas.put(cpfTitular, new ContaCorrente(agencia, cpfTitular, saldo));
			} else {
				contas.put(cpfTitular, new ContaPoupanca(agencia, cpfTitular, saldo));
			}
		}

		csvReader.close();
		return contas;
	}

	public HashMap<Long, Cliente> leituraCliente() throws FileNotFoundException, IOException {
		HashMap<Long, Cliente> clientes = new HashMap<Long, Cliente>();
		BufferedReader csvReader = new BufferedReader(new FileReader("Cliente.csv"));

		String linha;

		String header = csvReader.readLine();
		while ((linha = csvReader.readLine()) != null) {

			String[] data = linha.split(",");

			int senha = Integer.parseInt(data[0]);
			long cpfTitular = Long.parseLong(data[1]);
			String nome = data[2];
			clientes.put(cpfTitular, new Cliente(senha, cpfTitular, nome));
		}

		csvReader.close();
		return clientes;
	}

	public HashMap<Long ,Funcionario> leituraFuncionario() throws FileNotFoundException, IOException {
		HashMap<Long, Funcionario> funcionarios = new HashMap<Long, Funcionario>();
		BufferedReader csvReader = new BufferedReader(new FileReader("Funcionario.csv"));

		String linha;

		String header = csvReader.readLine();
		while ((linha = csvReader.readLine()) != null) {

			String[] data = linha.split(",");

			int senha = Integer.parseInt(data[0]);
			long cpfTitular = Long.parseLong(data[1]);
			String cargo = data[2];
			int agencia = Integer.parseInt(data[3]);
			if (cargo.equals("Gerente")) {
				funcionarios.put(cpfTitular, new Gerente(cpfTitular, senha, agencia));
			} else if (cargo.equals("Diretor")) {
				funcionarios.put(cpfTitular, new Diretor(cpfTitular, senha));
			} else if (cargo.equals("Presidente")) {
				funcionarios.put(cpfTitular, new Presidente(cpfTitular, senha));
			}
		}

		csvReader.close();
		return funcionarios;
	}
}

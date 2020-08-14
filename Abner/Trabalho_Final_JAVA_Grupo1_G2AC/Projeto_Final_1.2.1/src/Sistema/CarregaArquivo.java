package Sistema;

import java.io.*;
import java.util.*;

import contas.Agencia;
import modelo.contas.*;
import modelo.usuario.*;

public class CarregaArquivo {

	Map<String, Cliente> mapaCliente;
	Map<Integer, Agencia> mapaAgencia;
	Map<String, Funcionario> mapaFuncionario;
	Map<String, ContaCorrente> mapaContaCorrente;
	Map<String, ContaPoupanca> mapaContaPoupanca;

	Agencia agencia;
	ContaCorrente contaCorrente;
	ContaPoupanca contaPoupanca;
	Cliente cliente;
	Gerente gerente;
	Diretor diretor;
	Presidente presidente;
	BufferedReader ler;
	String linha;

	public Map<String, Cliente> importaCliente() throws IOException {

		mapaCliente = new HashMap<>();
		String arquivoCliente = "src/BaseDadosCSV/tabela_cliente.csv";
		ler = new BufferedReader(new FileReader(arquivoCliente));
		linha = ler.readLine();
		while ((linha = ler.readLine()) != null) {
			String[] dado = linha.split(";");
			cliente = new Cliente(dado[0], dado[1], dado[2]);
			mapaCliente.put(cliente.getCpf(), cliente);
		}
		ler.close();
		return mapaCliente;

	}

	public Map<Integer, Agencia> importaAgencia() throws IOException {

		mapaAgencia = new HashMap<>();
		String arquivoAgencia = "src/BaseDadosCSV/tabela_agencia.csv";
		ler = new BufferedReader(new FileReader(arquivoAgencia));
		linha = ler.readLine();
		while ((linha = ler.readLine()) != null) {
			String dado = linha;
			agencia = new Agencia(Integer.parseInt(dado));
			mapaAgencia.put(agencia.getNumeroAgencia(), agencia);
		}
		ler.close();
		return mapaAgencia;
	}

	public Map<String, Funcionario> importaFuncionario() throws IOException {

		mapaFuncionario = new HashMap<>();
		String arquivoGerente = "src/BaseDadosCSV/tabela_gerente.csv";
		ler = new BufferedReader(new FileReader(arquivoGerente));
		linha = ler.readLine();
		while ((linha = ler.readLine()) != null) {
			String[] dado = linha.split(";");
			gerente = new Gerente(dado[0], dado[1], dado[2], mapaAgencia.get(Integer.parseInt(dado[4])));
			mapaFuncionario.put(gerente.getCpf(), gerente);
		}

		String arquivoDiretor = "src/BaseDadosCSV/tabela_diretor.csv";
		ler = new BufferedReader(new FileReader(arquivoDiretor));
		linha = ler.readLine();
		while ((linha = ler.readLine()) != null) {
			String[] dado = linha.split(",");
			diretor = new Diretor(dado[0], dado[1], dado[2]);
			mapaFuncionario.put(diretor.getCpf(), diretor);
		}

		String arquivoPresidente = "src/BaseDadosCSV/tabela_presidente.csv";
		ler = new BufferedReader(new FileReader(arquivoPresidente));
		linha = ler.readLine();
		while ((linha = ler.readLine()) != null) {
			String[] dado = linha.split(",");
			presidente = new Presidente(dado[0], dado[1], dado[2]);
			mapaFuncionario.put(presidente.getCpf(), presidente);
		}
		ler.close();

		return mapaFuncionario;
	}

	public Map<String, ContaCorrente> importaContaCorrente() throws IOException {

		mapaContaCorrente = new HashMap<>();
		String arquivoContaCorrente = "src/BaseDadosCSV/tabela_contacorrente.csv";
		ler = new BufferedReader(new FileReader(arquivoContaCorrente));
		linha = ler.readLine();
		while ((linha = ler.readLine()) != null) {
			String[] dado = linha.split(",");
			contaCorrente = new ContaCorrente(mapaCliente.get(dado[0]), mapaAgencia.get(Integer.parseInt(dado[1])),
					Double.parseDouble(dado[2]));
			mapaContaCorrente.put(contaCorrente.getTitular().getCpf(), contaCorrente);
		}
		ler.close();
		return mapaContaCorrente;
	}

	public Map<String, ContaPoupanca> importaContaPoupanca() throws IOException {

		mapaContaPoupanca = new HashMap<>();
		String arquivoContaPoupanca = "src/BaseDadosCSV/tabela_contapoupanca.csv";
		ler = new BufferedReader(new FileReader(arquivoContaPoupanca));
		linha = ler.readLine();
		while ((linha = ler.readLine()) != null) {
			String[] dado = linha.split(",");
			contaPoupanca = new ContaPoupanca(mapaCliente.get(dado[0]), mapaAgencia.get(Integer.parseInt(dado[1])),
					Double.parseDouble(dado[2]));
			mapaContaPoupanca.put(contaPoupanca.getTitular().getCpf(), contaPoupanca);
		}
		ler.close();

		return mapaContaPoupanca;
	}
}

package modelo.usuario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.*;

import contas.Agencia;
import modelo.contas.*;

public class Gerente extends Funcionario {

	private Agencia agencia;

	public Gerente(String nome, String cpf, String senha, Agencia agencia) {
		super(nome, cpf, senha);
		this.agencia = agencia;
		this.cargo = "Gerente";
	}

	public String getCargo() {
		return this.cargo;
	}

	public void exportaDoc(String dados) throws IOException {

		Date data = new Date(System.currentTimeMillis());

		String local = "src/exportaDoc/relatorioGerente" + data.getTime() + ".txt";
		File file = new File(local);
		try {
			if (file.createNewFile()) {
				System.out.println("Arquivo Criado!");
			} else {
				System.out.println("Arquivo ja existe!");
			}
		} catch (IOException e) {
			System.out.println("Erro!" + e);
		}

		FileWriter f = new FileWriter(file.getAbsoluteFile());
		f.write(dados);
		f.close();

	}

	public void chamaExportaDoc(String relatorio) throws IOException {
		this.exportaDoc(relatorio);
	}

	public String relatorioGerente(Map<String, ContaCorrente> contaCorrente, Map<String, ContaPoupanca> contaPoupanca) {

		Set<String> cc = contaCorrente.keySet();
		Set<String> cp = contaPoupanca.keySet();

		int contadorCorrente = 0;
		int contadorPoupanca = 0;
		for (String c : cc) {
			if (contaCorrente.get(c).getIdAgencia().getNumeroAgencia() == this.agencia.getNumeroAgencia()) {
				contadorCorrente += 1;
			}
		}

		for (String c : cp) {
			if (contaPoupanca.get(c).getIdAgencia().getNumeroAgencia() == this.agencia.getNumeroAgencia()) {
				contadorPoupanca += 1;
			}
		}

		return "Agência [" + agencia.getNumeroAgencia() + "] a qual " + getNome() + " é responsável possui "
				+ (contadorCorrente + contadorPoupanca) + " conta(s). \nSendo, " + contadorCorrente
				+ " Conta(s) Corrente(s) e " + contadorPoupanca + " Conta(s) Poupança(s)";
	}
}

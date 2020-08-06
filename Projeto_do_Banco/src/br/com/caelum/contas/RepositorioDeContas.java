package br.com.caelum.contas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class RepositorioDeContas {

	private Conta conta;

	public void salva(List<Conta> contas) {

		PrintStream stream;
		try {
			stream = new PrintStream("contas.txt");
			for (Conta conta : contas) {

				stream.println(conta.getTipo() + "," + conta.getNumero() + ","

						+ conta.getAgencia() + "," + conta.getTitular() + ","

						+ conta.getSaldo());

			}

			stream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public List<Conta> carrega() {
		List<Conta> lista = new ArrayList<Conta>();
		
		try {
			
			File arquivo = new File("contas.txt");
			Scanner leitor = new Scanner(arquivo);
			while (leitor.hasNextLine()) {
				
				String linha = leitor.nextLine();

				String[] valores = linha.split(",");

				String tipo = valores[0];
			
				if (tipo.equals("Conta Corrente")) {
					conta = new ContaCorrente();

				} else if (tipo.equals("Conta Poupança")) {
					conta = new ContaPoupanca();
				}
				conta.setNumero(Integer.parseInt(valores[1]));

				conta.setAgencia(valores[2]);
				
				conta.setTitular(valores[3]);
				conta.setSaldo(Double.parseDouble(valores[4]));
				lista.add(conta);
				
			}
			leitor.close();

		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		return lista;
	}

}

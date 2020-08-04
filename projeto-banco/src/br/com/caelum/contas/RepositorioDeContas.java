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

	public List<Conta> carrega() throws FileNotFoundException {
		List<Conta> contas = new ArrayList<Conta>();

		File arquivo = new File("contas.txt");
		Scanner scanner = new Scanner(arquivo);

		while (scanner.hasNext()) {

			String linha = scanner.nextLine();
			String[] valores = linha.split(",");
			String tipo = valores[0];

			if (tipo.equals("Conta Corrente")) {
				ContaCorrente conta = new ContaCorrente();
				conta.setNumero(Integer.parseInt(valores[1]));
				conta.setAgencia(valores[2]);
				conta.setTitular(valores[3]);
				conta.deposita(Double.parseDouble(valores[4]));
				contas.add(conta);
			} else if (tipo.equals("Conta Poupança")) {
				ContaPoupanca conta = new ContaPoupanca();
				conta.setNumero(Integer.parseInt(valores[1]));
				conta.setAgencia(valores[2]);
				conta.setTitular(valores[3]);
				conta.deposita(Double.parseDouble(valores[4]));
				contas.add(conta);
			} else {
				throw new Error("Tipo da conta inválido!");
			}
		}

		scanner.close();

		return contas;
	}

}

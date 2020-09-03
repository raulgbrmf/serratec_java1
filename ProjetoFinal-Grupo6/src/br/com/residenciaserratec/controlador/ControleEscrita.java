package br.com.residenciaserratec.controlador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import br.com.residenciaserratec.modelo.Conta;

public class ControleEscrita {
		
	public void imprimeSaque(HashMap <Long, Conta> contas ,long cpf, double valor) throws IOException {
		
		FileWriter saque = new FileWriter("arquivoSaque.txt" , true);
			PrintWriter gravarSaque = new PrintWriter(new BufferedWriter (saque));
			gravarSaque.printf("----------------------------+%n");
			gravarSaque.printf("O valor sacado é: " + valor + " na " + contas.get(cpf));
			gravarSaque.close();
			}
	
	public void imprimeDeposito(HashMap <Long, Conta> contas ,long cpf, double valor) throws IOException {
		FileWriter deposito = new FileWriter("arquivoDeposito.txt" , true);
			PrintWriter gravarDeposito = new PrintWriter(new BufferedWriter (deposito));
			gravarDeposito.printf("-------------------------------+%n");
			gravarDeposito.printf("O valor depositado é: " + valor + " na " + contas.get(cpf));
			gravarDeposito.close();
		}
	
	public void imprimeTransfere(HashMap <Long, Conta> contas ,long cpf, double valor, long cpfDestino) throws IOException {
		FileWriter transfere = new FileWriter("arquivoTransfere.txt", true);
			PrintWriter gravarTransfere = new PrintWriter(new BufferedWriter (transfere));
			gravarTransfere.printf("--------------------------------+%n");
			gravarTransfere.printf("O valor transferido é: " + valor + " da " + contas.get(cpf) + " para a conta " + contas.get(cpfDestino));
			gravarTransfere.close();
		}
	public void imprimeSaldoTotal(double saldoT) throws IOException {
		FileWriter saldoTotal = new FileWriter("SaldoTotal.txt", true);
			PrintWriter gravarSaldoTotal = new PrintWriter(new BufferedWriter (saldoTotal));
			gravarSaldoTotal.printf("--------------------------------+%n");
			gravarSaldoTotal.printf("O saldo total do banco é: " + saldoT);
			gravarSaldoTotal.close();
	}

	
}


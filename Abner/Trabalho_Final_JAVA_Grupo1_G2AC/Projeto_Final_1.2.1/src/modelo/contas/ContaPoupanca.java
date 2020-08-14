package modelo.contas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;

import Exceptions.ValorInvalidoException;
import contas.Agencia;
import modelo.usuario.Cliente;

public class ContaPoupanca extends Conta {

	private final double TAXA_RENDIMENTO = 0.002;
	private final String TIPO_CONTA = "Conta Poupanca";

	public ContaPoupanca(Cliente titular, Agencia idAgencia, double saldo) {
		super(titular, idAgencia, saldo);
	}

	public void exportaDoc(String dados) throws IOException {

		Date data = new Date(System.currentTimeMillis());

		String local = "src/exportaDoc/relatorioContaPoupanca" + data.getTime() + ".txt";
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

	public void chamaExportaDoc() throws IOException {
		this.exportaDoc(relatorioTributo());
	}

	@Override
	public void saque(double valor) {
		if (valor > this.saldo || valor <= 0) {
			throw new ValorInvalidoException(
					"Não foi possivel realizar a operação.\nConfirme o valor digitado. Saldo atual: R$ " + this.saldo);
		} else {
			this.saldo -= valor;
			System.out.println("Operação conluida com sucesso!");
		}

	}

	@Override
	public void deposito(double valor) {
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inválido " + valor + ", informe um valor maior que 0");
		} else {
			this.saldo += valor;
			System.out.println("Operação conluida com sucesso!");
		}
	}

	@Override
	public void transferePara(Conta destino, double valor) {
		if (this.saldo < valor) {
			throw new ValorInvalidoException("Transferencia não realizada, confira seu saldo");
		} else {
			this.saldo -= valor;
			destino.saldo += valor;
			System.out.println("Operação conluida com sucesso!");
		}

	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	public String simulaRendimento(double valor, int dia) {
		double total = valor * dia * TAXA_RENDIMENTO;
		String simulador = "Simulação de rendimento de R$ " + valor + " para " + dia + " dias com " + TAXA_RENDIMENTO
				+ "% de rendimento foi de: R$" + total;
		return simulador;
	}

	@Override
	public String relatorioTributo() {
		String extrato = "-----------------------------------------" + "\n|                                       |"
				+ "\n|             Banco G2AC	        |" + "\n|                                       |"
				+ "\n| Agência: " + this.idAgencia.getNumeroAgencia() + "                         |" + "\n| Titular: "      
				+ this.titular.getNome() + "                  |" + "\n| CPF: " + this.titular.formatCpf() + "			|"
				+ "\n| Tipo de Conta: Conta Poupança         |" + "\n|---------Tributos Cobrados-------------|"
				+ titular.buscaInformacaoDeSeguro() + "\n| Total Gasto c/ Tributos: "
				+ String.format("%.2f", this.titular.buscaValorTaxadoSeguro()) + "	        |"
				+ "\n-----------------------------------------";
		return extrato;
	}

}

package modelo.contas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;

import Exceptions.ValorInvalidoException;
import contas.Agencia;
import modelo.usuario.*;

public class ContaCorrente extends Conta {

	private final double TAXA_DEPOSITO = 0.10;
	private final double TAXA_SAQUE = 0.10;
	private final double TAXA_TRANSFERENCIA = 0.20;	

	private final String TIPO_CONTA = "Conta Corrente";
	
	private int totalDeposito = 0;
	private int totalSaque = 0;	
	private int totalTransferencia = 0;

	public ContaCorrente(Cliente titular, Agencia idAgencia, double saldo) {
		super(titular, idAgencia, saldo);			
	}
	
	public void exportaDoc(String dados) throws IOException {		
		
		Date data = new Date(System.currentTimeMillis());		
		
		String local = "src/exportaDoc/relatorioContaCorrente" + data.getTime() + ".txt";
		File file = new File(local);
		try {
			if(file.createNewFile()) {
				System.out.println("Arquivo Criado!");
			}else {
				System.out.println("Arquivo ja existe!");
			}
		}catch(IOException e) {
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
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void saque(double valor) {		
		if (valor > this.saldo || valor <= 0) {			
			throw new ValorInvalidoException("Não foi possivel realizar a operação.\nConfirme o valor digitado. Saldo atual: R$ " + this.saldo);
		} else {
			this.saldo -= valor + TAXA_SAQUE;			
			this.totalSaque++;
			System.out.println("Operação conluida com sucesso!");
		}
	}

	@Override
	public void deposito(double valor){		
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inválido " + valor + ", informe um valor maior que 0");
		} else {
			this.saldo += valor - TAXA_DEPOSITO;			
			this.totalDeposito++;
			System.out.println("Operação conluida com sucesso!");
		}
	}

	@Override
	public void transferePara(Conta destino, double valor) {
		if (this.saldo < valor + TAXA_TRANSFERENCIA) {
			throw new ValorInvalidoException("Transferencia não realizada, confira seu saldo");
		} else {
			this.saldo -= valor + TAXA_TRANSFERENCIA;
			destino.saldo += valor;										
			this.totalTransferencia++;
			System.out.println("Operação conluida com sucesso!");
		}

	}
	
	public double totalTributo() {
		return (TAXA_DEPOSITO * this.totalDeposito) + (TAXA_SAQUE * this.totalSaque) + (TAXA_TRANSFERENCIA * this.totalTransferencia);
	}
	
	@Override
	public String relatorioTributo() {
		String extrato = 
				     "-----------------------------------------"
				+ "\n|                                       |"
				+ "\n|             Banco G2AC	        |" 
				+ "\n|                                       |"
				+ "\n| Agência: " + this.idAgencia.getNumeroAgencia() + "				|"
				+ "\n| Titular: " + this.titular.getNome() + "              	|"
				+ "\n| CPF: " + this.titular.formatCpf() + "			|"
				+ "\n| Tipo de Conta: Conta Corrente         |"
				+ "\n|                                       |"
				+ "\n|-----------Tributos Cobrados-----------|"
				+ "\n|                                       |"
				+ "\n| Taxa Saque: " + String.format("%.2f", TAXA_SAQUE) + "			|"
				+ "\n| Total de Operações: " + this.totalSaque + "                 |\n| Total Gasto: " + String.format("%.2f", TAXA_SAQUE * this.totalSaque) + "			|"
				+ "\n| Taxa Deposito: " + String.format("%.2f",TAXA_DEPOSITO) + "			|"
				+ "\n| Total de Operações: " + this.totalDeposito + "                 |\n| Total Gasto: " + String.format("%.2f", TAXA_DEPOSITO * this.totalDeposito) + "			|"
				+ "\n| Taxa Transferencia: " + String.format("%.2f",TAXA_TRANSFERENCIA)+ "		|"
				+ "\n| Total de Operações: " + this.totalTransferencia + "                 |\n| Total Gasto: " + String.format("%.2f", TAXA_TRANSFERENCIA * this.totalTransferencia) + "			|"
				+ this.titular.buscaInformacaoDeSeguro()
				+ "\n| Total Gasto c/ Tributos: " + String.format("%.2f",this.totalTributo() + this.titular.buscaValorTaxadoSeguro()) + "	        |"
				+ "\n-----------------------------------------";		
		return extrato;
	}

	@Override
	public String toString() {
		return "ContaCorrente [totalDeposito=" + totalDeposito + ", totalSaque=" + totalSaque + ", totalTransferencia="
				+ totalTransferencia + ", titular=" + titular + ", idAgencia=" + idAgencia + ", saldo=" + saldo + "]";
	}
	
	

}

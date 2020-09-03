package br.com.residenciaserratec.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.residenciaserratec.controlador.ControladorLeitura;
import br.com.residenciaserratec.modelo.Agencia;
import br.com.residenciaserratec.modelo.Cliente;
import br.com.residenciaserratec.modelo.Conta;
import br.com.residenciaserratec.modelo.ContaCorrente;
import br.com.residenciaserratec.modelo.ContaPoupanca;
import br.com.residenciaserratec.modelo.Funcionario;
import br.com.residenciaserratec.modelo.Gerente;
import br.com.residenciaserratec.modelo.Presidente;

public class TestaConta {
	private static ControladorLeitura controladorLeitura = new ControladorLeitura();
	public static void main(String[] args) throws IOException {

		Cliente c9 = new Cliente(789, 45387, "larissa");

		/*List<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente(456, 78946, "Rodrigo"));
		clientes.add(new Cliente(789, 45127, "Matheus"));
		clientes.add(new Cliente(456, 89563, "Nicholas"));
		clientes.add(new Cliente(456, 12789, "Rafael"));
		clientes.add(new Cliente(456, 85963, "Batman"));
		*/
		
		List<Cliente> clientes = leituraCliente();

		System.out.println(clientes);
		
		List <Funcionario> funcionarios = controladorLeitura.leituraFuncionario();
		
		System.out.println(funcionarios);
		
		List<Conta> contas = controladorLeitura.leituraContas();

		System.out.println(contas);
		
		
		/*Conta c1 = new ContaCorrente(1, clientes.get(0));
		Conta c2 = new ContaCorrente(1, clientes.get(1));
		Conta c3 = new ContaCorrente(1, clientes.get(2));
		Conta c4 = new ContaCorrente(1, clientes.get(3));
		Conta cp1 = new ContaPoupanca(1, clientes.get(0));
		
		Presidente p1 = new Presidente(46525, 789, "presidente");

		System.out.println(p1.imprimeRelatorioFinanceiro());

		c1.deposito(100);

		List<Conta> contas = new ArrayList<>();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		*/
		// Gerente g1 = new Gerente(45689, 123, "gerente", a1);

		// System.out.println(contas.toString());

		// System.out.println(clientes.toString());

		// System.out.println(a1.totalDeContas + " " + cp1.getSaldo());

		// System.out.println(a1.totalDeContas);

		// c1.transfere(c2, 50);

		// System.out.println(cp1.getSaldo() + " " + c2.getSaldo());

		// cp1.deposito(100);

		// System.out.println(p1.imprimeRelatorioFinanceiro());

		// System.out.println(((ContaPoupanca)cp1).rendimento(4));

		// System.out.println(analisaAgencias(contas, g1));

		// System.out.println(analisaAgenciasPresidente(contas, p1, 1));

		// System.out.println(p1.imprimeRelatorioFinanceiro());

	}
	public static List<Cliente> leituraCliente() throws FileNotFoundException, IOException {
		List<Cliente> clientes = new ArrayList<>();
		BufferedReader csvReader = new BufferedReader(new FileReader("Cliente.csv"));

		String linha;

		String header = csvReader.readLine();
		while ((linha = csvReader.readLine()) != null) {

			String[] data = linha.split(",");

			int senha = Integer.parseInt(data[0]);
			long cpf = Long.parseLong(data[1]);
			String nome = data[2];
			clientes.add(new Cliente(senha, cpf, nome));
		}

		csvReader.close();
		return clientes;
	}
	



	
	

	/*public static int analisaAgencias(List<Conta> contas, Gerente gerente) {
		List<Integer> agencias = new ArrayList<>();
		for (Conta conta : contas) {
			agencias.add(conta.getAgencia().getNumero());
		}
		return (gerente.countOccurence(agencias));
	}

	public static int analisaAgenciasPresidente(List<Conta> contas, Presidente presidente, int numAgencia) {
		List<Integer> agencias = new ArrayList<>();
		for (Conta conta : contas) {
			agencias.add(conta.getAgencia().getNumero());
		}
		return (presidente.countOccurence(agencias, numAgencia));
	}*/

}

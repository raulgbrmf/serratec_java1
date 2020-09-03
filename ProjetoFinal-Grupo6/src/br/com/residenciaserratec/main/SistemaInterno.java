package br.com.residenciaserratec.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.sun.javafx.collections.MappingChange.Map;

import br.com.residenciaserratec.controlador.Autenticador;
import br.com.residenciaserratec.controlador.ControladorLeitura;
import br.com.residenciaserratec.controlador.Menu;
import br.com.residenciaserratec.modelo.*;

public class SistemaInterno {
	private static ControladorLeitura controladorLeitura = new ControladorLeitura();

	public static void main(String[] args) throws FileNotFoundException, IOException {

		HashMap<Long, Cliente> clientes = controladorLeitura.leituraCliente();
		HashMap<Long, Conta> contas = controladorLeitura.leituraContas();
		HashMap<Long, Funcionario> funcionarios = controladorLeitura.leituraFuncionario();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite seu CPF: ");
		long cpf = scanner.nextLong();
		System.out.println("Digite sua SENHA: ");
		int senha = scanner.nextInt();

		if(Autenticador.autentica(funcionarios, clientes, cpf, senha) == true){
			
			Menu.inicioMenu(funcionarios, clientes, contas, cpf, Autenticador.autentica(funcionarios, clientes, cpf, senha));
			
		}
		else  {System.out.println("Acesso Negado");} 
			
			//MenuFuncionario.inicioMenu(funcionarios, contas, cpf);
			
		}
		
		

	}



package br.com.bugados.funcionario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Funcionario {

	private String cargo;

	public Funcionario() {
	}

	public Funcionario(String cargo) {
		this.cargo = cargo;
	}

	public static Map<Integer, Funcionario> lerFuncionarios() throws FileNotFoundException, IOException {

		Map<Integer, Funcionario> mapFuncionario = new HashMap<>();

		String linha1;

		try (BufferedReader csvReader1 = new BufferedReader(new FileReader("Funcionario.txt"))) {
			linha1 = csvReader1.readLine();

			while ((linha1 = csvReader1.readLine()) != null) {

				linha1 = linha1.replace("\"", "");

				String[] data = linha1.split(";");

				String cargo = data[1];
				int id = Integer.parseInt(data[0]);

				Funcionario novoFuncionario = new Funcionario(cargo);

				mapFuncionario.put(id, novoFuncionario);

			}
			return mapFuncionario;
		}
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + "]";
	}

}

package br.com.residenciaserratec.modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gerente extends Funcionario {

	@Override
	public String toString() {
		return "Gerente [agencia=" + agencia + "]";
	}

	private int agencia;

	public Gerente(long cpf, int senha, int agencia) {
		super(cpf, senha);
		this.agencia = agencia;
		this.cargo = "Gerente";

	}

	public int getAgencia() {
		return this.agencia;
	}

	public int numeroDeContas(HashMap<Long, Conta> contas) {
		int totalDeContas = 0;
		for(Map.Entry<Long, Conta> entrada: contas.entrySet()) {
			long cpf = entrada.getKey();
			int ag = entrada.getValue().getAgencia();
			
			if (this.agencia == ag) {
				totalDeContas++;
			}
		}
		return totalDeContas;
	}

	
}

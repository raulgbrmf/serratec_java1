package br.com.residenciaserratec.modelo;

import java.util.HashMap;

public abstract class Funcionario {
			protected long cpf;
			protected int senha;
			protected String cargo;
			
			
			public int getSenha() {
				return senha;
			}

			public long getCpf() {
				return cpf;
			}

			public Funcionario(long cpf, int senha) {
				this.cpf = cpf;
				this.senha = senha;
				this.cargo = "Funcionario";
			}
			
			public String getCargo(){
				return this.cargo;
			}

			public abstract int numeroDeContas(HashMap<Long, Conta> contas);	
}

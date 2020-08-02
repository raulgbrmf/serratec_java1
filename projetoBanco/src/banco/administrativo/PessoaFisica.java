package banco.administrativo;

import banco.administrativo.abstracoes.Pessoa;
import banco.utils.Utils;

public class PessoaFisica extends Pessoa {

	private String cpf;

	public PessoaFisica(String nome,Endereco endereco,String cpf) {
		super(nome, endereco);
		try {
			this.setCpf(cpf);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getCpf() {
		return Utils.imprimeCPF(cpf);
	}

	public void setCpf(String cpf) throws Exception {
		if (Utils.isCPF(cpf)) {
			this.cpf = cpf;
		}
		else {
			throw new Exception("CPF do titular "+ this.nome + " Invalido");
		}
	}
	
	@Override
	public String imprimeDados() {
		return super.imprimeDados() + "\nCPF: "+ this.getCpf();
	}
}

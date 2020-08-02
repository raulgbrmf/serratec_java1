package banco.administrativo;

import banco.administrativo.abstracoes.Pessoa;
import banco.utils.Utils;

public class PessoaJuridica extends Pessoa {

	private String cnpj;

	
	public PessoaJuridica(String nome,Endereco endereco ,String cnpj) {
		super(nome, endereco);
		try {
			this.setCnpj(cnpj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getCnpj() {
		return Utils.imprimeCNPJ(this.cnpj);
	}

	public void setCnpj(String cnpj) throws Exception {
		if (Utils.isCNPJ(cnpj)) {
			this.cnpj = cnpj;
		} else {
			throw new Exception("CNPJ do titular " + this.nome + "Invalido");
		}
	}
	
	
	@Override
	public String imprimeDados() {
		return super.imprimeDados() + "\nCNPJ: "+ this.getCnpj();
	}


}

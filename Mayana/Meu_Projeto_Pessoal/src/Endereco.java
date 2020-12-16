
public class Endereco {
	
	private String rua;
	private String complemento;
	private int numero;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Endereco(String rua, int numero, String complemento, String cep, String bairro, String cidade,
			String estado) {
		super();
		this.rua = rua;
		this.complemento = complemento;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	} 
	
	public String imprimeEndereco() {
		return this.rua + " " + this.numero + " " + this.complemento + "\nCEP:" + this.cep 
				+ "\nBairro: " + this.bairro + "\nCidade: " + this.cidade + "\nEstado: " +
				this.estado;
	}
	
	
	

}

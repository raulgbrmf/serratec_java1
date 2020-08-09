
public class Endereco {
	
	private String rua;
	private String complemento;
	private double numero;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	
	
	public Endereco(String rua, double numero, String complemento, String bairro, String cidade,
			String estado, String cep) {
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
		
		return " " + this.rua + " , " +  this.numero + " , " + this.complemento + " , " + this.bairro + " , " + this.cidade + " , " + this.estado + " , " + this.cep;
	}

}

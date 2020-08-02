package banco.administrativo;

public class Endereco {

	private String rua;
	private String cep;
	private String bairo;
	private String numero;
	private String cidadade;
	private String estado;
	
	Endereco(){
		
	}

	public Endereco(String rua, String cep, String bairo, String numero, String cidadade, String estado) {
		super();
		this.rua = rua;
		this.cep = cep;
		this.bairo = bairo;
		this.numero = numero;
		this.cidadade = cidadade;
		this.estado = estado;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairo() {
		return bairo;
	}

	public void setBairo(String bairo) {
		this.bairo = bairo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidadade() {
		return cidadade;
	}

	public void setCidadade(String cidadade) {
		this.cidadade = cidadade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}

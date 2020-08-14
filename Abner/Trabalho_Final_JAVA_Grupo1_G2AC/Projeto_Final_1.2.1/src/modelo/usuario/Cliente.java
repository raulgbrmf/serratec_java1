package modelo.usuario;

import contas.SeguroDeVida;

public class Cliente extends Usuario {
	
	private SeguroDeVida seguro;	

	public Cliente(String nome, String cpf, String senha) {
		super(nome, cpf, senha);		
	}
	
	private boolean verificaSeguro() {
		if(this.seguro != null) {
			return true;
		}
		
		return false;
	}
	
	public String buscaInformacaoDeSeguro() {
		if(verificaSeguro()) {
			return "" + getSeguro().getImprimeSegurodeVida();
		}
		return "";
	}
	
	public double buscaValorTaxadoSeguro() {
		if(verificaSeguro()) {
			return this.getSeguro().getValorTaxado();
		}
		return 0.0;
	}	
	
	public SeguroDeVida getSeguro() {
		return seguro;
	}
	
	public void contrataSeguro(SeguroDeVida contrato) {
		if(!verificaSeguro()) {
			this.seguro = contrato;
			System.out.println("Seguro contratado com sucesso!");
		}else {
			System.out.println("Cliente ja possui seguro!");
		}
				
	}	
}


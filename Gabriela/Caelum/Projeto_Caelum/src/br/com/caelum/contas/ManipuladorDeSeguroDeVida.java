package br.com.caelum.contas;
import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeSeguroDeVida {

	private SeguroDeVida seguro;
	
	public	void	criaSeguro(Evento	evento){
		this.seguro	=	new	SeguroDeVida();
		this.seguro.setNumeroApolice(evento.getInt("numeroApolice"));
		this.seguro.setTitular(evento.getString("titular"));
		this.seguro.setValor(evento.getDouble("valor"));
}

	
	
}

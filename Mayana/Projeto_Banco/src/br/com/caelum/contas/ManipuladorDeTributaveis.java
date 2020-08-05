package br.com.caelum.contas;
import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.util.Evento;


public class ManipuladorDeTributaveis {

	
	public void calculaImpostos(Evento evento) {
		
		int total = 0;
		int tamanho = evento.getTamanhoDaLista("listaTributaveis");
		
		for (int i = 0; i < tamanho; i++) {
		Tributavel t = evento.getTributavel("listaTributaveis", i);
		total += t.getValorImpostos();
		}
	}
	
	public double getTotal() {
		return getTotal();
		}

	
	
}

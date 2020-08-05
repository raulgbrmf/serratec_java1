package br.com.caelum.contas;

import	br.com.caelum.contas.modelo.TributavelInterface;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladoresDeTributaveis {
		
	private double	total;
	
	public void	calculaImpostos(Evento	evento){
			total =	0;
			int	tamanho	= evento.getTamanhoDaLista("listaTributaveis");
			for	(int i = 0;	i < tamanho; i++) { 
				TributavelInterface t = evento.getTributavel ("listaTributaveis", i);
				total += t.getValorImposto();
	
			}
		}
	
	public double getTotal() {
			return total;
		}
	}
	



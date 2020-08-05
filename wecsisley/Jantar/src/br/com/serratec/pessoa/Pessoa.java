package br.com.serratec.pessoa;

import br.com.serratec.comida.Arroz;
import br.com.serratec.comida.Feijao;
import br.com.serratec.comida.Sorvete;

public class Pessoa {
	
	private String nome;
	private double peso;

	public Pessoa(double peso, String nome) {
		setPeso(peso);
		setNome(nome);
	}
	
	public void comer(Arroz arroz) {
		this.peso += arroz.getPeso();
	}
	public void comer(Feijao feijao) {
		this.peso += feijao.getPeso();
	}
	public void comer(Sorvete sorvete) {
		this.peso += sorvete.getPeso();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if(peso >=0) {
			this.peso = peso;
		}
	}
}

package br.com.serratec.comida;


public abstract class Comida {
	
	
	private String nome;
	private double peso;
	
	public Comida(double peso, String nome) {
		setPeso(peso);
		setNome(nome);
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
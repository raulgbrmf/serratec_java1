package br.com.g2ac.usuario;

import br.com.g2ac.util.Data;

public class Funcionario {

	protected String nome;
	protected double salario;
	private Data dataEntrada;
	public Data admissao;
	private String departamento;
	public String rg;

	public Funcionario() {

	}

	public Funcionario(String nome) {
		this.setNome(nome);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonificacao() {
		return this.salario * 0.10;
	}

	boolean demissao() {
		return false;
	}
	
	/*
	 * this.getDepartamento
	getSalario
	getAdmissao
	getRg 
	 */

	public String mostra() {
		return  "Informações do Funcionário \nNome: " + this.getNome() 
				+ "\nDepartamento: " + this.getDepartamento()
				+ "\nSalário: " + this.salario 
				+ "\nAdmissão: " + admissao.imprimeData()
				+ "\nRG: " + this.rg;
	}

	public Data getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}

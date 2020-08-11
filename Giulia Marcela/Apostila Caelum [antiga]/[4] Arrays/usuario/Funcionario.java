package br.com.g2ac.usuario;

import br.com.g2ac.util.Data;

public abstract class Funcionario {

	public String nome;
	String cpf;
	double salario;
	int senha;
	private Data dataEntrada;

	public Funcionario() {

	}

	public Funcionario(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public abstract double getBonificacao();/*
											 * { //return this.salario * 0.10; }
											 */

	boolean demissao() {
		return false;
	}

	public void mostra() {
		System.out.println("Nome: " + this.nome + "\nSalário: " + this.salario + "\nData de Entrada: "
				+ this.dataEntrada.imprimeData() + "\n" + this.getBonificacao());
	}

	public Data getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
}

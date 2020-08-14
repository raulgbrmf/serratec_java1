package contas;

import java.util.ArrayList;
import java.util.List;

import modelo.contas.ContaCorrente;
import modelo.contas.ContaPoupanca;

public class Agencia {
	
	private int numeroAgencia;	
	
	private ArrayList <ContaCorrente> contaCorrente = new ArrayList<ContaCorrente>();
	private ArrayList <ContaPoupanca> contaPoupanca = new ArrayList<ContaPoupanca>();
	
		
	public Agencia(int id) {
		this.numeroAgencia = id;		
	}
	
	public int getNumeroAgencia() {
		return this.numeroAgencia;
	}		
}

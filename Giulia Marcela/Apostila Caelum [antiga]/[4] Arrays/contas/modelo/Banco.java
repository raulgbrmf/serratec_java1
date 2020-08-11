package br.com.g2ac.contas.modelo;

public class Banco {
	private String nome;
	private int numero;
	private Conta[] contas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
	}

	public String getNome() {
		return this.nome;
	}

	public int getNumero() {
		return this.numero;
	}

	public void adiciona(Conta c) {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] == null) {
				this.contas[i] = c;
				break;
			}
		}
	}

	public void mostraContas() {
		for (Conta c : contas) {
			if(c == null) {
				System.out.println("Conta não foi criada ainda!");
			} else {
				System.out.println("Nome: " + c.getTitular().getNome() + "\nNumero da Conta: " + c.getNumero() + "\nAgencia: "
						+ c.getAgencia() + "\nSaldo: R$ " + c.getSaldo() + "\nTipo de Conta: " + c.getTipo() + "\n");
			}
		}
	}

	public boolean contem(Conta conta) {
		  for (Conta contaAux : contas){
	            if (contaAux.equals(conta)){
	                System.out.println("Conta encontrada" + conta);
	                return true;
	            }
	        }
	        return false;
	}	
}

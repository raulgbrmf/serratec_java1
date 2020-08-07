package br.com.caelum.contas.modelo;

public class Banco {

	private String nome;
	private int numero;
	private Conta[] contas;
	
	public Banco(String nome,int numero) {
		
		this.nome=nome;
		this.numero=numero;
		this.contas=new ContaCorrente[10];
		
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}
	
	/*public void adiciona(Conta c) {
		try {
			for(int i=0;i<this.contas.length;i++) {
			//try {
				if(this.contas[i]==null) {
					this.contas[i]=c;
					break;
				}
				
			}
		}
		catch(Exception e) {
			System.out.println("Não há espaços diponíveis para novas contas.");
		}
	}*/
	
    public void adiciona(Conta c) {
    	boolean cheio=true;
		for(int i=0;i<this.contas.length;i++) {
			
			if(this.contas[i]==null) {
					this.contas[i]=c;
					cheio=false;
					break;
				}
		}
		if(cheio==true)
					System.out.println("Não há espaços diponíveis para novas contas.");
			
	}
	
	public void adiciona2(Conta c) {
    	boolean cheio=true;
		for(int i=0;i<this.contas.length;i++) {
			
			if(this.contas[i]==null) {
					this.contas[i]=c;
					cheio=false;
					break;
				}
		}
		if(cheio==true) {
					System.out.println("Não há espaços diponíveis para novas contas.");
					Conta[] contas2 = new Conta[this.contas.length * 2];
			        for (int i = 0; i < this.contas.length; i++) {
			            contas2[i] = contas[i];
			        }
			        for (int x = contas.length; x < contas2.length; x++) {
			            if (contas2[x] == null) {
			                contas2[x] = c;
			                contas = contas2;
			                break;
						}
					}
		}
			
	}
	
	public int getContasLength() {
		return this.contas.length;
	}
	
	public void monstraContas() {
		
		for	(int i= 0; i < this.contas.length; i++)	{
			if(this.contas[i]!=null) {
				System.out.println("Conta	na	posição	"	+	(i+1));
				System.out.println(this.contas[i].getTitular());
				System.out.println(this.contas[i].getSaldo());
			}
		}
	}
	
	public boolean contem(Conta c) {

		for (int i = 0; i < contas.length; i++) {
	        if (this.contas[i] == c) {
	            System.out.println("Encontrado");
	            return true;
	        }
	   }
		System.out.println("Não encontrado");
	    return false;
	}
	
}

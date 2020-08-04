package fixacaoCap4.casa;

import fixacaoCap4.porta.Porta;

public class Casa {
	private String cor;
	private Porta p1;
	private Porta p2;
	private Porta p3;
	
	public Casa(String cor, Porta p1, Porta p2, Porta p3) {

		this.cor = cor;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public void pinta(String cor)
	{
		setCor(cor);
	}
	
	public int quantasPortasEstaoAbertas()
	{
		int quantidade = 0;
		
		if(p1 != null && p1.isAberta())
		{
			quantidade += 1;
		}
		if(p2 != null && p2.isAberta())
		{
			quantidade += 1;
		}
		if(p3 != null && p3.isAberta())
		{
			quantidade += 1;
		}
		
		return quantidade;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Porta getP1() {
		return p1;
	}
	public void setP1(Porta p1) {
		this.p1 = p1;
	}
	public Porta getP2() {
		return p2;
	}
	public void setP2(Porta p2) {
		this.p2 = p2;
	}
	public Porta getP3() {
		return p3;
	}
	public void setP3(Porta p3) {
		this.p3 = p3;
	}

	@Override
	public String toString() {
		return "Casa [cor=" + cor + ", portas=" + quantasPortasEstaoAbertas() + "]";
	}
	
	
}

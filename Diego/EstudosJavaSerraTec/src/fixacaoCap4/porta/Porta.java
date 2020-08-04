package fixacaoCap4.porta;

public class Porta {
	boolean aberta = false;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;

	public Porta(boolean aberta, String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
		this.aberta = aberta;
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
	}

	void abre() {
		setAberta(true);
	}

	void fecha() {
		setAberta(false);
	}

	void pinta(String cor) {
		setCor(cor);
	}

	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public double getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public double getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

}

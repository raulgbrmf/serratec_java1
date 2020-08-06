
public class Caneta {

	private String modelo;
	private String cor;
	private float ponta;
	private boolean tampada;
	
	
	public Caneta(String m, String c, float p) {
		this.tampar();
		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		
	}
	
	public void status() {
		System.out.println("\nDESCRIÇÃO DE CANETAS:");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Está tampada? " + this.tampada);
		
	}
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro! Não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando!");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false; 
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
}

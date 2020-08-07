
public class GerenciadorDeImpostoDeRenda {

	private double total;

	public void adiciona(Tributavel t) {
		System.out.println("Adicionando tributavel: " + t.getSaldo());
		this.total = this.total + t.calculaTributos();
	}

	public double getTotal() {
		return total;
	}
	

	/*
	 * public void RecebeTributaveis(double total) { 
	 * this.total = ContaCorrente.calculaTributos() + SeguroDeVida.calculaTributos(); }
	 */
}

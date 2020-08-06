
public class Compra implements Autorizavel, Imprimivel {

	private double valorTotal;
	private String produto;
	private String nomeCliente;
	
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public double getValorTotal() {
		return this.valorTotal;
	}

	@Override
	public String getCabecalhoPagina() {
		return getProduto() + " = " + this.getValorTotal();
	}

	@Override
	public String getCorpoPagina() {
		return this.getNomeCliente();
	}

}

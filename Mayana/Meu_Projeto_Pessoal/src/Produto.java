
public class Produto extends Categoria {
	
	protected int id;
	protected String nome_produto;	
	protected double valor_unitario;
	protected int qt_estoque;
	
	public Produto(String nome_produto, double valor_unitario, int qt_estoque) {
		this.nome_produto = nome_produto;		
		this.valor_unitario = valor_unitario;
		this.qt_estoque = qt_estoque;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public double getValor_unitario() {
		return valor_unitario;
	}

	public void setValor_unitario(double valor_unitario) {
		this.valor_unitario = valor_unitario;
	}
	
	
	public String imprimeProduto() {
		return "\nNome Produto: " + this.nome_produto + "\nValor: R$" + this.valor_unitario + "\nEstoque: " + this.qt_estoque + "\n";
	}
	
	
	
	

}

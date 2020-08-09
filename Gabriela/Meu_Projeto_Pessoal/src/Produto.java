
public class Produto extends Categoria {
	protected int id;
	protected String nome_produto;
	protected double valor_unitario;
	protected double qtd_estoque;
	
	
	
	
	
	public Produto(int id, String nome_produto, double valor_unitario, double qtd_estoque) {
		super();
		this.id = id;
		this.nome_produto = nome_produto;
		this.valor_unitario = valor_unitario;
		this.qtd_estoque = qtd_estoque;
	}


	public String imprimeProduto() {
		return this.id + "\n" + this.nome_produto + "\n" + this.valor_unitario + "\n" + this.qtd_estoque;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public double getQtd_estoque() {
		return qtd_estoque;
	}


	public void setQtd_estoque(double qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}
	
	
}

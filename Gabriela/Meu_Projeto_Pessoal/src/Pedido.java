import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pedido {

	protected Date data_pedido;
	private Produto produto;
	private Cliente cliente;
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String imprimePedido(Produto produto, Cliente cliente, Endereco endereco) {

		return "Os dados do pedido são: " + "\nNome do produto: " + produto.nome_produto + "\nQuantidade em estoque: "
				+ produto.qtd_estoque + "\nID do produto: " + produto.id + "\nValor unitário: " + produto.valor_unitario
				+ "\n ==================================" + "\nNome do cliente: " + cliente.nome_completo
				+ "\nTelefone para contato: " + cliente.telefone + "\nE-mail do cliente: " + cliente.email
				+ "\nEndereco para entrega: " + cliente.endereco + "\nA data do pedido é: " + this.getData_pedido();
	}

	public Date getData_pedido() {
		
		Date data = new Date();
		DateFormat dtHora = DateFormat.getDateTimeInstance();
		dtHora.format(data);
		return data;
	}

	public void setData_pedido(Date data_pedido) {
		this.data_pedido = data_pedido;
	}

}

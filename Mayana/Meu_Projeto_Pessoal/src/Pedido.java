import java.text.DateFormat;
import java.util.Date;

public class Pedido {
	
	
		private Date data_pedido;
		private Produto produto;
		private Cliente cliente;
		
				
		public Pedido(Produto produto, Cliente cliente) {
			super();
			this.produto = produto;
			//this.data_pedido = data_pedido;
		}
		
		public Pedido() {
			
		}
		
		public void imprimePedido(Cliente cliente, Produto produto ) {
			System.out.println("Dados do pedido:\n" + produto.imprimeProduto() +
					"\n===============================================\nDados do Cliente:\n" 
					+ cliente.imprimeCliente() 
					+"\nData do Pedido: " + this.getData_pedido());
		}
		
		
		public Produto getProduto() {
			return produto;
		}
		public void setProduto(Produto produto) {
			this.produto = produto;
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

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		} 
		
		
		
		
		
		
	
	
	
	
	

}

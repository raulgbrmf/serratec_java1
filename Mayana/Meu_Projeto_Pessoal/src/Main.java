import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Endereco end = new Endereco("Rua Manuel Torres", 651, "apto 202 bloco D", "25660-313", "Bingen", "Petrópolis", "Rio de Janeiro");
		Cliente c1 = new Cliente("Mayana Ollivier", "123.925.547-06", "(24)99933-1757", "mayana.ollivier@gmail.com");		
		Produto p1 = new Produto("Sapatilha", 100, 10);		
		Pedido ped1 = new Pedido();
		Date data1 = new Date();
		
		
		c1.setEndereco(end);
		
		
		end.imprimeEndereco();
		ped1.imprimePedido(c1, p1);
		//ped1.getData_pedido();

	}

}

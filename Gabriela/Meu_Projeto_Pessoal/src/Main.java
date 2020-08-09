import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		
		Endereco enderecoc1 = new Endereco ("Estrada União e Indústria", 12.987 , "casa", "Itaipava", "Petrópolis", "RJ", "25750-050" );
		Cliente c1 = new Cliente("Gabriela", "123456", "4546546", "gabibi@hotmail.com", enderecoc1.imprimeEndereco());// gambiarra hehe
		
		Produto prod = new Produto(1, "Sapatilha", 100, 10 );
		Pedido ped = new Pedido();
		
		
		/*prod.nome_produto = "Sapatilha";
		prod.valor_unitario = 25;
		prod.qtd_estoque = 5;
		*/
		
		enderecoc1.imprimeEndereco();
		System.out.println(ped.imprimePedido(prod, c1, enderecoc1));
		
		
	}

}

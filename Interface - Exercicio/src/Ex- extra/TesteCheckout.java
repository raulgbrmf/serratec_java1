
public class TesteCheckout {

	public static void main(String[] args) {

		/*Operadora operadora1 = new Cielo();
		Impressora impressora1 = new ImpressoraEPSON();
		
		Cartao cartao1 = new Cartao();
		cartao1.setNomeTitular("Alan Patrik");
		cartao1.setNumeroCartao("123");
		
		Compra compra1 = new Compra();
		compra1.setNomeCliente("João M Couves");
		compra1.setProduto("Desodorante Rexona");
		compra1.setValorTotal(9.99);
		
		Checkout checkout1 = new Checkout(operadora1, impressora1);
		checkout1.fecharCompra(compra1, cartao1);*/
		
		Operadora operadora2 = new MasterCard();
		Impressora impressora2 = new ImpressoraHP();
		
		Cartao cartao2 = new Cartao();
		cartao2.setNomeTitular("Larissa");
		cartao2.setNumeroCartao("321");
		
		Compra compra2 = new Compra();
		compra2.setNomeCliente("Larissa Bastos");
		compra2.setProduto("Maquiagem Rexona");
		compra2.setValorTotal(59.90);
		
		Checkout checkout2 = new Checkout(operadora2, impressora2);
		checkout2.fecharCompra(compra2, cartao2);
	}

}


public class Cielo implements Operadora {

	@Override
	public boolean Autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123")
				&& autorizavel.getValorTotal() < 100;
		
	}

}

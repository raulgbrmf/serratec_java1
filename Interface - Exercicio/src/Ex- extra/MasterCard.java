
public class MasterCard implements Operadora {

	@Override
	public boolean Autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("321")
				&& autorizavel.getValorTotal() < 100;
	}

}

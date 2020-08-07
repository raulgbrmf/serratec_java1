package ExemplosCap;

public class TestaCarro {

	public static void main(String[] args) {
		Carro meuCar = new Carro();
		meuCar.cor = "vermelho";
		meuCar.modelo = "Fusca";
		meuCar.velocidadeAtual = 0;
		meuCar.velocidadeMaxima = 80;
		
		meuCar.liga();
		meuCar.acelera(15);
		System.out.println(meuCar.velocidadeAtual);
	}

}

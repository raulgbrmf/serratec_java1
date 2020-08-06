package br.com.caelum.singleton;

public final class FabricaDeCarro {

	private static FabricaDeCarro instance;
	private static final String texto = "Olá Singleton";

	public static final String singleton = "Esse eu vejo fora da classe!";

	private FabricaDeCarro() {

	}

	public static synchronized FabricaDeCarro getInstance() {
		if (instance == null)
			instance = new FabricaDeCarro();

		return instance;
	}

	public static void CarroMontado() {
		System.out.println("Novo carro pronto");
	}

}

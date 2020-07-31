/* Desafio 2 - singleton design	pattern 
 * fonte https://www.devmedia.com.br/trabalhando-com-singleton-java/23632
 */

public class FabricaDeCarro {
	private static FabricaDeCarro instancia;

	private FabricaDeCarro() {
	}

	public static synchronized FabricaDeCarro getInstance() {
		if (instancia == null) {
			instancia = new FabricaDeCarro();
		}
		return instancia;
	}
}

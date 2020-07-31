/* Teste singleton design pattern */

public class TesteFabricaDeCarro {

	public static void main(String[] args) {
		System.out.println(FabricaDeCarro.getInstance());
		System.out.println(FabricaDeCarro.getInstance());
	}
}

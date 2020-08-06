package br.com.caelum.singleton;

public class TesteFabrica {
	public static void main(String[] args) {
		
		FabricaDeCarro f1 = FabricaDeCarro.getInstance();
		
		System.out.println(f1.singleton);
	}
}

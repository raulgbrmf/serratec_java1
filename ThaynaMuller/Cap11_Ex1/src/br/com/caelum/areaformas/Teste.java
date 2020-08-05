package br.com.caelum.areaformas;

public class Teste {

	public static void main(String[] args) {
		
		AreaCalculavel r = new Retangulo(3,2);
		
		System.out.println(r.calculaArea());
		
		AreaCalculavel q = new Quadrado(8);
		
		System.out.println(q.calculaArea());
		
		AreaCalculavel c = new Circulo(5);
		
		System.out.println(c.calculaArea());
		
	}

}

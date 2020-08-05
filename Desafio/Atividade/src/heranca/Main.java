//Criar 2 modelos de carros que herdam da classe mae (Carro) e fazer com que eles aceleram e freiam.

package heranca;

public class Main {

	public static void main(String[] args) {
		
		
		Carro carro1 = new Tesla();
		
		System.out.println("Tesla");
		
		carro1.Acelerar();
		System.out.println(carro1);		
		carro1.Acelerar();
		System.out.println(carro1);		
		carro1.Acelerar();
		System.out.println(carro1);
		
		System.out.println();
		
		Carro carro2 = new Ferrari();
		
		System.out.println("Ferrari");
		
		carro2.Acelerar();
		System.out.println(carro2);		
		carro2.Acelerar();
		carro2.frear();             //FREAR!!!
		System.out.println(carro2);		
		carro2.Acelerar();
		System.out.println(carro2);

	}

}

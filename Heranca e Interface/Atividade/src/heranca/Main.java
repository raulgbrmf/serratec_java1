//Criar 2 modelos de carros que herdam da classe mae (Carro) e fazer com que eles aceleram e freiam.

package heranca;

public class Main {

	public static void main(String[] args) {
		
		
		Tesla carro1 = new Tesla();
		carro1.ligarAr();
		
		System.out.println("Tesla");
		
		carro1.Acelerar();
		System.out.println(carro1);		
		carro1.Acelerar();
		System.out.println(carro1);		
		carro1.Acelerar();
		System.out.println(carro1);
		
		
		
		
		
		System.out.println();
		
		
		
		
		
		Ferrari carro2 = new Ferrari(350);  //mutei para ferrari para poder usdar a interface.
		carro2.ligarTurbo();
		carro2.ligarAr();
		
		System.out.println("Ferrari");
		
		carro2.Acelerar();
		System.out.println(carro2);		
		carro2.Acelerar();
		System.out.println(carro2);		
		carro2.Frear();               //FREAR!!!
		System.out.println(carro2);		
		carro2.Acelerar();
		System.out.println(carro2);

	}

}

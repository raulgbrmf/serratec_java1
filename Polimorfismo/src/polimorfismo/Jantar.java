package polimorfismo;


//MAIN DO DESAFIO
public class Jantar { 
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa (99.20); //PESO DA PESSOA	
		
		Arroz ingrediente1 = new Arroz(0.1); //PESO ARROZ - EM GRAMAS
		Carne ingrediente2 = new Carne(0.2); //PESO CARNE - EM GRAMAS
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		System.out.println(convidado.getPeso()); //PESO DEPOIS DE COMER
		
		
		Sorvete sobremesa = new Sorvete(0.5);
		
		convidado.comer(sobremesa);
		System.out.println(convidado.getPeso());

		
	}

}

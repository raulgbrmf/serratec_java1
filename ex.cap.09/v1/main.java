package java3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		//cadastro de funcionarios
		int tipo = 0;
		
		do {
			System.out.println("Qual tipo de funcionário deseja cadastrar? "
					+ "\nDigite: Vendedor, Gerente ou Diretor");
			String scanTipo;
			scanTipo = new Scanner(System.in).nextLine();
						
				if("vendedor".equalsIgnoreCase(scanTipo)) {
					tipo = 1;
					break;
				}else if ("gerente".equalsIgnoreCase(scanTipo)) {
					tipo = 2;	
					break;
				}
				else if ("diretor".equalsIgnoreCase(scanTipo)){
					tipo = 3;
					break;
				} 
			 
		} while (true);
				
		cadastro(tipo);

	}
	
	public static void cadastro(int tipo) {
		
		System.out.println("Digite o nome: ");
		switch (tipo) {
		case 1:
			String nome1 = new Scanner(System.in).nextLine();
			vendedor vendedor1 = new vendedor(nome1);			
			System.out.println("Vendedor cadastrado com sucesso");
			break;
			
		case 2:
			String nome2 = new Scanner(System.in).nextLine();
			gerente gerente1= new gerente(nome2);
			System.out.println("Gerente cadastrado com sucesso");
			break;
		
		case 3:
			String nome3 = new Scanner(System.in).nextLine();
			diretor diretor1= new diretor(nome3);
			System.out.println("Diretor cadastrado com sucesso");
			break;
		}
		
	}

}

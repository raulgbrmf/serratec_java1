import java.util.ArrayList;
import java.util.Scanner;

public class ContaMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String auxTitular;
		int opcao , numero , numero2;
		double valor;
		ArrayList<Conta> lc = new ArrayList();	//lc é list conta
		Conta c1 , c2;
		
		do {
			System.out.println("--- MENU ---");
			System.out.println("1) Criar Conta");
			System.out.println("2) Dados Bancarios");
			System.out.println("3) Deposito");
			System.out.println("4) Saque");
			System.out.println("5) Tranferencia");
			System.out.println("0) sair");
			
			System.out.print("Opção: ");
			opcao = scan.nextInt();
			scan.nextLine();//recolhendo o lixo de input
			
			switch (opcao) {
			case 1:				//criando nova conta
				System.out.println("");
				System.out.println("Digite o nome do Titular: ");
				auxTitular = scan.nextLine();
				
				c1 = new Conta(auxTitular);
				lc.add(c1);
				
				break;
				
			case 2:
				System.out.println("Digite o numero da conta: ");	//buscando a conta
				numero = scan.nextInt();
				
				c1 = lc.get(numero - 1);	//buscando a posição dentro do array
				c1.DadosBancarios();
				break;
				
			case 3:
				System.out.println("Digite o numero da conta: ");	//buscando a conta
				numero = scan.nextInt();
				
				c1 = lc.get(numero - 1);
				
				System.out.println("Digite valor do deposito: ");
				valor = scan.nextDouble();
				
				c1.Depositar(valor);
				break;
				
			case 4:
				System.out.println("Digite o numero da conta: ");	//buscando a conta
				numero = scan.nextInt();
				
				c1 = lc.get(numero - 1);
				
				System.out.println("Digite valor do saque: ");
				valor = scan.nextDouble();
				
				c1.Sacar(valor);
				break;
				
			case 5:
				System.out.println("Digite o numero da conta de origem: ");	//buscando a conta
				numero = scan.nextInt();
				c1 = lc.get(numero - 1);
				
				System.out.println("Digite o numero da conta de destino: ");	//buscando a conta
				numero2 = scan.nextInt();
				c2 = lc.get(numero2 - 1);
				
				System.out.println("Digite valor da tranferencia: ");
				valor = scan.nextDouble();
				
				c1.Transferir(c2 , valor);
				break;
				
			default:
				if(opcao != 0 ) {
					System.out.println("Opção Invalida");
				}
				break;
			}
			System.out.println("");			
			
		} while(opcao != 0);
	}

}

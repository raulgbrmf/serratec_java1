package Cap4_Ex1a9;

public class Main {

	public static void main(String[] args) {
		Conta C1 = new Conta();
		Conta C2 = new Conta();
		Data data = new Data();

		C1.setNomeTitular("Thayna");
		C1.setAgencia(21);
		C1.setNum_conta(4874);
		C1.setSaldo(500.00);
		C1.setLimiteDiario(1000.00);
		data.setDia(21);
		data.setMes(04);
		data.setAno(2020);
		C1.setdataDeAbertura(data);

		C2.setNomeTitular("Ezequiel");
		C2.setAgencia(50);
		C2.setNum_conta(3358);
		C2.setSaldo(1000.00);
		C2.setLimiteDiario(5000.00);
		data.setDia(30);
		data.setMes(05);
		data.setAno(2020);
		C2.setdataDeAbertura(data);

		// Transferencia entre contas
		C2.transferencia(600.00, C1);
		System.out.println("Saldo Ezequiel : R$" + C2.getSaldo());
		System.out.println("Saldo Thayna : R$" + C1.getSaldo());

		// Dados da conta
		System.out.println("\n" + C1.recuperaDadosParaImpressao());
		System.out.println("\n" + C2.recuperaDadosParaImpressao());

		// Deposito
		C2.depositar(100.00);
		System.out.println("\nDeposito Realizado com sucesso : R$ " + C2.getSaldo());

		System.out.println("\nRendimento mensal: R$" + C2.calculoRendimento());

		}
	
	}



public class MainConta {

	public static void main(String[] args) {

		Data data1 = new Data(28, 2, 2019);
		Data data2 = new Data(30, 12, 2020);
		
		PessoaFisica cpf1 = new PessoaFisica("123456789");
		PessoaFisica cpf2 = new PessoaFisica("987654321");		
		
		Conta conta1 = new Conta(100, 20, "48", "Mayana");
		conta1.setData_abertura(data1);
		conta1.setPessoa(cpf1);		

		Conta conta2 = new Conta(300, 10, "21", "Pedro");		
		conta2.setData_abertura(data2);
		conta2.setPessoa(cpf2);
				
		 
		if(conta1.deposita(100)) {
			System.out.println("Depósito efetuado com sucesso!\n");
		}
		else {
			System.out.println("Não foi possível executar o depósito!\n");
		}
		
		System.out.println(conta1.recuperaDadosImpressao() + "\n");
		System.out.println("=========================");
		
		if(conta2.deposita(200)) {
			System.out.println("Depósito efetuado com sucesso!\n");
		}
		else {
			System.out.println("Não foi possível executar o depósito!\n");
		}
		
		
		System.out.println(conta2.recuperaDadosImpressao() + "\n"); 
		System.out.println("=========================");
		
		System.out.println("Quantidade de contas abertas : " + Conta.getTotalDeContas());
		
		//System.out.println("Data:" + conta1.getData_abertura().imprimeData());
	}

}

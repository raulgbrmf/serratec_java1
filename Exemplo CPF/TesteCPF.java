package encapsulamento;

public class TesteCPF {

	public static void main(String[] args) {
		
		PessoaFisica pf1 = new PessoaFisica("Rodrigo", "12312312312",false);
		
		System.out.println(pf1.NomeCompleto+" , "+pf1.CPF);
		
		PessoaFisica pf2 = new PessoaFisica("Rodrigo", "12312312312",true);
		
		System.out.println(pf2.NomeCompleto+" , "+pf2.CPF);
		
		//while(pf3.CPF==null) {
			//PessoaFisica pf3 = new PessoaFisica("Rodrigo", "12312312312",true);
	    //}
		
	}

}

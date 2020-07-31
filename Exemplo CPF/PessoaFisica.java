package encapsulamento;

public class PessoaFisica {
		
		String NomeCompleto,CPF;
		
		public PessoaFisica(String NomeCompleto, String CPF, boolean teste) {
			
			//boolean validador=ValidaCPF(CPF);
				try {
					ValidaCPF(teste);//Enviaria o CPF em um modelo real
					System.out.println("Validado.");
				}catch(Exception e) {
				
					System.out.println("Cpf não validado.");
					
				}
			
		}
		
		public void ValidaCPF(boolean CPF) throws Exception{
			//Método de verificação de CPF
			//modelo de exemplo
			if(CPF==false)
			    throw new Exception();
			
		}
}

package br.com.caelum.contas;

public class TestaDivisaoPorZero {

	public static void main(String[] args) {
		int	i	=	5571;
		
		try{
			i	=	i	/	0;
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("O	resultado		"	+	i);

	}

}

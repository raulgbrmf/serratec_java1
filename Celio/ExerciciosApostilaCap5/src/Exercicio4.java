
public class Exercicio4 {

	public static void main(String[] args) {
		Data data = new Data(10, 2, 1997);
		Conta minhaConta = new Conta(1041, "Celio", "407-Centro");
		
		
		System.out.println(minhaConta.getNumero());
		System.out.println(minhaConta.getNomeTitular());
		System.out.println(minhaConta.getAgencia());
		System.out.println(data.dataFormatada());

	}

}
//É necessário o construtor vazio para que a construção seja opicional pois quando
//criamos um construtor ele substitui o default, que não recebe parâmetros e não retorna nada.
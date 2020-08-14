public class Main {

	public static void main(String[] args) {

		Conta c1 = new Conta("Hugo", 123, "45678-9", 50.0, new Data(04, 06, 2015));
		c1.deposita(100);
		c1.saca(20.00);

		System.out.println(c1);

	}
}
package conta_bancaria.testeSingleTon;

public class SingleTon {

	public static SingleTon INSTANCE;

	public static synchronized SingleTon getInstance() {	
		if(INSTANCE  == null) {
			INSTANCE = new SingleTon();
		}
		return INSTANCE;
	}
	
}

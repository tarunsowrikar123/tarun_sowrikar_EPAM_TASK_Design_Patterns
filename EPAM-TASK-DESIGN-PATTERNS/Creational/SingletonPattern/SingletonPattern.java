public class SingletonPattern {
	private static final SingletonPattern instance = new SingletonPattern() ;
	private SingletonPattern() {
		//private constructor
	}
	public static SingletonPattern getInstance() {
		return instance;
	}
	public void showMessage() {
		System.out.println("This is singleton class");
	}
}

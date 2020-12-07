package SingletonExample;

// 객체가 한번이상 생성될 필요가 없는 클래스에서 Singleton class 사용

public class Singleton {
	private static Singleton singleton =  new Singleton();
	private Singleton() {
		System.out.println("Singleton Instance created");
	}
	public static Singleton getInstance() {
		return singleton;
	}

}

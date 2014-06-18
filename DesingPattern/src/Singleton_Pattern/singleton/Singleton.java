package Singleton_Pattern.singleton;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	public static Singleton getInstance() {
		return singleton;
	}
	
	private Singleton() {
		System.out.println("인스턴스를 생성했습니다.");
	}
	
}

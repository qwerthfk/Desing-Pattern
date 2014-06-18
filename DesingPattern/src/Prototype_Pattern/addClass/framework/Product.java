package Prototype_Pattern.addClass.framework;

//Cloneable 인터페이스를 상속하는 Product 인터페이스를 
//구현하는 클래스의 인스턴스는 clone 메소드를 사용 가능
public interface Product extends Cloneable {
	public abstract void use(String s);
	public abstract Product createClone();
}

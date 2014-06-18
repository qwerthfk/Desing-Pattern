package Prototype_Pattern.product_class.framework;

public abstract class Product implements Cloneable {
	public abstract void use(String s);
	public final Product createClone() {
	  // TODO Auto-generated method stub
	  Product p = null;
	  try {
	  	p = (Product) clone(); 
	  	/*
	  	 * clone() 메소드는 자신의 클래스(혹은 하위클래스)에서만 호출가능,
	  	 * 즉, 다른 클래스의 요청으로 복제 하는 경우 createClone과 다른 메소드를 이용해 clone 기술
	  	 * clone 메소드의 반환값은 복사해서 만들어진 인스턴스가 됩니다.
	  	 * (원래 인스턴스와 같은 크기의 메모리를 확보해서, 그 인스턴스의 필드 내용 복사)
	  	 */
	  } catch(CloneNotSupportedException e) {
	  	e.printStackTrace();
	  }
	  return p;
  }
}

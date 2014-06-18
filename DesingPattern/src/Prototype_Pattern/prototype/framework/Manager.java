package Prototype_Pattern.prototype.framework;

import java.util.HashMap;

/*
 * Product 인터페이스를 사용하여 인스턴스의 복제를 실행하는 클래스
 * 
 * register 메소드에서 제품의 이름과 Product 인터페이스가 주어지면 그 쌍을 저장
 * 여기서 Product 형의 proto는 실제 클래스는 모르지만 Product 인터페이스를 
 * 구현한 클래스의 인스턴스(즉, use나 createClone메소드를 호출할 수 있는 인스턴스)
 * 
 * Product 나 Manager 클래스에 MessageBox 나 UnderlineBox 클래스의 클래스 이름이
 * 전혀 나오지 않는다. 이는, 이 클래스들이 Product나 Manager 클래스와 독립적으로
 * 수정할 수 있다는 것이다. 소스안에 클래스의 이름을 쓰면 밀접한 관계가 생긴다.
 * 
 * 그러므로, Manager 클래스에서는 구체적인 개개의 클래스 이름을 쓰지 않고 
 * 단지 Product라는 인터페이스 이름만 사용, 이 인터페이스만이 Manager 클래스와
 * 다른 클래스의 다리 역할을 한다.
 */
public class Manager {
	
	private HashMap hashMap = new HashMap();
	
	public void register(String name, Product proto) {
		hashMap.put(name, proto);
	}
	
	public Product create(String protoName) {
		Product p = (Product)hashMap.get(protoName);
		return p.createClone();
	}
	
}

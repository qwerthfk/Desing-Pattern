package Visitor_Pattern.dfVisitor;

// 방문자를 받아들이는 인터페이스.
// Visitor 클래스가 마리아라면 Element 인터페이스는 여인숙에 해당
// Element 인터페이스를 구현하고 있는 클래스의 인스턴스가 실제의 여인숙.
public interface Element {

	public abstract void accept(Visitor v);
	
}

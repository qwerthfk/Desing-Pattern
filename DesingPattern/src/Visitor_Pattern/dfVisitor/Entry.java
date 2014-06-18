package Visitor_Pattern.dfVisitor;

import java.util.Iterator;

/* Element 인터페이스를 구현. (Composite 패턴과 본질적으로 같다.)
 * Entry 클래스를 Visitor 패턴에 적용시키기 위해서이다.
 * Element 인터페이스에서 선언되고 있는 추상 메소드 accept를 실제로 구현하는 것은 Entry 의 하위 클래스들.
 */
public abstract class Entry implements Element {

	public abstract String getName();     // 이름을 얻는다
	public abstract int getSize();			  // 사이즈를 얻는다
	
	// 이 메소드는 Directory 클래스에서만 유효하므로 Entry 클래스에서는 에러로 처리.
	public Entry add(Entry entry) throws FileTreatmentException { 
		throw new FileTreatmentException();
	}
	
//이 메소드는 Directory 클래스에서만 유효하므로 Entry 클래스에서는 에러로 처리.
	public Iterator iterator() throws FileTreatmentException {
		throw new FileTreatmentException();
	}
	
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}

}

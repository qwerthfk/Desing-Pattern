package Composite_Pattern.entryComposite;

/* Entry 클래스 
 * - 추상클래스로서 디렉터리 엔트리를 표현,
 * - 하위 클래스인 File 클래스와 Directory 클래스를 만듦.
 */
public abstract class Entry {

	protected Entry parent;
	public abstract String getName(); // 디렉터리 엔트리의 '이름'을 얻기위한 메소드(하위클래스에서 구현)
	public abstract int getSize(); // 디렉터리 엔트리의 '크기'를 얻기 위한 메소드(하위클래스에서 구현)
	
	/* 디렉터리 안에 파일이나 디렉터리(즉, 디렉터리 엔트리)를 넣는 메소드.
	 * 그러나 add를 구현하는 것은 디렉터리를 나타내는 하위 클래스인 Directory 클래스의 계층.
	 * Entry 클래스 계층에서는 예외를 제공해서 에러가 발생하도록 한다. */
	public Entry add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}
	// '종류'를 표시하는 메소드
	public void printList() {
		printList(""); // 오버로드
	}
	
	protected abstract void printList(String prefix); // prefix를 앞에 붙여서 종류를 표시
	
	public String toString() {
		return getName() + " (" + getSize() +")";
	}
	// getName이나 getSize는 추상 메소드이지만 하위 클래스에서 이 두 메소드를 구현하며 toString에서 호출 
	// !!!!(TemplateMethod 패턴)!!!!
	
	public String getFullName() {
		StringBuffer fullname = new StringBuffer();
		Entry entry = this;
		do {
			fullname.insert(0, "/" + entry.getName());
			entry = entry.parent;
		} while (entry != null);
		return fullname.toString();
	}
}

package Composite_Pattern.entryComposite;

// 파일을 표현하는 클래스, Entry 클래스의 하위 클래스로 선언.
public class File extends Entry {
	
	private String name;
	private int size;
	
	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSize() {
		return this.size;
	}
	
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		// "/"+this라는 연산을 하지만 문자열과 오브젝트를 더하면 자동적으로 그 오브젝트의 toString 메소드 호출.
		// "/"+this = "/"+this.toString() = "/"+toString()
	}

}

package Composite_Pattern.entryComposite;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
	
	private String name;
	private ArrayList directory = new ArrayList(); // 디렉터리 엔트리의 집합
	
	public Directory(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSize() {
		int size = 0;
		Iterator it = directory.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next(); // entry 가 File 인스턴스일지도 Directory 인스턴스일지도 모른다.
			size += entry.getSize(); // 동일한 메소드 getSize로 크기를 얻을 수 있다. (재귀적으로 getSize 호출)
		}													 // 이것이 Composite 패턴의 특징인 '그릇과 내용물의 동일시'를 나타낸다.
		return size;							 // Entry의 하위 클래스로서 다른 클래스가 만들어져도, getSize 메소드를 구현하므로 Directory 클래스의 이부분을 수정할 필요가 없다.
	}
	
	public Entry add(Entry entry) { // 이 entry 는 실제로 Directory 클래스의 인스턴스인지 File 클래스의 인스턴스인지 조사할 필요 없이 directory 필드에 추가.
		directory.add(entry);
		entry.parent = this;
		return this;
	}
	
	protected void printList(String prefix) { // 재귀적 호출
		System.out.println(prefix + "/" + this);
		Iterator it = directory.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			entry.printList(prefix + "/" + name);
		}
	}

}

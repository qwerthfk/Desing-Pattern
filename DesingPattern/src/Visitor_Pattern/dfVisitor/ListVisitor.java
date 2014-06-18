package Visitor_Pattern.dfVisitor;

import java.util.Iterator;

/* Visitor 클래스의 하위 클래스, 데이터 구조를 돌아다니면서 종류를 표시하기 위한 클래스.
 * visit() 메소드와 accept()메소드가 서로를 호출
 */
public class ListVisitor extends Visitor {

	private String currentdir = ""; // 현재 주목하는 디렉터리 이름

	// 파일을 방문했을 때 File 클래스의 accept 메소드 내에서 호출.
	// 'File 클래스의 인스턴스에 대해서 실행해야 할 처리'를 기술하는 장소.
	public void visit(File file) { // file은 방문한 File 클래스의 인스턴스
		System.out.println(currentdir + "/" + file);
	}

	// 파일을 방문했을 때 directory 클래스의 accept 메소드 내에서 호출.
	// 'directory 클래스의 인스턴스에 대해서 실행해야 할 처리'를 기술하는 장소.
	public void visit(Directory directory) {   // directory는 방문한 directory 클래스의 인스턴스
		System.out.println(currentdir + "/" + directory);
		String savedir = currentdir;
		currentdir = currentdir + "/" + directory.getName();
		Iterator it = directory.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			entry.accept(this);
		}
		currentdir = savedir;
	}
}

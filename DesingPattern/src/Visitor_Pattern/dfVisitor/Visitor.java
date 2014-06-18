package Visitor_Pattern.dfVisitor;

// 파일과 디렉터리를 방문하는 방문자를 나타내는 추상 클래스
// 이 방문자는 방문할 곳의 데이터 구조(죽, File과 Directory)에 의존.
public abstract class Visitor {

	public abstract void visit(File file);
	public abstract void visit(Directory directory);
	
}

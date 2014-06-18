package Builder_Pattern.documentBuilder;

// '문서'를 만들 메소드들을 선언하고 있는 추상 클래스
public abstract class Builder {

	public abstract void makeTitle(String title); // 타이틀
	public abstract void makeString(String str); // 문자열
	public abstract void makeItems(String[] items); // 개별 항목을 문서 안에 구축
	public abstract void close(); // 문서를 완성
	
}

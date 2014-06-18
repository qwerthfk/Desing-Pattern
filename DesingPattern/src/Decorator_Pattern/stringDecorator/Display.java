package Decorator_Pattern.stringDecorator;

// 복수 행으로 구성되는 문자열을 표시하기 위한 추상 클래스
public abstract class Display {

	public abstract int getColumns();  // 가로 문자수를 얻는다
	public abstract int getRows(); 		 // 세로 행수를 얻는다.
	public abstract String getRowText(int row);		// row번째의 문자열을 얻는다
	public final void show() {									  // 전부 표시한다.
		for(int i=0; i< getRows(); i++) {
			System.out.println(getRowText(i));
		}
	}
}
// show()는 getRows 와 getRowText라는 추상 메소드를 사용한 Template Method 패턴.

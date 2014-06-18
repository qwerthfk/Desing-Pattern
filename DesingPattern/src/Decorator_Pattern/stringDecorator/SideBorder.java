package Decorator_Pattern.stringDecorator;

// 장식의 일종으로 문자열의 좌우에 정해진 문자(borderChar)로 장식하는 클래스.
public class SideBorder extends Border {
	private char borderChar;    // 장식이 되는 문자
	public SideBorder(Display display, char ch) {  
		super(display);  //장식이 감싸는 내용물의 문자
		this.borderChar = ch;
	}
	
	public int getColumns() {  // 표시 문자의 가로 문자수를 얻는 메소드
		return 1+display.getColumns()+1;
	}

	public int getRows() {
	  return display.getRows();
  }

	public String getRowText(int row) {
	  return borderChar + display.getRowText(row) + borderChar;
  }


}

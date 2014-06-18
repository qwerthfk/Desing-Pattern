package Decorator_Pattern.stringDecorator;

// 1행의 문자열을 표시하는 클래스, 생일 케이크의 중심에 있는 스펀지 케이크
public class StringDisplay extends Display {

	private String string; // 표시할 문자열

	public StringDisplay(String string) {
		this.string = string;
	}

	public int getColumns() { // 문자수
		return string.getBytes().length;
	}

	public int getRows() { // 행수는 1
		return 1;
	}

	public String getRowText(int row) {
		if (row == 0) {
			return string;
		} else {
			return null;
		}
	}

}

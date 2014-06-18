package Decorator_Pattern.stringDecorator;

// 상하좌우 장식을 하는 클래스, 장식할 문자가 고정되어 있다
public class FullBorder extends Border {

	public FullBorder(Display display) {
	  super(display);
  }

	public int getColumns() {
		return 1+display.getColumns()+1;
  }

	public int getRows() {
	  return 1+display.getRows()+1;
  }

	public String getRowText(int row) {
	  if (row == 0) {  // 장식의 상단
	  	return "+" + makeLine('-', display.getColumns()) + "+";
	  } else if (row == display.getRows()+1) { // 장식의 하단
	  	return "+" + makeLine('-', display.getColumns()) + "+";
	  } else {
	  	return "|" + display.getRowText(row-1) + "|";
	  }
  }

	private String makeLine(char ch, int count) {
	  StringBuffer buf = new StringBuffer();
	  for(int i=0; i<count; i++) {
	  	buf.append(ch);
	  }
	  return buf.toString();
  }

	

}

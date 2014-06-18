package Bridge_Pattern.displayBridge;

/* 이 클래스는 문자열을 표시하는 '구현'의 클래스.
	 단지 표시하는 것이 아니라 메서드를 사용해 표시를 실행.  */
public class StringDisplayImpl extends DisplayImpl {
	
	private String string;  // 표시해야 할 문자열
	private int width;			// 바이트 단위로 게산할 문자열의 '길이'
	public StringDisplayImpl(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}
	
	public void rawOpen() {
	  // TODO Auto-generated method stub
	  printLine();
  }

	public void rawPrint() {
	  // TODO Auto-generated method stub
	  System.out.println("|" + string + "|"); 
  }

	public void rawClose() {
	  // TODO Auto-generated method stub
	  printLine();
  }

	private void printLine() {
	  // TODO Auto-generated method stub
	  System.out.print("+");
	  for(int i=0; i<width; i++) {
	  	System.out.print("-");
	  }
	  System.out.println("+");
  }
	
}

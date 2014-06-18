package Bridge_Pattern.displayBridge;


// 문자로 표시하는 '구현'을 나타내는 클래스
public class CharDisplayImpl extends DisplayImpl {
	
	private char head;
	private char body;
	private char foot;
	
	public CharDisplayImpl(char head, char body, char foot) {
		this.head = head;
		this.body = body;
		this.foot = foot;
	}
	
	public void rawOpen() {
	  // TODO Auto-generated method stub
	  System.out.print(head);
  }
	public void rawPrint() {
	  // TODO Auto-generated method stub
	  System.out.print(body);
  }
	public void rawClose() {
	  // TODO Auto-generated method stub
	  System.out.println(foot);
  }

}

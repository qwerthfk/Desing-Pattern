package Bridge_Pattern.displayBridge;

/* '기능'의 클래스 계층
   Display 클래스에는 '표시한다'는 기능밖에 없지만 
   이 클래스는 '지정횟수만큼 표시한다'는 기능 추가. */
public class CountDisplay extends Display {

	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}
	
	// Display 클래스에서 상속받은 open(), print(), close() 메소드를 사용해서 새로운 메소드 추가.
	public void multiDisplay(int times) {
		open();
		for(int i=0; i<times; i++) {
			print();
		}
		close();
	}
	
}

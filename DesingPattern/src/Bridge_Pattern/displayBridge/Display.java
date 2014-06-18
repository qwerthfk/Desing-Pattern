package Bridge_Pattern.displayBridge;

/* '기능'의 클래스 계층의 최상위 클래스로 추상적인 '무언가를 표시하는 것'.
 * 
 */
public class Display {

	private DisplayImpl impl; // '표시한다'는 '구현'의 클래스 계층의 최상위 클래스
														// 이 필드가 두 클래스 계층의 '다리'가 된다.
	
	public Display(DisplayImpl impl) { // 구현을 나타내는 클래스의 인스턴스를 전달
		this.impl = impl;  // 인수로 전달된 인스턴스는 impl 필드에 저장 된 후 처리에 사용
	}
	
	// 아래 3개의 메소드는 Display 클래스가 제공하는 인터페이스(API)에서 표시를 실행하는 순서를 나타냄
	public void open() {  // 표시의 전처리
		impl.rawOpen(); // 메소드 실현을 위해 impl 필드의 구현 메소드를 이용
										// 여기서 Display의 인터페이스(API)가 DisplayImpl의 인터페이스(API)로 변환.
	}
	
	public void print() { // 표시 그 자체
		impl.rawPrint();
	}
	
	public void close() { // 표시의 후처리
		impl.rawClose();
	}
	
	// open, print, close 라는 Display의 인터페이스(API)를 이용해서 '표시한다' 라는 처리를 실현.
	public final void display() { 
		open();
		print();
		close();
	}
}

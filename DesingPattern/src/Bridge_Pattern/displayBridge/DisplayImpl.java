package Bridge_Pattern.displayBridge;

/* '구현'의 클래스 계층의 최상위 클래스.
    세 가지 메소드들은 Display 클래스의 open, print, close에 각각 대응하며 전처리, 표시, 후처리를 실행
*/
public abstract class DisplayImpl {

	public abstract void rawOpen();
	public abstract void rawPrint();
	public abstract void rawClose();

}

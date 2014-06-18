package Adapter_Pattern.PrintBannerAdapter2;

//PrintBannerAdapter2는 위임을 사용한 Adapter 패턴이다.

 /* 이전 예에서는 자신의 상위 클래스에서 상속한 메서드를 호출했지만,
 *  이번에는 필드를 경유해서 호출하고 있다. 
 *  즉, 위임을 하고있다. (showWithParen, showWithAster 메서드 에게)
 */

public class AdapterMain {

	public static void main(String[] args) {
		
	  Print p = new PrintBanner("Hello");
	  // 이 클래스는 PrintBanner 인스턴스를 Print 인터페이스형의 변수로 대입
	  
	  /* 즉, Banner클래스나 showWithParen, showWithAster 메소드는
	  		  Main클래스 소스코드 상 완전 감추어 있다.(PrintBanner 클래스 또한)
	        이는 마치 노트북이 직류 12볼트만 제공하면 제대로 작동하지만,
	        작동을 할 수 있도록 어댑터를 통해서 교류 100볼트가 제공되고
	        있는 것은 모르는 것과 같다.
	   Main클래스를 전혀 변경하지 않고 PrintBanner 클래스의 구현을 바꿀 수 있다.
	  */
	  p.printWeak();
	  p.printString();
	  
  }
}

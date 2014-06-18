package Decorator_Pattern.stringDecorator;

/* '장식'을 나타내는 추상클래스
 * 장식을 표시하는 클래스이지만 문자열 표시를 실행하는 Display 클래스의 하위클래스로 정의.
 * 상속에 의해 "장식은 내용물과 동일한 메소드"를 가진다
 * 		=> 인터페이스(API)적으로 장식과 내용물을 동일시할 수 있다는 의미.
 * 
 * Border 클래스는 Display 형의 display를 가지고 있다 => 장식으로 싸여 있는 '내용물'
 * but!!! 이 내용물이 StringDisplay의 인스턴스라고 단정짓기 어렵다!
 * 				Border도 하위 클래스이므로 또 다른 장식(Border 클래스의 하위 클래스 인스턴스)일지도 모른다.
 */
public abstract class Border extends Display {
	
	protected Display display; // 장식이 둘러싸고 있는 '내용물'
	protected Border(Display display) {  // 인스턴스 생성시에 '내용물'을 인수로 지정
		this.display = display;
	}
}

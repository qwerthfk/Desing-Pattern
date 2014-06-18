package Builder_Pattern.changeMakeTitle;

//Builder 클래스로 선언되어 있는 메소드를 사용해서 문서를 만든다.
public class Director {
	
	private Builder builder;
	public Director(Builder builder) { // Builder의 하위 클래스의 인스턴스가 주어진다.
		this.builder = builder;           // 주어진 Builder 클래스의 하위 클래스 종류에 따라
	}																		// Director 클래스가 만들 구체적인 문서의 형식이 정해짐
	
	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeString("아침과 낮에");
		builder.makeItems(new String[]{"좋은 아침입니다.", "안녕하세요."});
		
		builder.makeString("밤에");
		builder.makeItems(new String[]{"안녕하세요.", "안녕히 주모세요.", "안녕히 계세요."});
		builder.close();
	}
}

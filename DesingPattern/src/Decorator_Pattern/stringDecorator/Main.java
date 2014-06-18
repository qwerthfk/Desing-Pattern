package Decorator_Pattern.stringDecorator;

public class Main {

	public static void main(String[] args) {
	  Display b1 = new StringDisplay("Hello, wordl.");
	  Display b2 = new SideBorder(b1, '#');
	  Display b3 = new FullBorder(b2);
	  b1.show();
	  b2.show();
	  b3.show();
	  
	  Display b4 = new SideBorder(
	  								new FullBorder(
	  										new FullBorder(
	  												new SideBorder(
	  														new FullBorder(
	  																new StringDisplay("Hello")), '*' ) ) ) , '/' );
	  b4.show();
	  
	  Display b5 = new UpdownBorder(b1, '-');
	  b5.show();
	  
	  MultiStringDisplay md = new MultiStringDisplay();
	  md.add("안녕하세요");
	  md.add("좋은 아침입니다!");
	  md.add("안녕히 주무세요. 내일 만나요.");
	  md.show();
  }

	
}

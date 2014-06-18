package Factory_Method_Pattern;

import Factory_Method_Pattern.framework.*;
import Factory_Method_Pattern.idcard.*;


public class Main {

	public static void main(String[] args) {
	  Factory factory = new IDCardFactory();
	  Product card1 = factory.create("홍길동");
	  Product card2 = factory.create("이순신");
	  Product card3 = factory.create("김소라");
	  card1.use();
	  card2.use();
	  card3.use();

  }
}

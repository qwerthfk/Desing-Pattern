package Prototype_Pattern.addClass;

import Prototype_Pattern.prototype.anonymous.*;
import Prototype_Pattern.prototype.framework.*;

public class Main {

	public static void main(String[] args) {
	  
		//준비
		Manager manager = new Manager();
		MessageBox msb1 = new MessageBox('*');
		MessageBox msb2 = new MessageBox('-');
		UnderlinePen ulp = new UnderlinePen('-');
		manager.register("msb1" ,msb1);
		manager.register("msb2", msb2);
		manager.register("ulp", ulp);
		
		//생성
		Product p1 = manager.create("msb1");
		p1.use("Hello, word");
		Product p2 = manager.create("msb2");
		p2.use("Hello, word");
		Product p3 = manager.create("ulp");
		p3.use("Hello, word");
  }
}

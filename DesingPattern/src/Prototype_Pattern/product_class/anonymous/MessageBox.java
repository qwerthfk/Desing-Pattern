package Prototype_Pattern.product_class.anonymous;

import Prototype_Pattern.product_class.framework.Product;


public class MessageBox extends Product {

	private char decochar;
	
	public MessageBox(char decochar) {
		this.decochar = decochar;
	}
	
	public void use(String s) {
	  // TODO Auto-generated method stub
	  int length = s.getBytes().length;
	  for(int i=0; i<length+4; i++) {
	  	System.out.print(decochar);
	  }
	  System.out.println("");
	  System.out.println(decochar + "" + s + "" + decochar);
	  for(int i=0; i<length+4; i++) {
	  	System.out.print(decochar);
	  }
	  System.out.println("");
  }


}

package Prototype_Pattern.prototype.anonymous;

import Prototype_Pattern.prototype.framework.Product;

public class UnderlinePen implements Product{
	
	private char ulchar;
	
	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}

	public void use(String s) {
	  // TODO Auto-generated method stub
	  int length = s.getBytes().length;

	  System.out.println("\"" + s + "\"");
	  System.out.print(" ");
	  for(int i=0; i<length; i++) {
	  	System.out.print(ulchar);
	  }
	  System.out.println("");
  }

	public Product createClone() {
	  // TODO Auto-generated method stub
	  Product p = null;
	  try {
	  	p = (Product)clone(); 
	  	/*
	  	 * clone() 메소드는 자신의 클래스(혹은 하위클래스)에서만 호출가능,
	  	 * 즉, 다른 클래스의 요청으로 복제 하는 경우 createClone과 다른 메소드를 이용해 clone 기술
	  	 */
	  } catch(CloneNotSupportedException e) {
	  	e.printStackTrace();
	  }
	  return p;
  }
	
	

}

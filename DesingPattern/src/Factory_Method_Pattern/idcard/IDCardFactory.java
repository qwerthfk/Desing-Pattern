package Factory_Method_Pattern.idcard;

import java.util.*;

import Factory_Method_Pattern.framework.Factory;
import Factory_Method_Pattern.framework.Product;

//IDCard 의 인스턴스를 생성해서 '제품을 만드는 일'을 실현
public class IDCardFactory extends Factory{

	private HashMap database = new HashMap();
	private int serial = 100;

	protected synchronized Product createProduct(String owner) {
	  // TODO Auto-generated method stub
	  return new IDCard(owner, serial++);
  }

	protected void registerProduct(Product product) {
	  // TODO Auto-generated method stub
	  //owners.add(((IDCard)product).getOwner());
		IDCard card = (IDCard)product;
		database.put(new Integer(card.getSerial()), card.getOwner());
  }

	public HashMap getDatabase() {
		//return owners;
		return database;
	}
}

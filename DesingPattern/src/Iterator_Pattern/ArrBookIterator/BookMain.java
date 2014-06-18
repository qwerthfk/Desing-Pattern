package Iterator_Pattern.ArrBookIterator;
import java.util.Iterator;

// Iterator 디자인 패턴

/*
 * 집합체 외부에 Iterator 사용, 구현과 분리해서 셀 수 있으므로
 * Iterator 패턴의 등장인물
 *  - Iterator(반복자)의 역할
 *  		요소를 순서대로 검색해가는 인터페이스(API), hasNext(), next()
 *  
 *  - ConcreteIterator(구체적인 반복자)의 역할
 *  		Iterator가 결정한 인터페이스(API)를 실제로 구현.
 *  		BookShelfIterator 클래스.
 *  		검색하기 위해 필요한 정보 가지고 있어야 한다.
 *  		BookShelf 클래스의 인스턴스와 index 필드가 필요하다.
 *  
 *   - Aggregate(집합체)의 역할
 *   		Iterator 역할을 만들어내는 인터페이스(API)를 결정.
 *   		내가 가지고 있는 요소를 순서대로 검색해 주는 사람을 만들어주는 메소드.
 *   		Aggregate 인터페이스가 이 역할을 담당하며,
 *   		iterator 메소드를 결정한다.
 *   
 *   - ConcreteAggregate(구체적인 집합체)의 역할
 *   		Aggregate 역할이 결정한 인터페이스를 실제로 구현.
 *   		구체적인 Iterator의 역할, 즉 ConcreteInterator 역할의 인스턴스를 생성.
 *      BookShelf 클래스가 이 역할 담당, iterator 메소드 구현	
 */


public class BookMain {

	public static void main(String[] args) {
	  BookShelf bookShelf = new BookShelf(4);
	  bookShelf.appendBook(new Book("Around the World in 80 Days"));
	  bookShelf.appendBook(new Book("Bible"));
	  bookShelf.appendBook(new Book("Cinderella"));
	  bookShelf.appendBook(new Book("Daddy-Long-Legs"));
	  
	  Iterator it = bookShelf.iterator();
	  while(it.hasNext()) {
	  	Book book = (Book)it.next();
	  	System.out.println(book.getName());
	  }
  }
}

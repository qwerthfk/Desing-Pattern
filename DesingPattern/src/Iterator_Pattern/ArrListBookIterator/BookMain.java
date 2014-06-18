package Iterator_Pattern.ArrListBookIterator;

import java.util.Iterator;

public class BookMain {

	public static void main(String[] args) {
	  BookShelf bookShelf = new BookShelf(2);
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
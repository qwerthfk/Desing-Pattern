package Iterator_Pattern.ArrListBookIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf implements Aggregate{

	private ArrayList books;
	
	public BookShelf(int initialSize){
		this.books = new ArrayList(initialSize);
	}
	
	public Book getBookAt(int index) {
		return (Book)books.get(index);
	}
	
	public void appendBook(Book book) {
		books.add(book);
	}

	public int getLength() {
		return books.size();
	}
	
	public Iterator iterator() {
	  // TODO Auto-generated method stub
	  return new BookShelfIterator(this);
  }

}

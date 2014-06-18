package Iterator_Pattern.ArrBookIterator;

import java.util.Iterator;

public class BookShelfIterator implements Iterator {

	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	public boolean hasNext() {
	  // TODO Auto-generated method stub
	  if(index<bookShelf.getLength()) {
	  	return true;
	  } else {
	  	return false;
	  }
  }

	public Object next() {
	  // TODO Auto-generated method stub
	  Book book = bookShelf.getBookAt(index++);
	  return book;
  }
	
	
}

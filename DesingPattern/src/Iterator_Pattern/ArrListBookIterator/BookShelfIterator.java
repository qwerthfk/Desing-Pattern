package Iterator_Pattern.ArrListBookIterator;

import java.util.Iterator;

public class BookShelfIterator implements Iterator{

	private BookShelf bookShelf;
	private int idx;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.idx = 0;
	}
	
	public boolean hasNext() {
		if(idx < bookShelf.getLength())
			return true;
		else
			return false;
	}
	
	public Object next() {
		Book book = bookShelf.getBookAt(idx++);
		return book;
	}
}

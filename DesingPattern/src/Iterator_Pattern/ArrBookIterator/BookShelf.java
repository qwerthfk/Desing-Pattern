package Iterator_Pattern.ArrBookIterator;

import java.util.Iterator;

public class BookShelf implements Aggregate {

	Book[] books;
	int last = 0;
	
	public BookShelf(int maxSize) {
		this.books = new Book[maxSize];
	}
	
	public Book getBookAt(int index) {
		return books[index];
	}
	
	public void appendBook(Book book) {
		this.books[last++] = book;
	}
	
	public int getLength() {
		return last;
	}

	public Iterator iterator() {
	  // TODO Auto-generated method stub
	  return new BookShelfIterator(this);
  }
}

package bookStore;
//ctrl+shift+o importları duzenler

import java.util.ArrayList;

public class ShoppingCard {
	ArrayList<Book> contents;

	public ShoppingCard() {
		contents = new ArrayList<>();
	}
	
	public void addBok(Book book) {
		contents.add(book);
	}
	 
	public int numOfEntriesInTheCart() {
		return contents.size();
	}
	
}

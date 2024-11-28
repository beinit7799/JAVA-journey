package Java_Collection;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Book_test {
	
	public static void main(String[] args) {
		
			List_book b1 = new List_book();
			b1.setTitle("Science");
			b1.setAuthor("Ramu");
			b1.setPrice(100);
			b1.setPublication("kathmandu");
			
			List_book b2 = new List_book();
			b2.setTitle("math");
			b2.setAuthor("hari");
			b2.setPrice(150);
			b2.setPublication("Daphe");
			

			List<List_book> bookList = new ArrayList<>();
			

			bookList.add(b1);
			bookList.add(b2);

			
			for(List_book bok : bookList) {
				System.out.println(bok);
			}
			

	}

}

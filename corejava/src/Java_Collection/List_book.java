package Java_Collection;


public class List_book {	
		String title;
		String Author;
		int price;
		String publication;
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return Author;
		}
		public void setAuthor(String author) {
			Author = author;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getPublication() {
			return publication;
		}
		public void setPublication(String publication) {
			this.publication = publication;
		}
		
		public String toString() {
		        return "Book[" +
		                "title='" + title + '\'' +
		                ", author='" + Author + '\'' +
		                ", price=" + price +
		                ", publication='" + publication + '\'' +
		                ']';
		   }
}

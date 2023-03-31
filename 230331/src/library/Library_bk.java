package library;

import java.util.ArrayList;
import java.util.List;

public class Library_bk {
	//List(인터페이스)<타입> 매개변수 = new ArrayList<>()(List구현체)
	//필드
	List<Book> bookList = new ArrayList<>();
	
	//생성자
	public Library_bk() {
		
	}
	
	public Library_bk(List<Book> bookList) {
		this.bookList=bookList;
	}
	
	//책 추가 메서드
	public void addBook(String title,String author) {
		Book book = new Book(title,author);
		bookList.add(book);
	}

	@Override
	public String toString() {
		String res = "";
		for(Book book : bookList) {
			res += book.getTitle()+book.getTitle()+book.getAuthor()+"/"+book.isRent()+"\n";
		}
		return res;
	}
}

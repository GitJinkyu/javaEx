package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	//책 리스트를 생성
	//길이가 자동으로 늘어나면서 자료가 저장됨
	private List<Book> bookList = new ArrayList<>();
	
	public Library() {
		
	}
	public Library(List<Book> bookList) {
		//초기화
		this.bookList=bookList;
	}
	//책 추가 메서드
	public boolean addBook(String title, String author) {
		Book book =  new Book(title, author);
		//맨 마지막에 인덱스를 추가하고 객체를 저장
		//.add()의 반환값이 boolean이기때문에 
		//return 값으로 지정하면 정상적으로 책이 추가되었는지 true false로 확인가능
		return bookList.add(book);
	}
	//책 삭제 메서드
	public void removeBook(int index) {
		Book book = bookList.remove(index);
		System.out.println("삭제되었습니다."+book.toString());
		
	}
	//책 수정 메서드
	public void updateBook(int index) {
		/**
		 * 1.인덱스에 들어있는 책을 꺼내오기 get
		 * 
		 * 2.렌트 여부 수정
		 * 
		 * 3.책 저장
		 */
		Book book = bookList.get(index);
		book.setRent(true);
		bookList.set(index, book);
		System.out.println("대여가 완료되었습니다.");
		
	}
	
	@Override
	public String toString() {
		//책의 목록을 출력
		int i = 0;
		for(Book book: bookList) {
			System.out.println(i+":"+book.toString());
			i++;
		}
		return super.toString();
	}
}

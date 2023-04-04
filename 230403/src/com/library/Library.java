package com.library;

import java.util.ArrayList;
import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DatebaseDao;
import com.library.dao.FileDao;
import com.library.vo.Book;



public class Library {
	// List - 메모리(프로그램 종료시 사라짐)
	private List<Book> bookList = new ArrayList<>();
	
	//데이터의 입출력
	private Dao dao = null;
	
	/**
	 * 생성자
	 * 
	 */
	public Library(String confDao) {
		if("db".equals(confDao)) {
			this.dao = new DatebaseDao();
		}else {
			this.dao =  new FileDao();
		}
		//책의 리스트를 조회 (파일 또는 DB를 이애용해서 조회)
		//책을 생성해서 리스트에 담기
		bookList = dao.getBookList();
		System.out.println("라이브러리 생성자");
		System.out.println("도서 목록");
		Info();
		
		//TODO : 일련번호가 겹치지않았으면 좋겠다
		//데이터베이스를 이용할 경우 번호를 기본키로 사용시 
		//중복된 번호는 입력이 안되므로 오류 발생
//		bookList.add(new Book(1,"책1","작가1",false));
//		bookList.add(new Book(2,"책2","작가2",false));
//		bookList.add(new Book(3,"책3","작가3",false));
//		bookList.add(new Book(4,"책4","작가4",false));
	}
	
	/**
	 * 신규 도서 추가
	 * @param no
	 * @param title
	 * @param author
	 * @param isRent
	 * @return
	 */
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		Book book = new Book(no,title,author,isRent);
		
		bookList.add(book);
		dao.insertBook(bookList);
		return true;
	}
	
	//삭제하기
	//인덱스번호가없는 경우 메세지 처리후 false 반환
	public boolean deleteBook(int index) {
		for(Book book : bookList) {
			// 사용자가 입력한 index(일려번호)가 존재하는 경우
			if(book.getNo() ==  index) {
				dao.deleteBook(bookList);
				System.out.println("삭제가 완료되었습니다.");
				return bookList.remove(book);
			}
		
		}
		return false;
	}
	
	//책반납하기
	public boolean returnBook(int index) {
		for(Book book : bookList) {
			// 사용자가 입력한 index(일려번호)가 존재하는 경우
			if(book.getNo() ==  index) {
				
				//isRent()=true 상태일 경우,대여중인 경우
				if(book.isRent()) {
					System.out.println("반납이 완료되었습니다.");
					book.setRent(false);
					return false;
				}else if(!book.isRent()) {
					System.out.println("일련번호에 해당하는 도서는 반납된 상태입니다.");
				}
				
			}else {
				System.out.println("입력하신 일련번호의 도서가 존재하지 않습니다.");
				break;
			}
			
			
		}
		
			
		
		return true;
		
	}
	
	
	/**
	 * 책 대여
	 * 책의 일련번호를 매개변수로 받아서 isRent값을 수정
	 * @param index
	 * @return
	 */
	public boolean rentBook(int index) {
		for(Book book : bookList) {
			// 사용자가 입력한 index(일려번호)가 존재하는 경우
			if(book.getNo() ==  index) {
				//이미 대여중인 경우
				//isRent()=true 상태일 경우
				if(book.isRent()) {
					System.out.println("이미 대여중인 도서입니다.");
					return false;
				}
				//책 대여여부 값을 true로 변경
				book.setRent(true);

				return true;
			}
			
		}
		System.out.println("일련번호에 해당하는 도서를 찾지 못했습니다.");
		return false;
	}
	
	
	/**
	 * 리스트 정보를 출력합니다.
	 */
	public void Info() {
		System.out.println("==========도서 목록==========");
		for(Book book : bookList) {
			book.info();
		}
		System.out.println("==========================");
	}
	
	
	
//	public static void main(String[] args) {
//		Library lib = new Library("db");
//		
//		//도서 리스트 출력
//		lib.Info();
//		
//		//신규 도서 등록
//		lib.insertBook(5, "책5", "작가5", false);
//		lib.Info();
//		System.out.println("도서 삭제 실행 5");
//		lib.deleteBook(5);
//		
//		System.out.println("도서 대여 실행 5");
//		//도서 대여후 출력 
//		lib.rentBook(5);
//		lib.Info();
//		
//		System.out.println("도서 반납 실행 5");
//		//도서 반납후 출력
//		lib.returnBook(5);
//		lib.Info();
//		
//	}
}

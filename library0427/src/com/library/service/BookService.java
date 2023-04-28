package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.dao.RentDao;
import com.library.vo.Book;

public class BookService {
	BookDao dao = new BookDao();
	
	/**
	 * 책 리스트를 조회 합니다.
	 * @return
	 */
	public List<Book> getList(){
		List<Book> list = dao.getList();
		for(Book book :list) {
			System.out.println(book);
		}
		return list;
		
	}
	
	public int insertBook(String title,String author) {
		int res = dao.insertBook(title,author);
		if(res>0) {
			System.out.println("신규 도서가 입력되었습니다.👏");
			getList(); //책 리스트 출력
		}else {
			System.out.println("입력중 오류가 발생했습니다.");
		}
		
		return 0;
	}
	
	public int deleteBook(int no) {
		int res = dao.deleteBook(no);
		if(res>0) {
			System.out.println("도서가 "+res+"건 삭제 되었습니다.👏");
			getList();
		}else {
			System.out.println("입력중 오류가 발생했습니다.");
		}
		
		return 0;
	}
	
	
//		Book 테이블 RentYN 사용
	public void rentBook(int no) {
		//대여 가능한 도서인지 확인
		String rentYN =dao.getRentYN(no);
		if("Y".equals(rentYN)) {
			System.out.println("이미 대여중인 도서입니다.");
			return;
		}else if("".equals(rentYN)) {
			System.out.println("없는 도서 번호입니다.");
			return;
		}
		//대여처리
		int res=dao.updateBook(no, "Y");
		
		if (res>0){
			System.out.println(res+"건 대여 되었습니다.");
		}else {
			System.out.println("대여중 오류가 발생하였습니다.");
		}
	
	}
	
	public void returnBook(int no) {
		//반납 가능한 도서인지 확인
		String rentYN =dao.getRentYN(no);
		if("N".equals(rentYN)) {
			System.out.println("대여중인 도서가 아닙니다.");
			return;
		}else if("".equals(rentYN)) {
			System.out.println("없는 도서 번호입니다.");
			return;
		}
		
		//대여처리
		int res=dao.updateBook(no, "N");
		
		if (res>0){
			System.out.println(res+"건 반납 되었습니다.");
		}else {
			System.out.println("반납중 오류가 발생하였습니다.");
		}
	}
	
}

package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.BookVo;

/**
 *비즈니스로직
 *사용자요청검증
 *DB CRUD
 *사용자 요구에 맞게 반환
 * @author user
 *
 */
public class BookService {
	
	BookDao bookdao = new BookDao();
	public void getList() {
		List<BookVo> list = bookdao.getList();
		
		for(BookVo book :list) {
			System.out.println(book.toString());
		}
		
	}
	public int InsertBook(BookVo bookVo) {
		int res = BookDao.insertBook(bookVo);
		if(res>0) {
			System.out.println("입력되었습니다.");
			getList(); //책 리스트 출력
		}else {
			System.out.println("입력중 오류가 발생했습니다.");
		}
		
		return 0;
	}
	public int deleteBook(int bookNo) {
		int res = BookDao.deleteBook(bookNo);
		if(res>0) {
			System.out.println(res+"건 삭제되었습니다.");
			getList(); //책 리스트 출력
		}else {
			System.out.println("입력중 오류가 발생했습니다.");
		}
		
		return 0;
	}
	
	/**
	 * 1.책이 대여 가능한 상태인지 확인한다.
	 * 2.가능한 상태면 대여 처리.
	 * 3.아니면 메세지 처리.
	 * @param bookNo
	 */
	public void rentBook(int bookNo) {
		boolean flg = selStatus(bookNo,"N");
		if(flg) {
			int res = bookdao.updateBook(bookNo,"Y");
			if(res>0) {
				System.out.println("대여 되었습니다.");
				getList(); //책 리스트 출력
			}else {
				System.out.println("대여중 문제가 발생하였습니다.");
			}
		}else {
			System.out.println("대여가 불가능한 상태입니다.");
		}
	}
	
	/**
	 * 대여,반납 상태 조회.
	 * @param bookNo
	 * @param rentYN
	 * @return
	 */
	public boolean selStatus(int bookNo,String rentYN) {
		boolean res = BookDao.selStatus(bookNo,rentYN);
		return res;
	}
	public void returnBook(int bookNo) {
		boolean flg = selStatus(bookNo,"Y");
		if(flg) {
			int res = bookdao.updateBook(bookNo,"N");
			if(res>0) {
				System.out.println("반납 되었습니다.");
				getList(); //책 리스트 출력
			}else {
				System.out.println("반납중 문제가 발생하였습니다.");
			}
		}else {
			System.out.println("이미 반납된 상태입니다.");
		}
		
	}

}

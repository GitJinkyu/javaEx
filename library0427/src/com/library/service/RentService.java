package com.library.service;

import java.util.List;

import com.library.dao.RentDao;
import com.library.vo.Book;

public class RentService {
	RentDao dao = new RentDao();
	
	
	
	public List<Book> getList(){
		List<Book> list = dao.getList();
		System.out.println("==============도서 목록==============");
		for(Book book :list) {
			
			System.out.println(book);
		}
		System.out.println("==================================");
		
		return list;
		
	}
	
	/**
	 * 대여 기록을 추가한다
	 * @param id
	 * @param no
	 */
	public void rentBook(String id, int no) {
//		대여 가능한 도서인지 확인
		String rentYN =dao.getRentYN(no);
		if("Y".equals(rentYN)) {
			System.out.println("이미 대여중인 도서입니다.");
			return;
		}else if("N".equals(rentYN)) {
			
		}
		else {
			System.out.println("존재하지않는 도서입니다.");
			return;
		}
		//대여처리
		int res=dao.insertRent(id, no);
		
		if (res>0){
			System.out.println(res+"건 대여 되었습니다.");
		}else {
			System.out.println("대여중 오류가 발생하였습니다.");
		}
		
	}
	
	/**
	 * 도서 반납
	 * 반납일과 대여여부 값을 업데이트 한다.
	 * @param no
	 */
	public void returnBook(int no) {
//		//반납 가능한 도서인지 확인
		String rentYN =dao.getRentYN(no);
		if("N".equals(rentYN)) {
			System.out.println("대여중인 도서가 아닙니다.");
			return;
		}else if("Y".equals(rentYN)) {
			
		}
		else {
			System.out.println("존재하지않는 도서입니다.");
			return;
		}
		
		//대여처리
		int res=dao.updateRent(no);
		
		if (res>0){
			System.out.println(res+"건 반납 되었습니다.");
		}else {
			System.out.println("반납중 오류가 발생하였습니다.");
		}
	}


	
		
		
		
		

}

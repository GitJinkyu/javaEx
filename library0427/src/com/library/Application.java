package com.library;

import java.util.List;

import com.library.dao.BookDao;
import com.library.dao.MemberDao;
import com.library.service.MemberService;
import com.library.vo.Book;
import com.library.vo.Member;

public class Application {
	
	public static void main(String[] args) {
//		Book book =  new Book("나루토", "나루토작가");
		BookDao dao = new BookDao();
		MemberDao mdao = new  MemberDao();
		MemberService ms = new MemberService();
		
		Member member = new Member("guest7", "1234", "사용자");	
		
//		ms.login("admin", "1234");
		
//		아이디 중복 확인
//		System.out.println(mdao.idCheck("guest3"));
		ms.insertMember(member);
//		로그인 테스트
//		System.out.println(mdao.login("admin", "1234"));
		
//		멤버추가 테스트
//		int res = mdao.insertMember(member);
//		if(res>0) {
//			System.out.println(res+"건 입력되었습니다.");
//		
//		}else {
//			System.out.println("입력중 오류가 발생했습니다.");
//		}
//		계정 딜리트 테스트
//		System.out.println("딜리트 시작");
//		mdao.deleteMember("guest2");
//		System.out.println("딜리트 끝");
		
//		insert 테스트
//		int res = dao.insertBook(book);
//		if(res>0) {
//			System.out.println(res+"건 입력되었습니다.");
//			dao.getList(); //책 리스트 출력
//		}else {
//			System.out.println("입력중 오류가 발생했습니다.");
//		}
		
//		딜리트 테스트
//		System.out.println("딜리트 시작");
//		dao.deleteBook(1);
//		System.out.println("딜리트 끝");
		
		
//		업데이트 테스트
//		System.out.println("업데이트 시작");
//		dao.updateBook(1, "Y");
//		
//		System.out.println("업데이트 끝");
	}
	
}

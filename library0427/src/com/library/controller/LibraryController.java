package com.library.controller;

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.service.RentService;
import com.library.vo.Book;
import com.library.vo.Member;

/**
 * 도서대여 시스템
 * ▶ 사용자로부터 입력을 받아서
 * 		사용자 요청에 알맞는 서비스 로직을 호출.
 * ▶ 로그인
 * 	- 관리자
 * 		메뉴:도서 등록, 도서 삭제, 사용자 등록, 사용자 삭제
 * 	- 사용자
 * 		메뉴:도서 대여, 도서 반납, 도서대여 현황
 * 	
 * @author user
 *
 */
public class LibraryController {
	Scanner scan = new Scanner(System.in);
	MemberService ms= new MemberService();
	BookService bs= new BookService();
	RentService rs= new RentService();
	
	/**
	 * 도서관리 시스템 
	 * 프로그램 시작
	 */
	public void library() {
		System.out.println("===================");
		System.out.println("📖도서 관리 시스템 v1.0");
		System.out.println("===================");
		while(true) {
			Member member = login();
			
			if(member.getAdminyn().equalsIgnoreCase("Y")) {
				//관리자 메뉴 실행
				adminMenu();
			}else {
				//사용자 메뉴 실행
				userMenu(member.getId());
			}
		}
		
		
	}
	
	
	/**
	 * 관리자메뉴
	 */
	private void adminMenu() {
		while(true) {
			System.out.println("========================관리자 메뉴========================");
			System.out.println("1.도서등록  2.도서삭제  3.사용자등록  4.사용자삭제  0.로그아웃  Q.종료");
			System.out.println("메뉴를 선택해주세요");	
			int menu= getInt();
			switch (menu) {
			case 1:
				System.out.println("도서등록 메뉴입니다.");
				rs.getList();
				System.out.println("제목을 입력해주세요");
				String title = getString();
				System.out.println("작가를 입력해주세요");
				String author = getString();
				bs.insertBook(title,author);
				
				break;
			case 2:
				System.out.println("도서삭제 메뉴입니다.");
				rs.getList();
				System.out.println("삭제할 도서의 일련번호를 입력해주세요");
				int no = getInt();
				bs.deleteBook(no);
				
				break;
			case 3:
				System.out.println("사용자 신규등록 메뉴입니다.");
				String id = "";
				boolean idcheck = false;
				while(!idcheck) {
				    System.out.println("ID를 입력해주세요");
				    id = getString();
				    idcheck = ms.idCheck(id);
				    
				}
				System.out.println("비밀번호를 입력해주세요.");
				String pw= getString();
				System.out.println("이름을 입력해주세요.");
				String name= getString();
				System.out.println("관리자 계정이면 Y를 입력해주세요.");
				String str=getString();
				String adminYN=str.equalsIgnoreCase("Y") ? "Y" : "N";
				ms.insertMember(id, pw, name,adminYN);
				
				break;
			case 4:
				System.out.println("사용자 삭제 메뉴입니다.");
				System.out.println("삭제할 사용자의 ID를 입력해주세요");
				 id = getString();
				System.out.println("삭제할 사용자의 PW를 입력해주세요");
				 pw = getString();
				ms.deleteMember(id, pw);
				break;
			case 0:
				System.out.println("로그아웃되었습니다.");
				System.out.println("로그인 화면으로 돌아갑니다.");
				return;
				
			default:
				System.out.println("메뉴를 잘못선택하셨습니다. 다시 입력해주세요");
				break;
			}
			
		}
	}
	
	
	
	/**
	 * 사용자메뉴
	 * <도서 대여시 ID를 받아 기록하기 위해 매개변수로 ID를 받아야한다
	 */
	private void userMenu(String id) {
		while(true) {
			System.out.println("========================사용자 메뉴========================");
			System.out.println("1.도서대여  2.도서반납  0.로그아웃  Q.종료");
			System.out.println("메뉴를 선택해주세요");	
			int menu= getInt();
			int no = 0;
			switch (menu) {
			case 1:
				System.out.println("도서대여 메뉴입니다.");
				rs.getList();
				System.out.println("대여할 도서 번호를 입력해주세요.");
				no = getInt();
				rs.rentBook(id,no);
				break;
			case 2:
				System.out.println("도서반납 메뉴입니다.");
				rs.getList();
				System.out.println("반납할 도서 번호를 입력해주세요.");
				no = getInt();
				rs.returnBook(no);
				break;
			case 0:
				System.out.println("로그아웃되었습니다.");
				System.out.println("로그인 화면으로 돌아갑니다.");
				return;

			default:
				System.out.println("메뉴를 잘못선택하셨습니다. 다시 입력해주세요");
				break;
			}
		}
	}


	public Member login() {
		//로그인
			while(true) {
				System.out.println("    <<로그인>>");
				System.out.println("아이디를 입력해주세요");
				String id = getString();
				System.out.println("비밀번호를 입력해주세요");
				String pw = getString();
				
				Member login = ms.login(id, pw);

				//로그인 성공 member객체를 반환(login의 타입= memeber)
				if(login != null) {
					return login;
				}
				
			}
		
	}
	
	
	/**
	 * 사용자의 입력을 받아 문자열을 반환
	 * 문자가 입력될때까지
	 * q,Q 입력시 종료
	 * @return
	 */
	private String getString(){
		String str="";
		
		str= scan.nextLine();
		if(str.equalsIgnoreCase("q")) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
		
		return str;
	}
	
	
	/**
	 * 사용자의 입력을 받아 숫자로 반환
	 * 숫자가 입력될때까지
	 * q,Q 입력시 종료
	 * @return
	 */
	private int getInt() {
		int i=0;
		while(true) {
			try {
				String str="";
				str= scan.nextLine();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				return i;
				
			} catch (Exception e) {
				System.err.println(e.getMessage());
				System.err.println("입력중 오류가 발생했습니다. 숫자를 입력해주세요.");
			}
		}
		
	}
}

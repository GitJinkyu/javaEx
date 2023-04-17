package com.library.controller;

import java.util.Scanner;

import com.library.dao.BookDao;
import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.vo.BookVo;

public class LibraryController {
	BookService bookService=new BookService();
	MemberService memberService=new MemberService();
	BookDao bd = new BookDao();
	
	public void start() {
		System.out.println("=============================");
		System.out.println("    도서관에 오신걸 환영 합니다");
		System.out.println("=============================");
		while(true) {
			//로그인 요청
			MemberVo memberVo = login();
			
			//도서 목록 출력
			bookService.getList();
			
			if("Y".equalsIgnoreCase(memberVo.getAdminYN())){
				//관리자계정
				adminMenu();
			}else {
				//사용자 계정
				userMenu();
			}
		}
	}
	
	public void adminMenu() {
		int bookNo = 0;
		String id= "";
		while(true) {
			System.out.println("============================관리자 메뉴============================");
			System.out.println("1.도서 등록  2.도서 삭제  3.사용자 등록  4.사용자 삭제  0.이전 메뉴  Q.종료");
			System.out.println("메뉴를 입력해주세요");
			int menu = getInt();
			
			switch (menu) {
			case 1:
				// 도서 등록 기능 코드 작성
//				System.out.println("도서 일련번호를 입력해주세요");
//				bookNo = bd.Seqbookno();
				System.out.println("도서명을 입력해주세요");
				String title =getString();
				System.out.println("작가를 입력해주세요");
				String author =getString();
				
				bookService.InsertBook(new BookVo(0,title,author,"N"));
				
				break;
			case 2:
				// 도서 삭제 기능 코드 작성
				System.out.println("삭제할 도서의 일련번호를 입력해주세요.");
				bookNo = getInt();
				bookService.deleteBook(bookNo);
				
				break;
			case 3:
				// 사용자 등록 기능 코드 작성
				System.out.println("ID를 입력해주세요");
				id = getString();
				System.out.println("비밀번호를 입력해주세요");
				String pw =getString();
				System.out.println("이름을 입력해주세요");
				String name =getString();
				System.out.println("관리자 계정은 Y를 입력해주세요");
				String adminYNstr =getString();
				String adminYN = adminYNstr.equalsIgnoreCase("Y")?"Y":"N";
				
				memberService.InsertMember(new MemberVo(id, pw, name, adminYN));
				
				break;
			case 4:
				// 사용자 삭제 기능 코드 작성
				System.out.println("삭제할 사용자의 ID를 입력해주세요.");
				id = getString();
				memberService.deleteMember(id);
			
				break;
			case 0:
				// 이전 메뉴로 돌아가는 코드 작성
				return;
			default:
				System.out.println("잘못된 메뉴 입력입니다.");
			}
			
		}
			
		
	}
	public void userMenu() {
		while(true) {
			System.out.println("================사용자 메뉴================");
			System.out.println("1.도서 대여  2.도서 반납  0.이전 메뉴  Q.종료");
			System.out.println("메뉴를 입력해주세요");
			int menu = getInt();
			int bookNo= 0;
			switch (menu) {
			case 1:
				//도서 대여
				System.out.println("대여할 도서의 일련번호를 입력해주세요");
				bookNo=getInt();
				bookService.rentBook(bookNo);
				break;
			case 2:
				//도서 반납
				System.out.println("반납할 도서의 일련번호를 입력해주세요");
				bookNo=getInt();
				bookService.returnBook(bookNo);
				break;
			case 0:
				//이전 메뉴
				
				return;
				
			default:
				System.out.println("잘못된 메뉴 입력입니다.");
				break;
			}
			
		}
	}
	
	
	/**
	 * 로그인
	 * ID/PW를 입력 받아서 사용자 정보를 조회해옴
	 * 로그인 성공할때까지 반복
	 * @return
	 */
	public MemberVo login() {
		while(true) {
			System.out.println("아이디를 입력해주세요");
			String id =getString();
			System.out.println("비밀번호를 입력해주세요");
			String pw =getString();
			memberService.login(id, pw);
			
			MemberVo memberVo = memberService.login(id, pw);
			if(memberVo != null) {
				//로그인성공
				return memberVo;
			}
		}
	}
	
	static Scanner scan = new Scanner(System.in);
	
	public static String getString() {
		String str="";
		str = scan.next();
		if(str.equalsIgnoreCase("q")){
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
		return str;
	}
	
	public static int getInt() {
		int i = 0;
		while(true) {
			try {
				String str = scan.next();
				if(str.equalsIgnoreCase("q")){
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				return i;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("입력중 오류가 발생했습니다. 숫자를 입력해주세요.");
			}
			
		}
	}
}

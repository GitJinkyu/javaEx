package com.library;

import java.util.Scanner;

public class Application {
	
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Application app = new Application();
		Library lib= new Library("file");
		
		//도서관 생성
//		Library lib= new Library("file");
		
		logout: while(true) {
			//로그아웃처리시 다시 실행
			
			//로그인 
			System.out.println("아이디를 입력해주세요.");
			String id = app.getString();
			
			//관리자
			if("admin".equalsIgnoreCase(id)){
				System.out.println("관리자 계정으로 로그인합니다.");
				app.adminMenu(lib);
//				//메뉴별로 작업 수행
//				while(true) {
//					//도서목록 출력
//					lib.Info();
//					
//					//메뉴확인
//					System.out.println("1.도서추가  2.도서삭제  0.로그아웃  q.프로그램 종료 ");
//					System.out.println("메뉴를 입력해주세요");
//					int menu = app.getInt();
//					int no=0;
//					switch (menu) {
//					case 1://도서 추가
//						System.out.println("추가하실 도서의 정보를 입력해주세요");
//						System.out.println("도서 일련번호");
//						no = app.getInt();
//						System.out.println("도서 제목");
//						String title = app.getString();
//						System.out.println("도서 작가");
//						String author = app.getString();
//						lib.insertBook(no, title, author, false);
//						break;
//						
//					case 2://도서 삭제
//						System.out.println("삭제하실 도서의 일련번호를 입력해주세요");
//						no = app.getInt();
//						lib.deleteBook(no);
//						break;
//						
//					case 0://로그 아웃
//						System.out.println("로그아웃 하였습니다.");
//						continue logout;
//						
//
//					default://잘못 입력
//						System.out.println("메뉴를 확인후 다시 입력해주세요.");
//						break;
//					}
//				}
					
//					if(menu==0) {
//						System.out.println("로그아웃 하였습니다.");
//						continue logout;
//					}
//					
//					if(menu == 1) {
//						System.out.println("추가하실 도서의 정보를 입력해주세요");
//						System.out.println("도서 일련번호");
//						int no = app.getInt();
//						System.out.println("도서 제목");
//						String title = app.getString();
//						System.out.println("도서 작가");
//						String author = app.getString();
//						lib.insertBook(no, title, author, false);
//					}else if(menu == 2) {
//						System.out.println("삭제하실 도서의 일련번호를 입력해주세요");
//						int no = app.getInt();
//						lib.deleteBook(no);
//					}else {
//						System.err.println("메뉴를 확인 해주세요");
//					}
//				}
//				
			}else {
				//사용자
				System.out.println("사용자 계정으로 로그인합니다.");
				app.memberMenu(lib);
//				//메뉴별로 작업 수행
//				while(true) {
//					//도서목록 출력
//					lib.Info();
//					
//					//메뉴확인
//					System.out.println("1.도서대여  2.도서반납  0.로그아웃  q.프로그램 종료 ");
//					System.out.println("메뉴를 입력해주세요");
//					int menu = app.getInt();
//					
//					if(menu == 1) {
//						System.out.println("대여하실 도서의 일련번호를 입력해주세요");
//						int index = app.getInt();
//						lib.rentBook(index);
//					}else if(menu == 2) {
//						System.out.println("반납하실 도서의 일련번호를 입력해주세요");
//						int index = app.getInt();
//						lib.returnBook(index);
//					}else if(menu == 0) {
//						System.out.println("로그아웃 하였습니다.");
//						continue logout;	
//					}else {
//						System.err.println("메뉴를 확인 해주세요");
//					}
//				}
				
			}
		}
		//로그인 처리
			
		
	}
	
	/**
	 * 사용자로부터 숫자를 입력 받습니다.
	 * @return
	 */
	public int getInt() {
		int i = 0;
		while(true) {
			try {
				String str = scan.next();
				
				if(str.equalsIgnoreCase("Q")) {
					System.out.println("시스템 종료");
					System.exit(0);
				}
					
				i = Integer.parseInt(str);
				
				break;
			} catch (Exception e) {
				System.err.println("입력중 오류 발생하였습니다.");
				System.out.println("숫자를 입력해주세요.");
			}
		}
		return i;
	}
	
	/**
	 * 사용자로부터 문자를 입력 받습니다.
	 * @return
	 */
	public String getString() {
		String res = "";
		while(true) {
			try {
				res= scan.next();
				
				//숫자인 경우 다시 받아올수 있도록 
				try {
					//숫자로 변환 합니다.
					Integer.parseInt(res);
					//숫자로 변환이 가능하게되면 메세지를 띄운후 다시 반복문 실행
					System.out.println("숫자는 입력할수 없습니다.");
					System.out.println("문자를 입력해주세요.");
					continue;
					//숫자로 변환이 불가능할 경우 catch를 통해서 다음으로 진행
				} catch (Exception e) {
					
				}
				
				if(res.equalsIgnoreCase("Q")) {
					System.out.println("시스템 종료");
					System.exit(0);
				}
			
			} catch (Exception e) {
				System.err.println("입력중 오류 발생하였습니다.");
				System.out.println("문자를 입력해주세요.");
			}
			return res;
		}
	}
	
	private void adminMenu(Library lib) {
		//메뉴별로 작업 수행
		while(true) {
			//도서목록 출력
			lib.Info();
			
			//메뉴확인
			System.out.println("1.도서추가  2.도서삭제  0.로그아웃  q.프로그램 종료 ");
			System.out.println("메뉴를 입력해주세요");
			int menu = getInt();
			int no=0;
			switch (menu) {
			case 1://도서 추가
				System.out.println("추가하실 도서의 정보를 입력해주세요");
				System.out.println("도서 일련번호");
				no = getInt();
				System.out.println("도서 제목");
				String title = getString();
				System.out.println("도서 작가");
				String author = getString();
				lib.insertBook(no, title, author, false);
				break;
				
			case 2://도서 삭제
				System.out.println("삭제하실 도서의 일련번호를 입력해주세요");
				no = getInt();
				lib.deleteBook(no);
				break;
				
			case 0://로그 아웃
				System.out.println("로그아웃 하였습니다.");
				return; //메서드 종료시켜서 나가기
				

			default://잘못 입력
				System.out.println("메뉴를 확인후 다시 입력해주세요.");
				break;
			}
		}
		
	}
	
	private void memberMenu(Library lib) {
		
		//메뉴별로 작업 수행
		while(true) {
			//도서목록 출력
			lib.Info();
			
			//메뉴확인
			System.out.println("1.도서대여  2.도서반납  0.로그아웃  q.프로그램 종료 ");
			System.out.println("메뉴를 입력해주세요");
			int menu = getInt();
		
			
			if(menu == 1) {
				System.out.println("대여하실 도서의 일련번호를 입력해주세요");
				int index = getInt();
				lib.rentBook(index);
			}else if(menu == 2) {
				System.out.println("반납하실 도서의 일련번호를 입력해주세요");
				int index = getInt();
				lib.returnBook(index);
			}else if(menu == 0) {
				System.out.println("로그아웃 하였습니다.");
				return;	 //메서드 종료시켜서 나가기
			}else {
				System.err.println("메뉴를 확인 해주세요");
			}
		}
	}

}

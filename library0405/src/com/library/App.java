package com.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.library.dao.fileDao;
import com.library.vo.Book;

public class App {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//도서관 생성
		Library lib = new Library();
		//App을 생성하지 않고 getString(),getInt() 메서드를 사용 할 수 없다.
		//main 메소드는 static메소드 정적메서드
		//정적 필드에서는 인스턴스 필드를 사용할수없다.
		//메소드를 static으로 만들어주거나 App를 생성해서 호출한다.
		
		
	logout:while(true) {
			//로그인
			//id를 입력 받아서 admin이면 관리자 아니면 사용자
			//어드민 - 책 등록, 책 삭제
			//사용자 - 책 대여, 책 반납
			//자주 사용하는 로직은 메서드로 빼서 구현해놓으면 코드가 간결해진다.
			//입력 받는 부분 메서드로 빼기
			System.out.println("ID를 입력해주세요.");
			String id = getString();
				if(id.equalsIgnoreCase("admin")) {
					System.out.println("관리자 메뉴입니다.");
				while(true) {//관리자메뉴 반복
					System.out.println("1.도서 등록  2.도서 삭제  0.로그아웃  Q.종료");
					System.out.println("메뉴를 입력해주세요.");
					int menu = getInt();
					int no = 0;
					switch (menu) {
					case 1:
						System.out.println("========책 추가=========");
						System.out.println("책의 일련번호를 입력해주세요");
						no = getInt();
						System.out.println("책의 제목을 입력해주세요");
						String title = getString();
						System.out.println("책의 작가를 입력해주세요");
						String author= getString();
						lib.insertBook(no, title, author, false);
						break;
					case 2:
						System.out.println("========책 삭제=========");
						System.out.println("삭제할 책의 일련번호를 입력해주세요.");
						no = getInt();
						boolean res = lib.deleteBook(no);
						break;
					case 0:
						System.out.println("로그아웃 되었습니다.");
						continue logout;
					default:
						System.out.println(menu+"는 없는 메뉴입니다.");
						System.out.println("다시 입력해주세요.");
						break;
					}
				}//관리자메뉴 반복끝
					
				}else {
					System.out.println(id+"님 환영합니다.");
				while(true) {//사용자 메뉴 반복
					System.out.println("1.도서 대여  2.도서 반납  0.로그아웃  Q.종료");
					System.out.println("메뉴를 입력해주세요.");
					int menu = getInt();
					int no = 0;
					switch (menu) {
					case 1:
						System.out.println("========책 대여=========");
						System.out.println("대여할 책의 일련번호를 입력해주세요.");
						no = getInt();
						boolean res = lib.rentBook(no);
						break;
					case 2:
						System.out.println("========책 반납=========");
						System.out.println("반납할 책의 일련번호를 입력해주세요.");
						no = getInt();
						res = lib.returnBook(no);
						break;
					case 0:
						System.out.println("로그아웃 되었습니다.");
						continue logout;
					default:
						System.out.println(menu+"는 없는 메뉴입니다.");
						System.out.println("다시 입력해주세요.");
						break;
					}
				}//사용자 메뉴 반복
				}
		}
	}
	
	/**
	 * 사용자로부터 입력받은 문자열을 반환합니다
	 * 숫자가 입력될 경우 다시 입력을 요청
	 * q가 입력될 경우 프로그램 종료 
	 * @return
	 */
	public static String getString() {
		String str ="";
		while(true) {
			try {
				str = scan.nextLine();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				Integer.parseInt(str);
				//정상적으로 int로 변경이된다는것은 
				//입력 받은 값이 숫자란 뜻이므로 문자를 입력해달라고 다시 요청   
				System.out.println("문자를 입력해주세요.");
			} catch (Exception e) {
				//문자가 입력된 경우 반복문 탈출하고 리턴함
				break;
			}
		}
		return str;
	}
		
		/**
		 * 사용자로부터 정수를 입력받아 반환해줌.
		 * 문자가 입력되었을 경우 다시 입력을 받는다.
		 * q가 입력되면 프로그램 종료
		 */
	public static int getInt() {
		int i=0;
		String str ="";
		while(true) {
			try {
				str = scan.nextLine();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				break;  
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
		return i;
	}
}

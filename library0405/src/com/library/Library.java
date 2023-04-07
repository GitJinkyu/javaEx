package com.library;

import java.util.Collections;
import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DatabaseDao;
import com.library.dao.fileDao;
import com.library.vo.Book;

public class Library {
	//책 목록 
	//필드로 선언시 클래스 내부에서 자유롭게 이용이 가능
	//전역변수
	List<Book>list = null;
	
	//인터페이스 타입으로 선언 ->인터페이스의 구현체를 이용해 생성
	Dao dao = new fileDao();
	
	//생성자 : 클래스명과 같은 이름, 반환타입이 없다.
	public Library() {
		//dao.getList를 호출하여 list에 담아서 초기화
		list = dao.getList();
		System.out.println(toString());
	}
	
	public Library(String daoType) {
		if(daoType.equals("DB")){
			dao = new DatabaseDao();
		}
		list = dao.getList();
		System.out.println(toString());
	}
	
	
	
	@Override
	public String toString() {
		System.out.println("========책 목록 출력 lib.toString() ========");
		String info ="";
		
		//정렬해주는 메소드 문자열이나 숫자일 경우 비교해서 정렬해줌
		Collections.sort(list);
		
		for(Book book :list) {
			info+= book.information()+"\n";
		}
		return info;
	}
	
	//1.책의 정보를 받아서 리스트에 등록
	//2.리스트를 파일로 출력 
	public boolean insertBook(int no, String title,String author,boolean isRent) {
		//0.일련번호 중복 체크 (책 생성 전에) 
		for(Book book : list) {
			if(book.getNo() == no){
				System.out.println("일련번호가 중복되었습니다 다시 입력해주세요.");
				return false;
			}
		}
		
		//1.책을 생성  insertBook 메소드 호출할때 입력하는 매개변수를 그대로 book 객체 생성 매개변수에 대입
		Book book = new Book(no, title, author, isRent);
		
		//2.리스트에 등록
		list.add(book);
		
		//3.리스트를 파일로 출력
		boolean res = dao.listToFile(list);
		
		//4.추가한 책이 파일에 정상적으로 등록이 되지않을 경우를 대비해야함
		// 리스트와 파일의 데이터를 맞추기 위해 추가하려던 책을 리스트에서 제거
		if(!res) {
			list.remove(book);
			System.out.println("책이 정상적으로 등록되지 않았습니다.\n 다시 시도해주세요.");
			return false;
		}
		System.out.println("책이 정상적으로 등록되었습니다.");
		System.out.println(toString());
		return true;
	}
	
	/**
	 * 책의 일련번호를 입력 받아서 리스트에서 삭제
	 * 리스트를 파일로 출력
	 * @param no
	 * @return
	 */
	public boolean deleteBook(int no) {
		//1. 일련번호 no를 매개변수로 입력받아 리스트에서 해당 책을 삭제
		for(Book book:list) {
			// 사용자가 입력한 index(일련번호)가 존재하는 경우
			if(book.getNo() == no) {
				//해당 일련번호의 책을 리스트에서 삭제
				list.remove(book);
				System.out.println("책이 정상적으로 삭제되었습니다.");
				System.out.println(toString());
				//2. 삭제된 리스트를 파일로 출력하여 갱신해줌
				boolean res = dao.listToFile(list);
				if(!res) {
					//파일 출력이 실패할 경우 책을 다시 리스트에 추가해줌
					list.add(book);
					System.out.println("파일 출력도중 오류가 발생하였습니다.");
					return false;
				}
			return true;
			}
		}
		dao.listToFile(list);
		System.out.println("일련번호에 해당하는 도서를 찾지 못했습니다.");
		return false;
	}

	/**
	 * 일련번호에 해당하는 책을 찾는다
	 * 책의 상태가 렌트가 가능한 상태 (isRent=false)라면 렌트(isRent= true)로 변환후
	 * 리스트를 파일로 출력
	 * @param no
	 * @return
	 */
	public boolean rentBook(int no) {
		for(Book book : list) {
			// 사용자가 입력한 index(일려번호)가 존재하는 경우
			if(book.getNo() ==  no) {
				//isRent()=false 상태일 경우(대여가능할 경우)
				if(!book.isRent()) {
					//책 대여여부 값을 true로 변경
					book.setRent(true);
					System.out.println("책이 정상적으로 대여되었습니다.");
					System.out.println(toString());
					
					//파일로 출력
					boolean res = dao.listToFile(list);
					//데이터베이스 업데이트
					int i = dao.update(no);
					if(i>0) {
						System.out.println(i+"건 처리되었습니다.");
					}else {
						System.out.println("처리도중 오류가 발생했습니다.");
						book.setRent(false);
						return false;
					}
					if(!res) {
						book.setRent(false);
						System.out.println("파일로 출력하는데 실패 했습니다.");
						return false;
					}
					return true;
				//이미 대여중인 경우
				}else{
					System.out.println("이미 대여중인 도서입니다.");
					return false;
				}
			}
		}
		System.out.println("일련번호에 해당하는 도서를 찾지 못했습니다.");
		dao.listToFile(list);
		return false;
	}

	public boolean returnBook(int no) {
		for(Book book : list) {
			// 사용자가 입력한 index(일련번호)가 존재하는 경우
			if(book.getNo() == no) {
				
				//isRent()=true 상태일 경우,대여중인 경우
				if(book.isRent()) {
					book.setRent(false);
					dao.listToFile(list);
					//DB 업데이트 로직 호출
					dao.update(no);
					System.out.println("반납이 완료되었습니다.");
					System.out.println(toString());
					return true;
				}else if(!book.isRent()) {
					System.out.println("일련번호에 해당하는 도서는 이미 반납된 상태입니다.");
					return false;
				}
			}
		}
		System.out.println("일련번호에 해당하는 도서를 찾지 못했습니다.");
		dao.listToFile(list);
		return false;
	}
	
}

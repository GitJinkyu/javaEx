package com.library;

public class Library {
	
	//책 리스트
	private Book[] bookArry = new Book[5];
	
	/**
	 * 책 리스트를 추가하는 메서드
	 */
	public void addBook() {
		bookArry[0] = new Book("자바의정석", "남궁연");
		bookArry[1] = new Book("혼자공부하는자바","신용권");
		bookArry[2] = new Book("어린왕자", "생떽쥐 베리");
		bookArry[3] = new Book("개미","베르베르");
		bookArry[4] = new Book("날개", "이상");
	}

	//메서드 오버라이딩
	@Override
	public String toString() {
		//배열의 값을 담을 String 변수 선언

		String str = "";
		
		//반복문을 통해 str에 책 정보를 저장
		for(Book b : bookArry) {
			str+= b.getTitle()+" "+b.getAuthor()+"\n";
		}
		
		return str;
	}
}

package com.library.vo;

public class Book {
	private int no;			//도서번호
	private String title;	//도서명
	private String rentyn;	//대여 여부
	private String author;	//작가
	
	//신규 도서를 추가할 경우 도서명과 작가명만 알고 있으면 생성 가능
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		//신규 도서이므로 N
		this.rentyn = "N";
	}
	
	public Book(int no, String title, String rentyn, String author) {
		this.no = no;
		this.title = title;
		this.rentyn = rentyn;
		this.author = author;
	}
	
	
	@Override
	public String toString() {
		String rentYNStr = "대여가능 🙆‍♂️";

		//도서가 rentYN=Y(대여중)인 경우 대여중으로 표시
		if("Y".equals(getRentyn())) {
			rentYNStr="대여중 🙅‍♂️";
		}
		
		return "도서번호:["+getNo()+"] "+
				" 도서명:["+getTitle()+"] "+
				" 작가:["+getAuthor()+"] "+
				" 대여여부:["+rentYNStr+"]";
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRentyn() {
		return rentyn;
	}
	public void setRentyn(String rentyn) {
		this.rentyn = rentyn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}





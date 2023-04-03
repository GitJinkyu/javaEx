package com.library.vo;

public class Book {
	//필드
	private int no; 		//책 일련 번호
	private String title; 	//책 제목
	private String author;	//책 작가
	private boolean isRent;//책 대여 여부(True:대여중 false:대여가능)
	
	//대여자
	//대여일
	
	//생성자
	public Book(int no, String title, String author, boolean isRent) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
	}
	
	//메서드
	
	//책의 정보 출력
	public void info() {
		String str = " ";
		if(isRent) {
			str = "대여중";
		}
		System.out.println("일련번호:"+getNo()+" 도서 제목:"+getTitle()+" 도서 작가:"+getAuthor()+" 대여상태:"+str);
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isRent() {
		return isRent;
	}
	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}
	
	
}

package com.library.vo;

import java.util.Collections;
import java.util.Date;

//리스트 자동정렬해주는 인터페이스 
public class Book implements Comparable<Book>{
	private int no;
	private String title;
	private String author;
	private boolean isRent;
	private Date regdate;
	private Date editdate;
	
	
	
	
	public Book(int no, String title, String author, boolean isRent) {
		super();
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
	}



	public Book(int no, String title, String author, Boolean isRent, Date regdate, Date editdate) {
		super();
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
		this.regdate = regdate;
		this.editdate = editdate;
	}



	@Override
	public String toString() { //실제 텍스트 파일에 입력될 형식, 구분자 설정대로 저장
		
		return 
				getNo()
				+" "+getTitle()
				+" "+getAuthor()
				+" "+isRent;
	}
	
	public String information() { // 콘솔 창에서 출력될 형식
		String str ="";
		if(isRent) {
			str="대여중";
		}
		
		return 
				getNo()
				+" "+getTitle()
				+" "+getAuthor()
				+" "+str;
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


	//자동 정렬해주는 인터페이스
	@Override
	public int compareTo(Book o) {
		if(this.no>o.getNo()) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
}


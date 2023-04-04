package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public class DatebaseDao implements Dao {

	@Override
	public List<Book> getBookList() {
		System.out.println("DB-책 리스트를 조회");
		return null;
	}

	@Override
	public int insertBook(List<Book> book) {
		System.out.println("DB-신규 도서 등록");
		return 0;
	}

	@Override
	public int deleteBook(List<Book> book) {
		System.out.println("DB-도서 삭제");
		return 0;
	}

	@Override
	public int updateBook(List<Book> book) {
		System.out.println("DB-도서 정보 업데이트");
		return 0;
	}

}

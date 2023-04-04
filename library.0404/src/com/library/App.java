package com.library;

import java.util.List;

import com.library.dao.FileDao;
import com.library.vo.Book;

public class App {
	public static void main(String[] args) {
		FileDao dao = new FileDao();
		
		//dao.getList 메소드를 호출해 파일을 읽어들이고
		//list에 저장
//		List<Book> list = dao.getList();
//		System.out.println("생성된 리스트를 출력합니다.");
//		for(Book bookList : list) {
//			System.out.println(bookList.toString());
//		}
		Library lib =new Library();
		lib.insert(4, "삼국지", "나관중", false);
		System.out.println(lib.toString());
		
	}
}

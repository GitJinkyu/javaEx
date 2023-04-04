package com.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class FileDao implements Dao{
	public static void main(String[] args) {
		FileDao dao = new FileDao();
//		dao.getBookList();
//		dao.insertBook(dao.getBookList());
		List<Book>bookList = new ArrayList<>();
		bookList.add(new Book(4,"자바의정석","자바신",false)); //새로운 책 추가
		dao.insertBook(bookList); //새로 추가된 책을 텍스트 파일에 입력하기
	}
	
	//파일 읽어오기
	@Override
	public List<Book> getBookList() {
		System.out.println("책 리스트를 조회");
		List<Book> bookList = new ArrayList();
		
		try(BufferedReader br = new BufferedReader(new FileReader("bookList.txt"));) {
			//파일 읽어오기
			//공백으로 자르기
			//책을 생성할 파라메터 만들어주기
			//책을 생성하기
			//리스트에 담기
			String str=" ";
			System.out.println("책 리스트 정보를 읽어옵니다.");
			while((str= br.readLine()) !=null){
				String[] strArry= str.split(" ");
				int no = Integer.parseInt(strArry[0]);
				String title = strArry[1];
				String author = strArry[2];
				boolean isRent =Boolean.parseBoolean(strArry[3]);
				bookList.add(new Book(no, title, author, isRent));
				
				}
//			for(Book book : bookList) {
//				book.info();
//			}
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
		}
		
		
		return bookList;
	}

	


	@Override
	public int insertBook(List<Book> bookList) {
		//                                  true를 넣으면 파일 안에 내용을 이어쓰기함.
		try(FileWriter fw = new FileWriter("bookList.txt",true);) {
			
			for(Book book :bookList) {
				fw.write(book.toString()+"\n"); 
			}
			
			fw.flush(); //실제 파일 생성
			
		} catch (IOException e) {
		} 
				
		return 0;
	}


	@Override
	public int deleteBook(List<Book> bookList) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int updateBook(List<Book> bookList) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}

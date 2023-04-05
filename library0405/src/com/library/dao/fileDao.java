package com.library.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.library.vo.Book;

public class fileDao implements Dao{

	@Override
	public List<Book> getList() {
		//파일로부터 데이터를 읽어서 리스트로 반환
		//리스트 선언
		List<Book> list = new ArrayList<>();
		try(BufferedReader br =new BufferedReader(new FileReader("bookList.txt"));) {
			String readLine="";
			while((readLine=br.readLine()) != null) {
				//문자열을 파싱해서 책을 생성
				Book book = makeBook(readLine);
				//생성한 책을 리스트 객체에 담아준다
				if(book !=null) {
					list.add(book);
				}
			}
			return list;
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
		}
		
		return list;
	}
	
	
	/**
	 * 파일을 읽어 구분자로 데이터를 구분하여 배열에 저장하고 책을 생성한다
	 * @param readLine
	 * @return
	 */
	private Book makeBook(String readLine) {
		Book book=null;
		String[] strArry = readLine.split(",");
		
		//강제형변환시 예외가 발생 할 수 있으므로
		//파일이 올바르지 않은 형태로 저장되어있을경우 예외 발생
		//프로그램에서 예외가 발생했을때, 프로그램이 비정상적으로 종료되는것을 막기 위해서
		//예외처리 try 사용
		try {
			//문자열을 int타입으로 변환하여 배열에 저장
			int no = Integer.parseInt(strArry[0]);
			String title = strArry[1];
			String author =strArry[2];
			//문자열을 boolean타입으로 변환하여 배열에 저장
			boolean isRent = Boolean.parseBoolean(strArry[3]);
			book = new Book(no, title, author, isRent) ;
			
		} catch (Exception e) {
			//문자열 파싱중 예외발생시 메세지 처리,return null
			System.out.println(readLine + " :파싱중 오류가 발생 하였습니다.");
			return null;
		}
		return book;
	}

	/**
	 * 리스트를 매개변수로 받아 파일로 출력한다.
	 */
	@Override
	public boolean listToFile(List<Book> list) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("bookList.txt"));) {
			
			Collections.sort(list)
			;
			for(Book book : list) {
				bw.write(book.toString());
				bw.newLine();
				
				//파일로 저장하기 필수.
				bw.flush();
			}
			return true;
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
}

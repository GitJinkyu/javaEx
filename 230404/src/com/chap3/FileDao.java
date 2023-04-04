package com.chap3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDao {
	public static void main(String[] args) {
		FileDao fdo = new FileDao();
		
		fdo.fileSave();
		fdo.fileRead();
		
		
	}
	/**
	 * 파일을 읽어서 책 리스트를 생성
	 */
	public void fileRead() {
		
		//구분자로 끊어서 배열로 반환
		//{1,드래곤볼,토리야마 아키라,false}
		
		
		
		try(BufferedReader br = new BufferedReader(new FileReader("bookList.txt"));) {
			
			String str = "";
			
			//기반스트림에서 제공하지않는 메서드
			//파일에서 한 줄을 읽어올 때 사용된다.
			List<Book> bookList= new ArrayList<>();
			System.out.println("책 리스트 정보를 읽어옵니다.");
			while((str = br.readLine()) !=null) {
				//txt파일 안에 있는 내용을 프로그램에 생성 하기 위해 필요한 값들을
				//구분자를 이용하여 배열에 저장
				//파라메터로 입력된 구분자를 이용하여 문자열을 자르고 배열로 변환
				String[] strArry=str.split(" ");
				//책 생성 매개변수에 맞춰서 형변환을 시켜줘야함 
				bookList.add(new Book(Integer.parseInt
						(strArry[0]),
						strArry[1],
						strArry[2],
						Boolean.parseBoolean(strArry[3])));
			}
			System.out.println("생성된 리스트를 출력합니다.");
			for(Book book : bookList) {
				System.out.println(book.toString());
			}
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
	
	
	/**
	 * 리스트에 담겨 있던 책의 정보 출력
	 */
	public void fileSave() {
		//데이터 생성
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book(1, "드래곤볼", "토리야마 아키라", false));
		bookList.add(new Book(2, "슬램덩크", "이노우에 다케히코", false));
		bookList.add(new Book(3, "나루토", "키시모토 마사시", false));
				
		//파일 출력
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("bookList.txt"));) {
			for(Book book : bookList) {
				bw.write(book.toString());
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
}

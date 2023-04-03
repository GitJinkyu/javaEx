package com.chap1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

public class FileByteStreamEx {
	public static void main(String[] args) {
		FileByteStreamEx ex =  new FileByteStreamEx();
		ex.fileSave();
		ex.fileRead();
		
	}
	
	public void fileRead() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a_byte.dat");
			/*
			 * 파일로부터 데이터를 읽어올 때는 read() 메소드를 사용하면 된다.
			 * 하지만 실제로 파일에는 얼마만큼의 데이터가 있는지 모른다.
			 * read()메소드는 더 이상 읽어올 데이터가 없으면 -1을 리턴한다.
			 * 따라서 반복문을 사용해서 read() 메소드에서 -1이 리턴되기전까지
			 * 데이터를 읽어오면 된다.
			 */
			int value = 0;
//			value = fis.read();
//			System.out.println(value); //데이터 하나 출력
			
			//데이터를 읽어서 value 변수에 저장
			// -1 : 문장의 끝
//			while((value = fis.read())!= -1) {
//				System.out.println((char)value); //char로 형변환 시켜서 출력
//			}
			
			while(true) {
				value = fis.read();
				if(value == -1) {
					break;
				}else {
					System.out.println((char)value);
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void fileSave() {
		FileOutputStream fos = null;
		System.out.println("파일 저장 메소드 실행");
		try {
			//경로를 따로 지정안해주면 프로젝트 파일 내부에 생성
			fos = new FileOutputStream("a_byte.dat");
			fos.write(97); // a 저장
			fos.write('b');// b 저장
			fos.write(10); // 줄바꿈
			
			byte[] byteArry = {'a','b','c','d'};
			fos.write(byteArry);
			fos.write(10); //줄바꿈
			
			//fos.write(배열변수명,시작인덱스,개수)
			fos.write(byteArry, 1, 2);
			
			//실제로 파일 저장
			fos.flush();
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		} finally{
			//사용중인 자원이 있다면 종료시켜줌
			if(fos != null) {
				try {
					//스트림을 이용했으면 닫아 주어야 한다
					fos.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
	
}

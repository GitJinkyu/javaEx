package com.chap2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {
	public static void main(String[] args) {
		FileIO io = new FileIO();
		long startTime,endTime;
		
		
		startTime = System.currentTimeMillis();
//		io.fileIOCopy();
		io.fileCopy();
		endTime = System.currentTimeMillis();
		System.out.println("소요시간: "+(endTime-startTime));
		
	}
	
	/**
	 * 파일 복사하기
	 * A_File.java 파일을 읽어서
	 * A_File_copy.java 파일을 생성
	 */
	public void fileIOCopy() {
		
		long startTime,endTime;
		
		
		File file = new File("C:\\Users\\user\\Downloads\\JAVA\\01. Java설치및 개발환경 준비.docx");
		//파일의 존재 여부를 확인후 존재하지 않으면 종료 
		if(!file.exists()) {
			System.out.print("파일이 존재하지 않습니다.");
			return;
		}
		
		try {
			FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream("A_File_copy.java");
			
			int value = 0;
			
			//1바이트찍 읽어 옴
			while((value = fis.read()) != -1){
				System.out.print((char)value);
				fos.write(value);
			}
			fos.flush();
		} catch (FileNotFoundException e) {
		} catch (IOException e1) {
		}
		
		
		
	}
	
	//파일 복사하기 혼자 짜보기
	public void fileCopy() {
		
		
		try(
				FileInputStream fis = new FileInputStream("C:\\Users\\user\\Downloads\\JAVA\\01자바시작하기_2_이클립스 설치.pptx");
				FileOutputStream fos = new FileOutputStream("sdfdsf_cop.pptx");
				
				) {
			int value = 0;
			
			//빠른 복사 방법
			int i = 0;
			byte[] byteArr = new byte[100];
			// i = 바이트 배열에 읽어온 갯수를 반환 한다.
			while((i = fis.read(byteArr)) != -1 ) {
				// 읽어온 갯수만큼 출력합니다.
				// 마지막 출력시 배열의 갯수를 다 채우지 못하면
				//이전에 읽어들인 내용이 남아서 출력됩니다.
				//ex. 안녕하세요 [5]
				//ex. 잘가  <--잘가 입력
				//ex. 잘가하세요 [5]
				fos.write(byteArr,0,i);
			}
//			while((value = fis.read()) != -1 ) {
//				fos.write(value);
//			}
			
			//파일저장
			fos.flush();
			
			
			
		} catch (FileNotFoundException e) {
		} catch (IOException e1) {
		}
		
		
			
		
		
		
	}
}

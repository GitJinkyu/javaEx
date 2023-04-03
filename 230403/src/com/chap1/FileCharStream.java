package com.chap1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharStream {

	public static void main(String[] args) {
		//메소드 호출을 위해 클래스 객체 생성
		FileCharStream fcs = new FileCharStream();
		
//		fcs.fileSave();
		fcs.fileRead();
	}
	
	public void fileRead() {
		//try()안에 생성해서 try catch문이 전부 끝나면 자동으로 close()
		try(FileReader fr = new FileReader("b_char.txt")) {
			int value = 0;
//			System.out.println((char)fr.read()); //하나씩 출력
			
			//반복문을 통해 데이터 끝까지 모두 출력
			while((value =fr.read()) != -1) {
				System.out.print((char)value);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void fileSave() {
		//리소스를 자동으로 close()
		//FileWriter를 이용해서 파일을 생성하고
		//데이터를 문자단위로 저장 한다.
		try(FileWriter fw = new FileWriter("b_char.txt")) {
			fw.write("IO 어떠신가요?\n");
			fw.write("혼자서도 잘할수 있습니다!\n");
			fw.write('A');
			fw.write(' ');
			fw.write('\n');
			fw.write(new char[]{'a','b','c','d'});
			
			fw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("fileSave()종료");
			
		}
	}

}

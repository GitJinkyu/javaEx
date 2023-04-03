package com.library;

import java.util.Scanner;

public class App {
	Scanner scan = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		App app = new App();
		System.out.println("나이를 입력해주세요");
		System.out.println("나이: "+app.getInt());
		System.out.println("이름을 입력해주세요");
		System.out.println("이름: "+app.getString());

	}
	
	
	public int getInt() {
		int i = 0;
		while(true) {
			try {
				String str = scan.next();
				
				if(str.equalsIgnoreCase("Q")) {
					System.out.println("시스템 종료");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				break;
				
			} catch (Exception e) {
				System.out.println("입력이 잘못 됐습니다. 숫자를 입력해주세요");
			}
			
		}
		return i;
	}
	
	public String getString() {
		String res="";
		while(true) {
			try {
				res = scan.next();
				if(res.equalsIgnoreCase("Q")) {
					System.out.println("시스템 종료");
					System.exit(0);
				}
				try {
					Integer.parseInt(res);
					System.out.println("잘못입력되었습니다 문자를 입력해주세요");
					continue;
				} catch (Exception e) {
					
				}
				break;
			} catch (Exception e) {
				System.err.println("입력중 오류 발생하였습니다.");
				System.out.println("문자를 입력해주세요.");
			}
			
		}
		return res;
		
	}

}

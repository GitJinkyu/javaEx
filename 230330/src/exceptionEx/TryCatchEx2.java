package exceptionEx;

import java.util.Scanner;

public class TryCatchEx2 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력받아 합을 구하는 프로그램 입니다.");
		while(true) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력하시오.");
			int first = Integer.parseInt(scan.nextLine());
			
			System.out.println("계속 입력 하시겠습니까?(y/n)");
			String message = scan.nextLine();
			
			
			
		} catch (NumberFormatException e) {
		
			System.out.println("경고 : 숫자로 입력해 주셔야 합니다.\n처음으로 되돌아갑니다.\n");
			continue;
		}
	}
	}

}

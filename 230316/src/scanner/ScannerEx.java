package scanner;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		// 변수선언: 변수타입 변수명
		// 자동 완성시 자동으로 import
		// 오류가 발생시 마우스를 올려 제시된 해결방안을 클릭하여 처리 할 수 있음

		// 스캐너 선언(스캐너를 사용할거에요)
		// Scanner scan;
		// 스캐너 초기화(스캐너를 사용하고 있어요)
		// scan = new Scanner(System.in);

		// 클래스명 변수명 = new 클래스명(System.in);
		System.out.println("입력받을 준비가 완료되었습니다.");
		Scanner scan = new Scanner(System.in);

		// 한줄을 읽어옵니다.
		String input = scan.nextLine();
		System.out.println(input);
		System.out.println(Integer.parseInt(input));
		// 공백으로 구분해서 하나씩 읽어옵니다.
		// String input = scan.next();
		// System.out.println(scan.nextInt()+1);
		// System.out.println(input);
		int i = scan.nextInt();
		System.out.println(i*i);
	}
}

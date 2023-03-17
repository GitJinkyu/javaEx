package scanner;

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		// System.in: 자바 표준 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력해주세요 : ");
		// 변수이름.
		// scan.next(): 사용자가 입력하기를 기다리고 있음
		// next(): 사용자가 입력한 문자나 문자열을 string 타입으로 반환
		String height = scan.next();
		System.out.printf("당신의 키는 %s 입니다.\n", height);
		
		// 몸무게를 입력해주세요 :
		System.out.println("몸무게를 입력해주세요");
		String weight = scan.next();
		// 몸무게를 입력받고 출력
		System.out.printf("당신의 몸무게는 %s 입니다. \n", weight);
		
		scan.close();
		int weight1 = Integer.parseInt(weight);
		double height1 = Double.parseDouble(height);
		
		double bmi = weight1 / (height1 * height1);
		
		System.out.printf("당신의 Bmi는 %.2f 입니다.", weight1 / (height1 * height1));
		//System.out.println("당신의 bmi는 " + bmi + "입니다.");
	}
}

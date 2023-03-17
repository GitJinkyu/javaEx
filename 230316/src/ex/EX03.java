package ex;

import java.util.Scanner;

public class EX03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 수: ");
		String strNum1 = scan.next();
		System.out.print("두 번째 수: ");
		String strNum2 = scan.next();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		System.out.println("덧셈결과: " +((int) num1 + num2));
	}
}

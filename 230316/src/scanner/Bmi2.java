package scanner;

import java.util.Scanner;

public class Bmi2 {
	public static void main(String[] args) {
		// 스캐너 객체를 사용하기 위해 생성합니다.
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("========BMI=========");
			System.out.println("키를 입력해주세요(m) : ");
			double height = scan.nextDouble();
			System.out.println("몸무게를 입력해주세요(kg) : ");
			double weight = scan.nextDouble();
			double bmi = weight / (height * height);
			System.out.printf("당신의 BMI는 %.2f 입니다.\n", bmi);

			if (bmi <= 18.5) {
				System.out.println("저체중");
			} else if (bmi > 18.5 && bmi <= 22.9) {
				System.out.println("정상");
			} else if (bmi > 22.9 && bmi <= 24.9) {
				System.out.println("과체중");
			} else if (bmi <= 25) {
				System.out.println("비만");
			}
			System.out.println("종료: q , 계속: 아무키나 입력해주세요");
			//스트링의 비교는 .equals()
			String str = scan.next();
			if("q".equals(scan.next(str))) {
				//반복문 탈출
				break;
			}
			System.out.println("================================");
		}
	}
}

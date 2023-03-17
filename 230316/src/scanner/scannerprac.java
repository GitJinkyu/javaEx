package scanner;

import java.io.IOException;
import java.util.Scanner;

public class scannerprac {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while (true) {
			// 키를 입력받습니다.
			System.out.println("당신의 키를 입력해주세요(단위: cm): ");
			int height = scan.nextInt();
			// double height = scan.nextDouble();
			System.out.printf("당신의 키는 %d cm입니다. \n", height);

			// 몸무게를 입력받습니다.
			System.out.println("당신의 몸무게를 입력해주세요(단위: kg): ");
			// int weight = scan.nextInt();
			int weight = scan.nextInt();
			System.out.printf("당신의 몸무게는 %d kg입니다. \n", weight);

			// 스캔을 종료합니다.
			// scan.close();

			// 타입을 변환합니다. #####parse의 용도를 확인할것.
			// double height1 = Double.parseDouble(height);

			// BMI를 계산합니다.
			// 방법1.
			double bmi = (weight / ((double) height * height) * 10000);

			// 방법2.
			// double num = (double)height / 100 ;
			// double bmi = (weight / ((double)num * num));

			// System.out.println("당신의 BMI는 " + bmi + "입니다.");
			System.out.printf("당신의 bmi는 %.2f 입니다.", bmi);

			if (bmi <= 18.5) {
				System.out.println("당신은 저체중입니다.");
			} else if (bmi > 18.5 && bmi <= 22.9) {
				System.out.println("당신은 표준체중입니다.");
			} else if (bmi > 22.9 && bmi <= 24.9) {
				System.out.println("당신은 과체중입니다.");
			} else if (bmi <= 25) {
				System.out.println("당신은 비만입니다.");
			}
		}
	}
}

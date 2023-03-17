package com.joongang;

//그냥 내가 만들어본거.
public class BMI {
	public static void main(String[] args) {
		int weight = 60;
		// 키를 미터로 받아야함
		double height = 1.7;

		double bmi = weight / (height * height);

		System.out.println("당신의 BMI는 " + bmi + "입니다.");
		if (bmi <= 18.5) {
			System.out.println("당신은 저체중입니다.");
		} else if (bmi > 18.5 && bmi <= 22.9) {
			System.out.println("당신은 표준체중입니다.");
		} else if (bmi > 22.9 && bmi <= 24.9) {
			System.out.println("당신은 과체중입니다.");
		} else if (bmi <= 25) {
			System.out.println("당신은 비만입니다.");
		}
dd
	}
}

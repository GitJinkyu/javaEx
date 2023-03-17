package com.joongang;

public class BMIEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
		// 타입 변수 이름;
		int weight = 50;
		double height = 1.6;
		double bmi;
		// 변수에 연산식의 결과를 저장 합니다.
		bmi = weight / (height * height);
		// + 연산자가 숫자끼리 나오면 연산
		// + 연산자가 문자열과 함께 나오면 연결
		System.out.println("당신의 BMI는 " + bmi + "입니다. ");
	}

}

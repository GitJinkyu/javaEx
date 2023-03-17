package com.joongang;

public class VariableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수의 선언과 초기화
		//int: 정수를 저장
		//double: 실수를 저장
		//정수형 변수 value를 선언
		int value;
		
		//코드 작성중 오류가 나면 컴파일 오류
		//변수를 선언하고 초기화 하지 않은 경우 오류 발생
		//int res = value + 10;
		
		//변수 초기화 = 메모리에 변수가 생성되었다.
		value = 10;
		int res = value + 10;
		System.out.print("결과를 출력합니다.");
		System.out.println("res의 값은" + res + "입니다");
		System.out.println("감사합니다");
	}

}

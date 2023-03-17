package com.joongang;

//주석
/*
 */
/**
 * Java Doc을 만들때 사용할 수 있다
 * @author user
 *
 */
public class java11 {
	public static void main(String[] args) {
		System.out.println("테스트");

		// int x: 정수를 저장 할 수 있는 변수를 선언
		int x;
		// 변수 x에 1을 대입
		//= 대입연산자 : 오른쪽에 있는 값을 왼쪽에 대입
		x = 1;
		//변수 선언과 동시에 값을 저장
		int y = 2;
		
		int result = x+y;
		
		//문자와 숫자의 연산 (+)
		System.out.println("결과는" + result);
	}
}


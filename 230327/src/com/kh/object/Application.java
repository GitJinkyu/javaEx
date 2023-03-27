package com.kh.object;

import com.kh.object.practice.StaticSample;

public class Application {

	public static void main(String[] args) {
		
		//StaticSample의 value 필드 값을 초기화
		//정적 멤버 접근 하는 법.
		//1.클래스명.필드명 - 
		//2.클래스명.메소드명
		StaticSample.setValue("Java");
		//필드가 private 접근제한자일 경우 직접 접근안됨. getter setter 메소드 이용
		
		System.out.println("value : "+StaticSample.getValue());
		StaticSample.toUpper();
		System.out.println("대문자로 : "+StaticSample.getValue());
		
		System.out.println("길이 : "+StaticSample.valueLength());
		
		System.out.println("PROGRAMMING 붙여서 : "+StaticSample.valueConcat("PROGRAMMING"));
	
		//0번째 인덱스의 값을 C로 변경
		StaticSample.setChar(0, 'C');
		//인덱스는 0부터 시작 되므로 0번째 값을 변경
		System.out.println("J => C : "+StaticSample.getValue());
		
	}

}

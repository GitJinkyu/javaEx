package com.joongang.common;

public class Person {
	protected String name;
	public int age;
	public double height;
	public double weight;
	
	//기본 생성자
	//접근제어자 생성자명()
	//생성자명=클래스이름과 동일하게
	public Person() {
		//다른 생성자를 호출
		//매개변수를 받는게 없다면 초기화 값을 직접 입력
		//호출하려는 생성자의 매개변수의 타입과 갯수가 일치해야지만 호출 할 수 있다
		this("정우성", 30, 170, 60);
	}
	
	
	//오버로딩
	//접근제어자 생성자명(매개변수타입 변수이름){}
	//생성자명=클래스이름과 동일하게
	public Person(String name,int age,double height,double weight) {
		//초기화
		this.name =name;
		this.age =age;
		this.height =height;
		this.weight =weight;
	}
	
	
	/**
	 * 이름과 나이를 반환
	 * @return 이름, 나이
	 */
	//메서드
	//접근제어자 반화타입 메서드명(){return}
	public String information() {
		return name +","+ age;
		
	}
	
}

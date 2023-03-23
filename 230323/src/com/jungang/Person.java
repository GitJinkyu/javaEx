package com.jungang;

public class Person {
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	//기본 생성자
	public Person() {
		
	}
	
	//매개변수 생성자
	public Person(int age,double height,double weight) {
		this.age=age;
		this.height=height;
		this.weight=height;
	}
	
	//메소드
	public String information() {
		return name +","+ age;

	}
}

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
		this.setAge(age);
		this.setHeight(height);
		this.setWeight(weight);
	}
	
	//메소드
	public String information() {
		return "이름:"+name+" 나이:"+getAge()+" 키:"+getHeight()+" 몸무게:"+getWeight();
		

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	
}

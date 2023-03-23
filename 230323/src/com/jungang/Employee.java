package com.jungang;

public class Employee extends Person{
	private int salary; //급여
	private String dept; //부서
	
	//기본 생성자
	public Employee() {
		
	}
	//매개변수 생성자
	public Employee(String name,int age,double height,double weight,int salary,String dept) {
		super(age,height,weight);
		this.salary=salary;
		this.dept=dept;
	}
	
	//메소드
	public String information() {
		return salary+dept;
	}
}

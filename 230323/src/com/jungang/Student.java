package com.jungang;

public class Student extends Person{
	private int grade; //학년
	private String major; //전공
	
	//기본 생성자
	public Student() {
		
	}
	//매개변수 생성자
	public Student(String name,int age,double height,double weight,int grade,String major) {
		super(age,height,weight);
		super.name=name;
		this.grade=grade;
		this.major=major;
	}
	
	
	//메소드
	public String information() {
		return super.information()+" 학년:"+grade+" 전공:"+major ;
	}
	
}

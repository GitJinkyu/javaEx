package com.kh.practice2.model.vo;




public class Cat extends Animal{
	//필드
	private String location;
	private String color;
	//생성자
	public Cat() {
		
	}
	
	public Cat(String name,String kinds,String location,String color) {
		super(name, kinds);
		this.location=location;
		this.color=color;
	}
	//메소드
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void speak() {
		//부모 메서드 출력하기 = super.메서드명()
		System.out.println(super.toString()+getLocation()+"에 서식하며, 색상은 "+getColor()+"입니다.");
		
		
	}
	
	
}

package com.kh.practice2.model.vo;

public abstract class Animal {
	//필드
	private String name;
	private String kinds;
	
	//생성자
	protected Animal() {
		
	}
	protected Animal(String name,String kinds) {
		this.name=name;
		this.kinds=kinds;
	}
	//메서드
	public String toString() {
		return "저의 이름은 "+name+"이고, 종류는 "+kinds+"입니다.";
	}
	//추상메서드
	public abstract void speak();

}

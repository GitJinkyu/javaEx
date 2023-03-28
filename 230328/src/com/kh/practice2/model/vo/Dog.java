package com.kh.practice2.model.vo;



public class Dog extends Animal {
	//필드
	private int weight;
	
	//생성자
	public Dog() {
		
	}
	public Dog(String name,String kinds,int weight) {
		super(name, kinds);
		this.weight=weight;
	}
	//메서드
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	@Override
	public void speak() {
		//부모 메서드 출력하기 = super.메서드명()
		System.out.println(super.toString()+" 몸무게는 "+getWeight()+"kg입니다.");
		
		
	}
	
	

}

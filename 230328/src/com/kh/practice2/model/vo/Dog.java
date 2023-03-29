package com.kh.practice2.model.vo;



public class Dog extends Animal {
	//필드
	public static final String PLACE="애견카페";
	private int weight;
	
	//생성자
	public Dog() {
		
	}
	public Dog(String name,String kinds,int weight) {
		//부모의 필드인 name,kinds를 갖다 쓰기위해
		//부모 생성자를 호출
		//super(필드,필드);
		super(name, kinds);
		setWeight(weight);
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

package com.kh.practice2;

import com.kh.practice2.model.vo.Animal;
import com.kh.practice2.model.vo.Cat;
import com.kh.practice2.model.vo.Dog;

public class Application {

	public static void main(String[] args) {
		// Animal 타입의 객체배열 크기 5로 생성
		Animal[] animalArr= new Animal[5];
		
		// 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
		// (이때, 매개변수 생성자를 이용하여 생성)
		Dog dog = new Dog("바둑이","똥개",30);
		Cat cat = new Cat("나비", "스핑크스", "서울", "갈색");
		
		for(int i = 0; i<animalArr.length; i++) {
			int dice =(int)(Math.random()*2+1);
			
			if(dice == 1) {
				animalArr[i] = dog;
			}else {
				animalArr[i] = cat;
			}
		}

		//향상된 for문으로 배열의 0번 인덱스부터 마지막 인덱스까지의
		//객체의 speak() 메소드 호출 
		for(Animal animalList : animalArr) {
			//부모객체의 메서드를 호출했을때,
			//부모객체의 메서드가 추상 메서드이고
			//자식객체에서 오버라이딩(재정의)했을때
			//자식객체의 메서드가 호출된다.
			animalList.speak();
		}
	}

}

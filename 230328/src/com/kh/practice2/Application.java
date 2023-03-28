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

		for(int i = 0; i<animalArr.length; i++) {
			int dice =(int)(Math.random()*2+1);
			
			if(dice == 1) {
				Animal d = new Dog("바둑이","포유류",30);
				animalArr[i] = d;
			}else {
				Animal c = new Cat("나비", "포유류", "서울", "갈색");
				animalArr[i] = c;
			}
		}
		for(Animal animalList : animalArr) {
			animalList.speak();
		}
	}

}

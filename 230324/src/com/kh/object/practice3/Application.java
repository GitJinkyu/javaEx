package com.kh.object.practice3;

public class Application {

	public static void main(String[] args) {
		NonStaticSample LOTTO= new NonStaticSample();
		LOTTO.printLottoNumbers();
		
		//Char 하나의 글자를 입력
		//''홑따옴표 안에 입력
		//하나의 글자를 꼭 입력
		//int,char 매개변수 입력
		LOTTO.outputChar(7, 'c');
		
		LOTTO.alphabette();
		
		//매개변수 문자열,가져오고 싶은 문자열 인덱스 시작번호,끝번호
		LOTTO.mySubstring("Apple", 2, 4);

        
	}
}

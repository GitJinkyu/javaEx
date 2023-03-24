package com.kh.object.practice3;

public class ArrEx {

	public static void main(String[] args) {
		int[] numbers = new int[6];

		
		
		//배열의 중복 제거
		int lottoNum;
		
		for(int num :numbers ) {
		//	if(num==lottoNum) {
				
			//}
		}
		
		
		
		//배열의 값을 정렬하고 싶어요
		//방을 바꾸기 위해 새로운 변수를 선언하고 값을 옮기는데에 이용한다
		//스트링의 인덱스도 0번부터 시작
		
		//문자열 끊기     012345
		String str = "안녕하세요!!";
		
		System.out.println(str.charAt(0));
		
		
		System.out.println(str.length());//문자열 길이 출력
		//시작인덱스, 끝인덱스 지정해서 끊어오기
		//시작인덱스는 포함, 끝 인덱스는 포함되지않음
		System.out.println(str.substring(0,2));
		
	}

}

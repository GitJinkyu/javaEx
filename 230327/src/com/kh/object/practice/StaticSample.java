package com.kh.object.practice;

public class StaticSample {
	//필드
	private static String value;

	//필드 value Getter
	public static String getValue() {
		
		return value;
	}
	//필드 value Setter
	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
	
	
	
	//value 필드 값을 모두 대문자로 변경 -->char 배열 으용
	public static void toUpper() {
		//모두 대문자로 변경하는 메소드
		//필드의 값을 대문자로 변경하여 그 값을 변수에 저장해줌
		value = value.toUpperCase();
		
	}
	
	//전달받은 인덱스 위치의 value 값을 전달받은 문자로 변경하는 static apthem
	public static void setChar(int index, char c) {
		//String 문자열을 char[]로 반환
		//한글자씩 배열의 방에 저장
		char[] valueArr = value.toCharArray();
		//배열이름[방번호]= 값;
		//값을 배열의 방번호에 입력 -> 덮어쓰기
		valueArr[index] = c;
		value = String.valueOf(valueArr);
		
		
	}
	
	//value 필드 값에 기록되어 있는 문자 갯수 리턴
	public static int valueLength() {
		
		return value.length();
	}
	
	//문자열 값을 전달받아 value 필드 값과 하나로 합쳐서 리턴 
	public static String valueConcat(String str) {
		//문자열을 연결하여 반환
		
		return value.concat(str);
	}
	
	
}

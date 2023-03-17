package bmiEx;

public class varEx {
//	int hi; -전역변수이면서 인스턴스 변수
//	static int hi2; - 전역변수이면서 클래스 변수

	public static void main(String[] args) {

		int value = 0;
		// == 비교 연산자
		// 변수의 사용범위 - 선언된 코드블럭을 벗어나면 사라진다
		// value값이 0 이면 코드블럭을 실행
		if (value == 0) {
			int value2 = value + 20;
		}
		int sum = value;
		// 코드 블럭내에 선언된 변수는 코드블럭을 벗어나면 더 이상 참조할 수 없음!
		//int sum2 = value2;
	}

	// 메서드 블럭내에 선언된 변수는 메서드 블럭을 벗어나면 더 이상 참조할 수 없음!
	//int sum = value;

}

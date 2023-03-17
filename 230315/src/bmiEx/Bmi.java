//패키지 선언문
package bmiEx;

//클래스 선언문
//접근제한자 class 클래스명
public class Bmi {
	// 클래스 안에 작성되는 것은 필드(속성을 정의)
	// 메인메소드 - 실행
	// 메서드의 선언문
	// 접근제한자 리턴타입 메소드명 (매개변수의 타입 변수명)
	// void: 리턴타입이 없는 경우

	// 변수의 사용범위: 시작블록{이후 선언된 변수는 종료블럭을}만나면 사라진다
	// 메서드 블럭 내부에 선언된 변수는 메서드 블럭 내에서만 사용가능한 변수
	// 다른 명령문장에서 블럭이 열리면 마찬가지로 블럭 내부에서만 사용 가능하다
	public static void main(String[] args) {

		// int 정수형
		// double 실수형
		System.out.println("당신의 Bmi는 ...");
		double bmi = 50 / (1.6 * 1.6);
		System.out.println(bmi);

		// 정수를 담을 수 있는 변수선언
		int value;
		int sum = 20;
		value = 10;
		sum = value + 10;

		// 만약 ()안의 조건이 참이라면 {}코드블럭을 실행
		// 코드를 실행할지 말지를 결정하므로 "제어문" 에 해당
		// if(조건문) {}
		// 참/거짓 true(참) , false(거짓)
		if (1 < 0) {
			System.out.println("1<0");
		}
		if (true) {
			System.out.println(true);
			System.out.println("true");
		}

		if (false) {
			System.out.println(false);
			System.out.println("false");
		}

//		if (sum == 10) {
//			System.out.println("참입니다!");
//		}else {
//			System.out.println("거짓입니다!");
//		}
// 		System.out.println(sum);
	}
}

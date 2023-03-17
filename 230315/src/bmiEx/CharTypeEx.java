package bmiEx;

public class CharTypeEx {
	public static void main(String[] args) {

		// 홑 따옴표 안에 하나의 문자를 저장
		char var1 = 'A';
		char var2 = '가';
		char var3 = 65;
		char var4 = 0x0041;

		// 큰 따옴표 안에 문자열을 저장
		String var5 = "문자열 저장";
		// 정수의 리터럴이 입력되면 int로 받아들이기 때문에 long타입의 경우 숫자뒤에 1 또는 L을 입력합니다.
		long var6 = 123456789;

		// 실수 타입
		// 실수의 리터럴이 입력되면 double형으로
		// 받아들이기 때문에 float타입의 경우 무조건 f를 붙인다.
		float var7 = 0.123456789f;
		double var8 = 0.123456789;
		float var9 = 5e3f;

		// 제어문의 결과값이 참 혹은 거짓일 때 사용됨
		// 문자열과는 다르다
		boolean var10 = true;
		boolean var11 = false;
		if (true) {
			System.out.println(true);
		}
		if (false) {
			System.out.println("true");
		} else {

			System.out.println("boolean 출력 확인");
			System.out.println(false);
		}

//		System.out.println(var10);
//		System.out.println(var11);
//		// 타입 변환: 변수 앞에 괄호 안에 타입을 넣어줍니다!()
//		// 타입을 따로 입력하면 명시적 형변환
//		System.out.println((int) var1);
//		System.out.println(var2);
//		System.out.println(var3);
//		System.out.println(var4);
//		System.out.println(var5);
//		System.out.println("var9는!!!" + var9);
//		System.err.println("\"");
//		System.out.println("나는\n오늘\n\'순대국\'이\n먹고싶다");
//		System.out.println(var7);
//		System.out.println(var8);

	}
}

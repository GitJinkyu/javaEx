package bmiEx;

public class Literal {
	public static void main(String[] args) {
		// 숫자를 입력할 때 2진수, 8진수, 16진수로 입력이 가능
		int i = 0b1011; // ob로 시작하면 2진수
		int j = 013; // 0으로 시작하면 8진수
		int k = 0xb3; // 0x로 시작하면 16진수

		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

		// byte 값의 허용범위 -128~127
		// 리터럴은 값 그 자체를 의미
		// 값이 입력되면 정수는 int, 실수는 double
		byte var1 = 127;
		byte var2 = -128;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = -30;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);

	}
}

package bmiEx;

public class Operator {

	public static void main(String[] args) {
		byte byteValue = 10;
		byte byteValue1 = 20;
		// byte, short, char타입은 연산시에 int타입으로 변환되어서 연산됩니다.
		// ==> 그 결과 int 타입이 반환됩니다.
		// byte byteValue2 = byteValue + byteValue1;
		byte byteValue2 = (byte) (byteValue + byteValue1);
		int intValue2 = byteValue + byteValue1;

		int iValue = 10;
		double dValue = 5.5;
		double result = iValue + dValue;
		System.out.println(result);
		System.out.println((double) iValue);
//		int형은 double형으로 표현하지 않음.(소수점 다 자르고 출력함)
		System.out.println("================================");
		System.out.println(5 / 2);
		System.out.println((double) 5 / 2); // 5.0/2
		System.out.println(5 / (double) 2); // 5/2.0
		// int 연산 후 double 적용. 2 -> 2.0
		System.out.println((double) (5 / 2));
		System.out.println((double) 5 / (double) 2);

		System.out.println("================================");
		// 문자열을 기본타입으로 강제 타입변환하는 방법
		String str = "200";

		// parseInt(string s): int
		// string타입의 매개변수를 넣고 실행결과 int타입을 반환받는다.
		int i = Integer.parseInt(str);
		System.out.println("i의 값은 " + i);

		// 다양한 타입변환
		String str1 = "10";
		byte value1 = Byte.parseByte(str1);
		String str2 = "200";
		short value2 = Short.parseShort(str2);
		String str3 = "30000";
		int value3 = Integer.parseInt(str3);
		String str4 = "400000";
		long value4 = Long.parseLong(str4);
		String str5 = "12.345f";
		float value5 = Float.parseFloat(str5);
		String str6 = "12.345";
		double value6 = Double.parseDouble(str6);
		String str7 = "true";
		boolean value7 = Boolean.parseBoolean(str7);

		System.out.println("====================");
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		
		String strvalue = String.valueOf(123);
		System.out.println(String.valueOf(123.11));
		String.valueOf(123.11);
		
		String.valueOf('가');
		String.valueOf(true);
		
		long varv = 2L;
		float varvv = 1.8f;
		double varvvv = 2.5;
		String varvvvv = "3.9";
		int resultt = (int)varv + (int)varvv + (int)varvvv + (int)Double.parseDouble(varvvvv);
		System.out.println(resultt);
	}

	
	
	
	
	
	
	
	
	
	
	
	
}

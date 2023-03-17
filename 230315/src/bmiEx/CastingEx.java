package bmiEx;

public class CastingEx {
	public static void main(String[] args) {
		int iValue = 12345;
		char charValue = (char) iValue;
		System.out.println(iValue);
		System.out.println(charValue);

		long lValue = 500;
		iValue = (int) lValue;
		System.out.println(lValue);

		float fValue = 3.14f;
		iValue = (int) fValue;
		System.out.println(fValue);

		// 변환하려는 타입에 들어갈 수 있는 값인지 확인해야함
		// 강제 형변환시 주의해야
		int intValue = 999;
		byte byteValue = (byte) intValue;
		System.out.println(intValue);
		System.out.println(byteValue);

	}
}

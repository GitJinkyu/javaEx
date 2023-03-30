package apiEx;
/**
 * 1. API(Application Programming Interface)
 *	 -API는 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든
 *		인터페이스를 뜻한다.
 *	 -자바에서는 프로그램 개발에 자주 사용되는 클래스및 인터페이스의 모음을 말한다.(라이브러리)
 * @author user
 *
 */
public class ObjectEx {
	public static void main(String[] args) {
		
		//기본타입 : 값 자체를 저장한다.
		//참조타입 : 주소를 저장한다.
		String str = "";
		print(str);
		System.out.println("======================");
		
		int num = 0;
		//int타입은 기본타입이므로 저 자체로는 Object 타입으로 변환 되지 못한다.
		//int타입은 객체형태로 변환해야 한다 ==> Wrapper클래스인 Integer 타입으로 자동 형변환되어서 들어감 
		print(num);
		System.out.println("======================");
		
		Integer.toString(num);
		print(new ObjectEx());
	}
	
	//참조타입의 최상위 계층 Object
	//Object 타입의 매개변수에 int,String이 들어가게되면 자동형변환된다
	//int -> Integer (자동형변환)
	//double -> Double (자동형변환)
	public static void print(Object obj) {
		//Object클래스에 toString이 정의되어 있지만
		//메서드의 오버라이딩에 의해서
		//String클래스, Integer 클래스에 정의되어 있는 메서드가 호출된다.
		System.out.println(obj.toString());
	}
	
	
}

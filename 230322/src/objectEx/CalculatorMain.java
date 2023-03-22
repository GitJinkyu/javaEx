package objectEx;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new는 객체를 생성하고 메모리에 올리고 주소값을 반환
		//생성자는 new 를 만났을때 생긴다
		//타입 변수명 = new 타입();
		//생성자는 클래스 이름과 동일하다
		//생성자는 반환 타입이 없다
		//생성자의 역할=객체 초기화
		Calculator calc = new Calculator();
		
		System.out.println(calc.name);
		calc.name = "실수계산기";
		System.out.println("calc name:"+calc.name);
		
		
		
		
		int sum= calc.add(5,3);
		System.out.println("두수의 합: "+sum);

		int subtarct= calc.subtarct(5, 3);
		System.out.println("두수의 차: "+subtarct);
		
		int multiply= calc.multiply(5, 3);
		System.out.println("두수의 곱: "+multiply);
		
		int divide= calc.divide(6, 3);
		System.out.println("두수의 나누기: "+divide);
		
		int remainder= calc.remainder(5, 3);
		System.out.println("두수의 나머지: "+remainder);
		
	}

}

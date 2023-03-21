package obejectEx;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//타입 변수명 = new 타입();
		Calculator calc = new Calculator();
		
		
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

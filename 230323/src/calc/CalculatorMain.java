package calc;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		boolean power =calc.powerOn;
		calc.powerOn();
		int result = calc.add(5,5);
		System.out.println(result);
		System.out.println(power);
		
		//배열을 생성후 메서드의 파라메터로 전달
		int[] numbers = {1,2,3,4,5}; //배열 선언
		System.out.println("calc.add(numbers): "+calc.add(numbers));
		
		//메서드를 실행할때 배열을 생성
		calc.add(new int[] {1,2,3});//배열 선언
		System.out.println("calc.add(new int[] {1,2,3}): "+calc.add(new int[] {1,2,3}));
		
		
		//배열선언 없이 ...에 바로 입력받아서 사용
		//코드짧아 좋음
		//대신 오버로딩이 안됨 메서드 이름 바꿔야함
		System.out.println("calc.addFn(1,2,3,4,5,6,7): "+calc.addFn(1,2,3,4,5,6,7));
		
		
		
		
		
		
		
		
	}

}

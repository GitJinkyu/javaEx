package getter.setter;

public class CalculatorMain {

	public static void main(String[] args) {
		
		//정적 필드, 정적 메서드는 생성 안해도
		//클래스 이름으로 접근하여 사옹 가능.
		double res =10 * 10 * Calculator.pi;
		int plus = Calculator.plus(0, 0);
		int mius = Calculator.minus(5, 2);
	}

}

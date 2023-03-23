package calc;

public class Calc {
	public static void main(String[] args) {
		
		
		System.out.println("객체생성");
		Calc calc = new Calc();
		calc.excute();
	}
	
	public void excute() {
		System.out.println("excute 함수 시작");
		double result = avg(7,10);
		System.out.println("실행결과 : "+result);
	
	}

	private double avg(int i, int j) {
		
		System.out.println("avg 함수 시작");
		int sum= plus(i,j);
		System.out.println("avg 실행");
		return sum/2;
	}

	private int plus(int i, int j) {
		System.out.println("plus 시작");
		System.out.println("plus 실행");
		return i+j;
	}
}

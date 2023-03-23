package calc;

public class CarMain {

	public static void main(String[] args) {
		 
		Car car = new Car(100);
		car.run1();//내부 메서드 호출 예제
		System.out.println("=========================");
		System.out.println("====내부 메서드 호출 예제 끝====");
		System.out.println("=========================");
		car.run();
		
		//반환타입이 boolean타입이므로 if문의 조건에 입력 가능
		if(car.isLeftGas()) {
			System.out.println("남은 기름의 양: "+car.gas);
		}else {
			System.out.println("기름을 넣어주세요");
		}
			
	}

}

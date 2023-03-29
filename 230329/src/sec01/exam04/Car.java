package sec01.exam04;

public class Car {
	//인터페이스는 객체를 생성할수없다
	//Tire tire = new Tire();<--오류
	//인터페이스의 구현체인 경우,
	//인터페이스를 참조변수의 타입으로 사용할 수 있다
	Tire tire;

	public Car(Tire tire) {
		this.tire=tire;
		
	}
	
	public void run() {
		tire.roll();
	}
	
	
}

package sec02.exam04;

public class Driver {
	public void drive(Vehicle vehicle) {
		
		//Vehicle을 상속 받아서 구현된 객체가 매개변수로 입력된 경우
		//부모타입으로 자동 형변환된 경우
		//new 연산자에 의해서 원래 생성된 타입을 확인
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			System.out.println("Bus타입으로 변환 성공");
		}
		System.out.println("Bus타입으로 변환 불가능");
		
		
		
		vehicle.run();
	}
}

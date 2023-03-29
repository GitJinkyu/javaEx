package sec01.exam05;

public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
		
		//bus만 갖고있는 chekFare메서드를 호출하기위해
		//자동 형변환된 bus의 타입을 Bus타입으로 다시 형변환후
		//bus의 chekfare 메서드를 호출한다.
		
		//강제형변환 이후 Taxi객체가 메서드를 호출할때
		//강제형변환된 Bus타입으로 인해 castinException이 발생할 소지가 있으므로
		//객체의 생성타입을 먼저 체크한다
		//객체 instanceof 타입 : 객체가 타입으로 생성되었는지를 체크
		//이렇게 하면 Bus 타입으로 생성되었던 bus객체만 반복문을 실행하고 넘어감
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}

		
	}
}

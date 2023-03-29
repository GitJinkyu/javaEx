package sec01.exam05;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver= new Driver();
		//인터페이스의 구현체를 생성하여 매개변수에 넣어준다
		Bus bus = new Bus();
		Taxi taxi= new Taxi();

		driver.drive(bus);
		driver.drive(taxi);
		
	}

}

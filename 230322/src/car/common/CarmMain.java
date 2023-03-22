package car.common;

public class CarmMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		System.out.println("car1: ==============");
		System.out.println("car1 model: "+car1.model+car1.maxSpeed);
		
		Car car2 = new Car("아반떼");
		System.out.println("car2: ==============");
		System.out.println("car2 model: "+car2.model+","+car2.maxSpeed);
		
		Car car3 = new Car("제네시스","파랑");
		System.out.println("car3: ==============");
		System.out.println("차 모델 : "+car3.model+car3.color);
		
	}

	
}

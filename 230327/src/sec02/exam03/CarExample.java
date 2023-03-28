package sec02.exam03;

public class CarExample {
	public static void main(String[] args) {
	
		Car car = new Car(
			new Tire("FR",3)
			,new Tire("FL",5)
			,new Tire("BR",1)
			,new Tire("BL",10));
	
	for(int i=0; i<10; i++) {
		int res = car.run();
		if(res >0) {
			car.changeTire(res);
		}
	}
	
	}
}

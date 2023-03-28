package abstractExam;

public class Application {

	public static void main(String[] args) {
		//추상 클래스는
		//미완성된 메서드를 포함&abstract를 선언한 클래스이므로 생성할수없다
		//Phone phone = new Phone();
		
		//추상클래스를 상속받아 추상메서드를 모두 구현하면
		//일반클래스로 생성할수있다
		SmartPhone sp= new SmartPhone("Owner");
		
		//참조형 변수의 타입으로 추상클래스를 사용이 가능
		Phone phone = new SmartPhone("캔디");
		
		sp.turnOff();
		sp.internetSerch();
		sp.turnOn();
	}

}

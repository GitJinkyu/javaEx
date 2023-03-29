package sec01.exam01;



public class Application {

	public static void main(String[] args) {
		//인터페이스는 생성할 수 없지만
		//참조변수의 타입으로 사용할 수 있다. == 인터페이스의 구현체는 인터페이스를 타입으로 가질수 있다
		
	//인터페이스(참조타입) 변수이름 = new 구현객체;
		RemoteControl   rc  = new Audio();
		rc.turnOn();
		rc.setVolume(51);
		rc.turnOff();
		
//		RemoteControl   tv  = new Television();
//		tv.turnOn();
//		tv.setVolume(4);
//		tv.turnOff();

		//상속단계에 있는 부모가 인터페이스를 구현하고 있는 경우
		//자식 클래스도 인터페이스의 타입으로 생성이 가능하다
		RemoteControl   smartTV  = new SmartTv();
		smartTV.turnOn();
		smartTV.setVolume(-1);
		smartTV.turnOff();
		
		//SmartTv는 Television을 상속받고 인터페이스Searchable의 구현체이기때문에
		//두가지 타입으로 생성이 가능하다
		Searchable serachable = new SmartTv();
		Television television = new SmartTv();
	}

}

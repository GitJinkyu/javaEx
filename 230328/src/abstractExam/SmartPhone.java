package abstractExam;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
		
	}
	
	
	//추상메서드를 마저 구현 해야지만 일반 클래스가 될수 있다
	//부모로부터 강제로 구현을 위임 받는다
	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
	
	public void internetSerch() {
		System.out.println("인터넷 서치합니다");
	}
	
}

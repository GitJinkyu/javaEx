package sec01.exam01;

public interface RemoteControl  {
	//인터페이스는
	//생성자를 가질수없음
	//인스턴스 필드도 가질수 없음
	// ->상수는 사용 가능
	//추상메서드를 가지고 있음
	
	//자동으로 static final을 붙여줌
	//상수 작성할때:대문자로 작성하고 문자가 연결될경우 언더버_ 를 이용
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	//추상 메서드
	//인터페이스에서는 abstract를 안붙여도 자동으로 붙음
	//default,static 메서드 작성 가능
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}

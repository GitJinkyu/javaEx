package sec01.exam01;

public class SmartTv extends Television implements Searchable{
	@Override
	public void turnOn() {
		System.out.println("SmartTV를 켭니다");
		super.turnOn();
	}
	@Override
	public void turnOff() {
		System.out.println("SmartTV를 끕니다");
		super.turnOff();
	}
	
	public void setVolume(int volume) {
		this.volume=volume;
		
		//인터페이스의 상수값을 이용해서 volume필드의 값을 제한
		if(volume>MAX_VOLUME) {
			this.volume=MAX_VOLUME;
		}else if(volume < MIN_VOLUME) {
			this.volume=MIN_VOLUME;
		}
		System.out.println("현재 TV 볼륨: "+this.volume);
	}

	//인터페이스 Searchable의 추상메소드를 오버라이딩함
	@Override
	public void serach(String url) {
		System.out.println(url+"을 검색합니다");
		
	}
}

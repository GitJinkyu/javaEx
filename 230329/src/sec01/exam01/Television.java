package sec01.exam01;

public abstract class Television implements RemoteControl {
	protected int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 켭니다");

	}

	@Override
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

}

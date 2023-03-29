package sec01.exam02;

import sec01.exam01.Audio;
import sec01.exam01.RemoteControl;
import sec01.exam01.SmartTv;

public class MyClass {
	//인터페이스는 생성할 수 없다.
	//인터페이스는 필드, 생성자 매개변수, 메소드의 매개변수, 메소드의 로컬 변수로 선언할 수 있다.
	//========>>다형성
	
	//인터페이스가 필드의 타입으로 선언된 경우
	//인터페이스의 구현체(smartTv())만 인터페이스를 타입으로 사용할수있다.
	RemoteControl rc = new SmartTv();
	
	//인터페이스가 생성자의 매개변수로 선언된 경우
	public MyClass() {
		
	}
	//             인터페이스타입    rc
	public MyClass(RemoteControl rc) {
		//매개변수로 받아온 rc를 필드rc에 저장
		this.rc = rc;
	}
	
	//인터페이스를 메소드의 매개변수로 사용될 경우
	public void methodA() {
		//Audio 객체를 생성하여 RemoteControl 타입으로 자동 변환
		//인터페이스의 타입으로 지역 변수 생성
		RemoteControl rc =  new Audio();
		//생성된 객체(Audio())를 rc 변수에 저장
		//rc변수에 저장된 값을 필드 rc에 대입
		this.rc=rc;
		
	}
	public void methodB(RemoteControl rc) {
		//매개변수로 받아온 rc를 필드rc에 저장
		this.rc = rc;
	}
}

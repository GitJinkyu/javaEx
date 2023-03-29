package sec01.exam02;

import sec01.exam01.Audio;

public class Application {

	public static void main(String[] args) {
		//기본 생성자를 이용하여 객체를 생성후 
		//참조타입 변수에 저장
		MyClass myclass = new MyClass();
		
		//1.인터페이스가 필드에 사용된 경우
		//1_1. MyClass의 필드에 접근하여 메서드를 호출(smartTV생성되어 있음)
		System.out.println("==========TV=============");
		myclass.rc.turnOn();
		myclass.rc.setVolume(4);
		myclass.rc.turnOff();
		System.out.println("=========================");
		
		//1_2. 필드에 새로운 객체를 생성하여 저장
		System.out.println("==========오디오============");
		myclass.rc = new Audio();
		myclass.rc.turnOn();
		myclass.rc.setVolume(4);
		myclass.rc.turnOff();
		System.out.println("=========================");
		
		//2. 인터페이스가 생성자의 매개변수로 이용된 경우
		MyClass myclass1= new MyClass(new Audio());
		System.out.println("============오디오=========");
		myclass1.rc.turnOn();
		myclass1.rc.setVolume(7);
		myclass1.rc.turnOff();
		System.out.println("=========================");
		
		//3. 인터페이스가 메서드의 매개변수로 이용된 경우
		//기본 생성자로 생성하면 rc=new SmartTV();
		//필드의 선언부에서 생성하고 있다.
		MyClass myclass2 = new MyClass();

		//인터페이스가 메서드의 매개변수 타입으로 사용될경우
		//메서드 호출시 구현 객체를 매개값으로 대입한다.
		myclass2.methodB(new Audio());
		System.out.println("===========오디오=========");
		myclass2.rc.turnOn();
		myclass2.rc.setVolume(11);
		myclass2.rc.turnOff();
		System.out.println("=========================");
		
		
		MyClass myclass3 = new MyClass();
		//메서드에 선언된 로컬 변수를 rc에 저장 
		myclass3.methodA();
		myclass3.rc.turnOn();
		myclass3.rc.setVolume(15);
		myclass3.rc.turnOff();
		
		
	}

}

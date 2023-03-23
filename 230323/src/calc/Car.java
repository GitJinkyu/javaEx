package calc;

public class Car {
	public int gas;
	
	
	
	
	// 생성자
	public Car(int gas) {
		this.gas=gas;
	}
	
	//객체 내부에서 메서드 호출
	//달립니다 출력
	public void run1() {
		System.out.println("달립니다.");
		//내부 메서드 호출
		stop();
		sound("빵빵");//매개변수 넣어주기
	}
	//stop 멈춥니다 출력
	public void stop() {
		System.out.println("멈춥니다.");
	}
	//sound 매개변수로 입력받기
	public void sound(String sound) {
		System.out.println(sound);
	}
	
	
	
	
	
	
	
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량: "+gas+")");
				System.out.println("gas잔량: "+gas);
				gas-=1;
			}else{
				System.out.println("기름이 떨어졌어요");
				System.out.println("gas잔량: "+gas);
				return; //리턴 타입이 void일 경우에도 return을 써서 반복문 종료 가능
			}
				
		}
	}
	//boolean타입이 반환인 경우 메서드의 이름에 is가 붙는 경우가 많다
	//기름이 0이면 false를 반환 
	public boolean isLeftGas() {
		if(gas==0) {
			System.out.println("가스가 없습니다");
			return false;
		}else {
			System.out.println("가스가 남았습니다");
			return true;
		}
	}
	
}

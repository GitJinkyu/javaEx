package sec01.exam04;

public class SupersonicAirplane extends Airplane{
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	public int flyMode;
	
	public SupersonicAirplane(){
		
	}
	
	public SupersonicAirplane(int SUPERSONIC){
		
	}
	
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다");
		}else {
			//fly()를 재작성했지만
			//부모가 가지고 있는 fly()메서드를 호출할 수 있다
			//spuer를 이용해서 접근
			super.fly();
		}
		
	}
	public void booster() {
		System.out.println("부스터 작동!!!!");
	}
}

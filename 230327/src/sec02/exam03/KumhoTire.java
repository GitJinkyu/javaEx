package sec02.exam03;

public class KumhoTire extends Tire{

	
	//생성자
	public KumhoTire(String location, int maxRotation) {
		//부모가 가진 생성자를 호출
		//생성자를 만들면 기본생성자가 생성되지 않는다.
		
		super(location, maxRotation+2);
		
	}
	
	
	@Override
	public boolean roll() {
		rotation++; //타이어 1회전
		System.out.println("KumhoTire "+location+"누적 회전수 : " + rotation);
		System.out.println("KumhoTire "+location+"최대 회전수 : " + maxRotation);
		if(rotation>= maxRotation) {
			//바퀴 교체해야한다고 알려줌
			System.out.println("KumhoTire "+location+"타이어 펑크!");
			return false;
		}
		System.out.println("KumhoTire "+location+" 수명: "+(maxRotation-rotation)+"회");
		return true;
	}
	

}

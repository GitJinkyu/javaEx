package sec02.exam03;

public class KumhoTire extends Tire{

	
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	
	
	@Override
	public boolean roll() {
		rotation++; //타이어 1회전
		if(rotation> maxRotation) {
			//바퀴 교체해야한다고 알려줌
			System.out.println(location+" KumhoTire 타이어 펑크!");
			return false;
		}
		System.out.println(location+" KumhoTire 수명: "+(maxRotation-rotation)+"회");
		return true;
	}
	

}

package sec01.exam04;

//final 키워드가 붙으면 : 부모클래스가 될 수 없음
//public final class Airplane {

public class Airplane {
	
	
	public void land() {
		System.out.println("착륙합니다.");
	}
	
	//메소드에도 final이 붙으면 
	//자식 클래스에서 메소드 재정의 불가능
	//public final void fly() {
	public void fly() {
		System.out.println("일반비행합니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다.");
		
	}
}

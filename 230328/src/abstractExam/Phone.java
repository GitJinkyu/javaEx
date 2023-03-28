package abstractExam;

//추상 메서드가 1개 이상 포함하고있기 때문에 이 클래스는 추상클래스가 된다
//추상 메서드가 있다해도 클래스 앞에 abstract를 정의하면 추상클래스가 된다
//하위클래스에서 참조해야하므로 private 접근제한자 사용 불가
public abstract class Phone {
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner=owner;
	}
	
	//메서드
	//코드블럭이 없음=>추상 메서드이기 때문에 메서드 명 앞에 abstract 붙이기
	public abstract void turnOn();
	
	//하위클래스에게 작성을 위임한다.
	//미완성된 메서드를 구현해야 일반 클래스로 생성할수있음
	public abstract void turnOff();
	
}

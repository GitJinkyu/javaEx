package animalExam;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	
	//추상 메서드 : 미완성 메소드(코드블럭이 없음)
	public abstract void sound();
	
	public void print(Animal animal) {
		System.out.println("======print=======");
		animal.sound();
		System.out.println(animal.kind+" ");
		System.out.println("==================");
	}
}

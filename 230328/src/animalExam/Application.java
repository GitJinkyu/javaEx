package animalExam;

public class Application {

	public static void main(String[] args) {
		Animal cat= new Cat();
		Animal dog= new Dog();
		//부모가 추상클래스여도 부모타입으로 형변환이 가능하다
		//생성은 할 수 없으나 변수의 타입으로 사용 할 수 있다
		cat.sound();
		dog.sound();
		
		//여기서 cat.은 Animal 타입의 변수이지만 
		//매개변수의 다형성에 의해 (cat)호출 가능
		cat.print(cat);
		dog.print(dog);

	}

}

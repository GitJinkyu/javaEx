package getter.setter;

public class SingletonMain {

	public static void main(String[] args) {
		SingleTonEx ex = SingleTonEx.getInstance();
		SingleTonEx ex1 = SingleTonEx.getInstance();
		SingleTonEx ex2 = SingleTonEx.getInstance();
		SingleTonEx ex3 = SingleTonEx.getInstance();
		SingleTonEx ex4 = SingleTonEx.getInstance();
		SingleTonEx ex5 = SingleTonEx.getInstance();
		
		
		//같은 객주소를 갖고 있는지 확인
		if(ex == ex1) {
			System.out.println("같은 객체입니다");
		}else {
			System.out.println("다른 객체입니다");
		}
		
		
		
		
		
		
	}

}

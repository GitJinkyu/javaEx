package arrayEx;

import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		//new 연산자로 배열을 생성하는 방법
		//총길이 10의 String 타입의 배열을 만든다
		//배열의 방길이는 변하지않는다
		String[] names = {"",""};
		int[]score;
		Scanner scan = new Scanner(System.in);
		System.out.println("몇개의 방을 만들까요");
		int index=scan.nextInt();
		score = new int[index];
		
		
		
		
		
		
		
		names[0] ="홍길동";
		names[1] ="나자바";
		
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}
		//타입[] 변수명 = new 타입[길이]; 길이 == 변수명 length
		//타입에 맞게 기본값으로 초기화되어 값이 입력된다
		//정수 0, 실수는 0.0,boolean은 false,객체는 null
		
		
	}

}

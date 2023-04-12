package javatest;

public class Ex2 {
	public static void main(String[] args) {
		//1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
		//int num = (int)(Math.random()*45+1);
				
		//6개의 임의의 수를 저장할 배열 생성
		int[]lotto = new int[6];
				
				
		for(int i = 0; i<lotto.length; i++) {
			//임의의 수를 생성하여 배열에 저장
			lotto[i]=(int)(Math.random()*45+1);
			
			//중복 체크 
			//기존에 동일한 숫자가 입력되었는지 체크
			for(int j = 0; j<i; j++) {
				if(lotto[i]==lotto [j]) {
					i--;						
				}
			}
		}
		//반복문을 활용하여 배열 출력
		System.out.println("lotto Number");
		System.out.print("로또 번호: ");
		for (int num:lotto) {
			System.out.print(+num+" ");
		}
		System.out.println();
			
	}
}

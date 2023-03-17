package loofing;

public class LoofFor {

	public static void main(String[] args) {
		//반복문 - for 문
		//for (초기식 ; 조건식 ; 증감식{코드블록}
		//초기식 -> 조건식 -> 증감식 -> 조건식
		//1~100 까지의 합을 구해보자

		
		int sum=0;
		for(int i = 1; i<=100; i++) {
		
			sum = sum + i;	
			sum += i;
		}
		System.out.println("1부터 100까지의 합 : " + sum);
		
		
		
	}

}

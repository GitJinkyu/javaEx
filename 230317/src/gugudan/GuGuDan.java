package gugudan;

public class GuGuDan {

	public static void main(String[] args) {
	
		int count; //구구단 단 수
		int sum; //곱셈 계산
		
		//label
		
			
		Outter :for(count=2; count<=9; count++ ) {
			System.out.println(count+"단");
			
			for(int i=1; i<=9; i++) {
				
				//6단을 출력한 후 반복문을 탈출
				if(count==10) {
					
					//label이 달린 반복문을 탈출한다
					break Outter;
				}
				sum=count*i;
				System.out.printf("구구단 %dx%d = %d\n",count,i,sum);
				System.out.println();
				
			}
			
			
		}
		
		//1~10까지의 정수에서 짝수에 합
		System.out.println("1~10 짝수의 합 구하기");
		int ssum=0;
		for(int i=1; i<11; i++) {
			//홀수이면 증감식으로 넘어갑니다.
			//% 나머지 연산자
			//2로 나눴을때 나머지가 1이면 홀수
			//				    0이면 짝수
			if(i%2==1) {
				continue;
			}
			System.out.println("i = "+i);
			ssum+=i; //sum=sum+i
		}
		System.out.println("1~10까지 짝수의 합 : "+ssum);

	}//메인블록

}//클래스블록

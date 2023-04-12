package javatest;

public class Ex1 {

	public static void main(String[] args) {
		
		int count; //구구단 단 수
		int sum; //곱셈 계산
		
			
		Outter :for(count=2; count<=9; count++ ) {
			//홀수단만 출력시키기
			if(count%2==0) {
				
			}else {
				System.out.println(count+"단");
				
				for(int i=1; i<=9; i++) {
					
					//9단을 출력한 후 반복문을 탈출
					if(count==10) {
						
						//label이 달린 반복문을 탈출한다
						break Outter;
					}
					sum=count*i;
					System.out.printf("구구단 %dx%d = %d\n",count,i,sum);
					System.out.println();
				}
			}
		}
	}//메인블록

}//클래스블록

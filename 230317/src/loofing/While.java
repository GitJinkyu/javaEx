package loofing;

public class While {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while(i<=100) {
			sum=sum+i;
			System.out.println("while 문: "+i);
			i++;
			
		}
		System.out.println("1~100까지의 합 : "+sum);
		
		do {
			System.out.println("do whil문은 코드블럭을 무조건 1회 실행");
			System.out.println("1회 실행후 조건문이 참일때까지 반복 합니다");
			System.out.printf("%d",i);
			
		}while(i<13);{
			System.out.println("while문 반복");
		}
		
		
		
		
		
		
	}

}

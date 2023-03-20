package forEx;

public class Ex04_02 {

	public static void main(String[] args) {
		//1~100까지 정수 중 3의 배수의 총합
		int sum=0;
		
		for(int i=1; i<101; i++) {
			
			//3의 배수인지 확인
			// != 아니면 (!이 붙으면 부정)
			if(i%3 != 0) {
				//continue = 3의 배수가 아니면 증감식으로 이동
				continue;
			}
			//3의 배수만 이 아래 블록으로 넘어올수있다
			System.out.println("i="+i);
			sum+=i;
			
		}
		
		System.out.println("1~100까지 3의 배수의 총합="+sum);

	}

}

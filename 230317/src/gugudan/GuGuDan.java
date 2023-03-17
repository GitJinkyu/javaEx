package gugudan;

public class GuGuDan {

	public static void main(String[] args) {
	
		int count; //구구단 단 수
		int sum; //곱셈 계산
		
		for(count=1; count<=9; count++ ) {
			System.out.println(count+"단");
			
			for(int i=1; i<=9; i++) {
				sum=count*i;
				System.out.printf("구구단 %dx%d = %d\n",count,i,sum);
				System.out.println();
			}
		}
		
		

	}

}

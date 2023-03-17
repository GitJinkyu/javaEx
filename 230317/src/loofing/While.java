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

	}

}

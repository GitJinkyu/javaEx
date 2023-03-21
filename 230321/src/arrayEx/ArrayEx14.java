package arrayEx;


public class ArrayEx14 {

	
	public static void main(String[] args) {
		int[] scores = {40, 25, 75, 95};
		int sum=0;
		
		for(int i : scores) {
			sum+=i;
		}
		
		System.out.println("점수의 총합 : "+sum);
		System.out.println("평균 점수 : "+(double)sum/scores.length);
		
		
		
			
	
	}
}
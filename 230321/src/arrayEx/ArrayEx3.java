package arrayEx;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		//배열에 입력된 값 총합의 평균 구하기
		int[] score = {90, 70, 55, 65, 40, 35};
		int sum=0;
		
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
		}
		System.out.println("총합의 평균 : "+ sum/score.length);
	}

}

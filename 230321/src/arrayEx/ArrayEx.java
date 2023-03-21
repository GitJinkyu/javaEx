package arrayEx;

public class ArrayEx {

	public static void main(String[] args) {
		//배열
		//같은 타입의 데이터를 연속된 공간에 나열하고 
		//index를 부여한 자료구조
		//*같은 타입만 저장이 가능!
		//*한번 생성된 배열의 길이는 수정 불가능
		//배열의 길이를 확인하는 방법 : 변수명.length
		
		
		//배열의 선언
		//int score[];
		//배열 선언과 동시에 값을 넣는 방법 {}안에 값을 입력 
		int[] score = {90, 80, 60, 85, 50, 60, 70, 55, 99, 80};
		
		//배열의 값을 참조 하는 방법
		//변수이름 [index]
		System.out.println("score[0]= "+score[0]);
		System.out.println("score[7]= "+score[7]);
		System.out.println("score[4]= "+score[4]);
		
		//배열의 길이를 반환 : 배열변수이름.length
		//뒤에()가 붙어있는것은 메서드이고 안붙어있는 length는 필드이다. 
		int j = score.length;
		System.out.println("배열의 길이 : "+score.length);
		//i = 0 ~ 9
		int sum = 0;
		for(int i = 0; i<score.length; i++) {
			sum += score[i];
			
		}
		System.out.println("점수 총 합계 : "+ sum);
		System.out.println("평균 : "+ sum/score.length);
		

	}

}

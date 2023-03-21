package arrayEx;

public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) {
		// 배열 선언
		int[] score;
		// 배열을 초기화를 안하고 선언만했을때 나중에 다시 값을 넣으려할때는
		//중괄호를 사용해서 값을 입력하면 오류가 발생
		// score = {10, 20, 30}; <= 오류 발생
		
		//배열 선언후 생성하는 방법 1.
		//변수명 = new 타입 [] {넣을 값 . . .}
		score = new int[] {10,20,30};
		System.out.println(" "+score[1]);
		//배열 선언후 생성하는 방법 2.
		//값의 목록이 없지만 미리 배열을 만드는 경우
		//타입[] 변수 = new 타입[길이]
		score = new int[10];
		System.out.println("int타입을 저장할 10개의 공간을 만들었어요");
		System.out.println(" "+score[1]);
		
		
		
		
		
		
		
		//초기화식 조건식 증감식;
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
			
		}
		
		
		
		// java.lang.ArrayIndexOutOfBoundsException
		// 배열의 index를 초과하는 방 번호가 입력된 경우 예외발생
		// 배열의 인덱스는 0부터 시작한다.
		// 배열의 총길이 =배열안에 입력된 데이터의 갯수를 반환 한다.
		//int sum = score[3];
		
		
		

	}

}

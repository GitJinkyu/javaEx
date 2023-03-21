package arrayEx;

public class ArrayEx2 {

	public static void main(String[] args) {
		//배열을 생성
		String names[]= {"유재석","노홍철","정형돈","박명수","하하","정준하"};
		
		
		//반복을 이용해서 배열에 입력된 값을 출력
		//초기화;조건식;증감식
		//변수명.length : 배열의 총 길이
		for(int i=0; i<names.length; i++) {
			//배열의 값에 접근 : 변수이름[방번호]
			System.out.println(names[i]);
		}
			

	}

}

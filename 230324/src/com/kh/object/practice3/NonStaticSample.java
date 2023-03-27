package com.kh.object.practice3;

public class NonStaticSample {
	//메서드
	public void printLottoNumbers() {
		//1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
		//int num = (int)(Math.random()*45+1);
		
		//6개의 임의의 수를 저장할 배열 생성
		int[]lotto = new int[6];
		
		
		for(int i = 0; i<lotto.length; i++) {
			//임의의 수를 생성하여 배열에 저장
			lotto[i]=(int)(Math.random()*45+1);
			
			//중복 체크 
			//기존에 동일한 숫자가 입력되었는지 체크
			for(int j = 0; j<i; j++) {
				if(lotto[i]==lotto [j]) {
					i--;
				}
				
			}
			
			
		}
		//방을 바꿀떄 필요한 저장공간을 생성
		int temp = 0;
		//순서대로 정렬하기
		for(int i = 0; i<lotto.length;i++) {
			//오름차순 /내림차순
			for(int j = i; j<lotto.length;j++) {
				if(lotto[i] > lotto[j]) {
					// 방바꾸기
					temp = lotto[i];
					//작은 수가 앞으로 올수 있도록 자리바꿈
					lotto[i]= lotto[j];
					//큰수를 뒤 공간에 저장
					lotto[j] =temp;
				}
			}
		}
		
		//반복문을 활용하여 배열 출력
		System.out.println("lotto Number");
		System.out.print("랜덤 값: ");
		for (int num:lotto) {
			System.out.print(+num+" ");
		}
		System.out.println();
	}

		
	public void outputChar(int num,char c) {
		//매개변수로 입력 받은 숫자만큼 
		//매개 변수로 입력 받은 문자를 출력하는
		//반복문을 실행
		System.out.println(c+"문자 "+num+"개 출력 : ");
		for(int i=0; i<num; i++) {
			System.out.print(c+" ");
		}
		System.out.println();
	}
	
	
	public char alphabette() {
		//문자코드
		//A-Z=65~90
		//a-z=7~122
		//91~96번까지는 제외 하는 처리
		//임의의 수를 생성
		//숫자를 추출해서 char 타입으로 변환
		
		//범위 65~122
		//0 <= random < 1 *숫자 +숫자
		//*숫자 = 범위
		//+숫자 = 시작값
		int num  = (int)(Math.random()*58+65);
		System.out.print("랜덤 영문자 출력 : "+(char)num);
		System.out.println();
		return (char)num;
	}
	
	
	
	
	public String mySubstring(String str, int index1, int index2) {
		//문자열의 인덱스값을 이용하여 문자열을 추출
		//시작인덱스는 포함 끝인덱스는 불포함
		//문자열 추출할때 많이 사용하는 메소드
		
		
		System.out.println(str+"의 "+index1+"번 "+index2+"번 인덱스 사이의 값 출력 : "+str.substring(index1, index2));
		return str.substring(index1, index2);
		
	}
	

}


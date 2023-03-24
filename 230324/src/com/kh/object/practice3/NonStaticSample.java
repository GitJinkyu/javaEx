package com.kh.object.practice3;

public class NonStaticSample {
	//메서드
	public int[] printLottoNumbers() {
		//1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
		int[]numbers = new int[6];
		
		int lottonum=(int)((Math.random() * 45)+1);
		int count=0;
		
		while(count<6) {
			 
			for(int number :numbers ) {
				if(number==lottonum) {
					break;
				}else {
					numbers[count++] = lottonum;
				}
			}
		count++;
		}//while종료
		return numbers[1];
	}//로또종료
	
    
		
		
		
		//응용 --> 오름차순 정렬로 출력
	
	
	public void outputChar(int num,char c) {
		
	}
	
	public char alphabette() {
		return 'a';
	}
	
	public String mySubstring(String str, int index1, int index2) {
		return "d";
	}
	

}


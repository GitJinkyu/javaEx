package com.kh.object.practice3;

public class Application {

	public static void main(String[] args) {
		NonStaticSample LOTTO= new NonStaticSample();
		
		
        System.out.print("6개의 임의의 숫자: "+LOTTO.printLottoNumbers());
        
	}
}

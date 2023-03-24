package com.kh.object.practice;

public class Application {

	public static void main(String[] args) {
		
		//객체 생성
		Product product1= new Product("ssgnote9","갤럭시노트9","경기도 수원",960000,10.0);
		Product product2= new Product("lgxnote5","LG스마트폰5","경기도 평택",780000,0.7);
		Product product3= new Product("ktsnote3","KT스마트폰3","서울시 강남",250000,0.3);
		
		//객체 필드값 출력
		System.out.println(product1.information());
		System.out.println(product2.information());
		System.out.println(product3.information());
		
		System.out.println("==========================================");
		
		// 객체 가격,세금 변경
		product1.setPrice(1200000);
		product2.setPrice(1200000);
		product3.setPrice(1200000);
		
		product1.setTax(0.05);
		product2.setTax(0.05);
		product3.setTax(0.05);

		//수정된 객체 필드값 출력
		System.out.println(product1.information());
		System.out.println(product2.information());
		System.out.println(product3.information());
		
		System.out.println("==========================================");
		
		//세금률 적용된 가격 출력
		
		
		product1.realprice();
		product2.realprice();
		product3.realprice();

	}

}

package com.kh.object.practice2;

public class Application {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("자바의정석",20000,0.2,"윤상섭");
		System.out.println(book1.information());
		System.out.println(book2.information());
		
		System.out.println("========================");

		//값 수정하고 출력하기
		book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("홍길동");
		System.out.println("수정된 결과 확인");
		System.out.println(book1.information());
		
		System.out.println("========================");
		
		//할인율 적용해서 출력하기
		book1.realprice();
		book2.realprice();
		
		
		
		
		
		
		
		
		
		
		
	}

}

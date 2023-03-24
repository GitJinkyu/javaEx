package com.kh.object;

public class Product {
	//필드
	private String id;
	private String name;
	private String site;
	private int price;
	private double tax;
	
	//기본생성자
	public Product() {
		
	}
	
	//매개변수 생성자
	public Product(String id,String name,String site,int price,double tax) {
		this.id=id;
		this.name=name;
		this.site=site;
		this.price=price;
		this.tax=tax;
	
	}
	
	//메서드
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	//정보 출력 메서드
	public String information() {
		return id+" "+name+" "+site+" "+price+" "+tax;
	}
	
	//세율 계산 가격 메서드
	public void realprice() {
		int res = (int)(price+(price*tax));
		System.out.println("상품명= "+name);
		System.out.println("부가세 포함 가격= "+res);
		
	}
}

package com.kh.object.practice2;

public class Book {
	//필드
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	//기본 생성자
	public Book() {
		
	}
	//매개변수 생성자
	public Book(String title,int price, double discountRate,String author) {
		this.title=title;
		this.price=price;
		this.discountRate=discountRate;
		this.author=author;
	}
	
	
	
	//메서드
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String information() {
		return title+"  "+price+"  "+discountRate+"  "+author;
	}
	
	public void realprice() {
		int res = (int)(price-(price*discountRate));
		System.out.println("도서명: "+title);
		System.out.println("할인된가격: "+res);
	}
	
	
}

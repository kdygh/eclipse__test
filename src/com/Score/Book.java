package com.Score;
/*
멤버 필드
 - 변수, 상수
 - 객체가 만들어질 때 특징적인 속성을 지정함
 
 */

/*
 * 변수			위치							생성시기
 * ===============================
 * 클래스변수		클래스영역					클래스가 메모리에 올라갈 때
 * 													(클래스가 생성될 때)
 * 													---------------------------
 * 인스턴스 변수									인스턴스가 생성될 때
 * 													(객체에 메모리할당이 될 때 (new라든가))
 * ----------------------------------------------------------------
 * 지역변수		클래스 영역 이외				변수 선언문이 수행될 때
 * 					(메소드, 생성자, 초기화
 * 					블럭 내부)
 * 
 * 
 * 객체를 생성하지 않고도 접근 가능한 변수를 클래스 변수라고 한다고 한다
 * */				

public class Book 
{
	//
	private String name;
	private String writter;
	private String isbn;
	private int price;
	private int currPage;
	
	public void nextPage() 
	{
		currPage++;
	}
	
	public void previousPage()
	{
		currPage--;
	}
	
	public Book() 
	{
		name = "";
		writter = "";
		isbn = "";
		price = 0;
		currPage = 0;
	}
	
	public Book(String name, String writter, String isbn, int price, int currPage) {
		super();
		this.name = name;
		this.writter = writter;
		this.isbn = isbn;
		this.price = price;
		this.currPage = currPage;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWritter() {
		return writter;
	}
	public void setWritter(String writter) {
		this.writter = writter;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCurrPage() {
		return currPage;
	}
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	
	
}

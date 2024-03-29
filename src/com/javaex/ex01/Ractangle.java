package com.javaex.ex01;

//추상클래스로부터 상속받을대는 extends 표기해주기
public class Ractangle extends Shape {
	// **shape를 상속받았으니 abstract 안쪽에 있는 추상메소드를 반드시 구현필요

	// 필드 생성----------------------------
	private int width;
	private int height;

	// 생성자---------------------------------
	public Ractangle(String fillColor, int width, int height) {
		super(fillColor);
		this.width = width;
		this.height = height;
	}

	// showInfo()영역을 할게 아니라-------------------------------------
//	public void showInfo() {
//		System.out.println("[사각형]#면색:" + super.fillColor + " " + " #가로:" + width + " #세로:" + height + "그렸습니다.");
//	}
	// =====================================================================
	// 부모가 선언한 추상메서드는
	// 이안에 반드시 구현해야 한다--그래서 override 입력해주기 (정답 ok)

	@Override
	public void draw() {
		System.out.println("[사각형]#면색:" + super.fillColor + " " + " #가로:" + width + " #세로:" + height + "그렸습니다.");
	}
	
	
	
	//getter setters=====!!이것 설정해주기=====================================
	public int getWidth() {
		return this.width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	

}

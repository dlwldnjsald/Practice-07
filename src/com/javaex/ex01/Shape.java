package com.javaex.ex01;

public abstract class Shape  {
	//abstract가 붙어서 추상클래스를 나타냄
	//객체화 되지 않는다 그러므로 
	
	//field 생성------------------------
	

	protected String fillColor;
	public int width;
	
	//생성자 ---------------------------
	public Shape(String fillColor){
		this.fillColor=fillColor;
	}
	
	////추상메서드--------------------------
	//추상 클래스를 상속 받은 클래스에서 반드시 구현해야 한다-
	public abstract void draw();
}



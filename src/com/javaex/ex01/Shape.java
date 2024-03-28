package com.javaex.ex01;

public abstract class Shape {
	
	//field 생성------------------------
	
	protected String fillColor;
	
	//생성자 ---------------------------
	public Shape(String fillColor){
		this.fillColor=fillColor;
	}
	
	////추상메서드는--------------------------
	//추상 클래스를 상속 받은 클래스에서 반드시 구현해야 한다-
	public abstract void draw();
}



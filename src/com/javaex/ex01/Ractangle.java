package com.javaex.ex01;

//추상클래스로부터 상속받을대는 extends 표기해주기
public class Ractangle extends Shape{
	
	//필드 생성----------------------------
	private int width;
	private int height;
	
	//생성자---------------------------------
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
	//showInfo()영역?-------------------------------------
	public void showInfo(){
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}
	//----------------------------------------------------
	//부모가 선언한 추상메서드는 반드시 구현해야 한다-----------------
	
	@Override
	public void draw() {
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}
		

}



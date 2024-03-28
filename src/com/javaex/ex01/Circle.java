package com.javaex.ex01;

public class Circle extends Shape{
	
	//field 생성------------------------
	private int radius;
	
	//생성자-----------------------------
	public Circle(String fillColor, int radius){     
		super(fillColor);
		this.radius=radius;
	}
	
	//-----------------------------------
	//부모가 선언한 추상메서드는 반드시 구현해야 한다---------------
	
	@Override     //->이부분을 새로 입력해서 수정함 
				//override 꼭 써줘야 하는 이유?? 뭐였지??
	
	public void draw(){
		System.out.println("[원]#면색:" +super.fillColor+ 
				"  #반지름:" + radius +" 그렸습니다.");                                               
	}
	
	
}




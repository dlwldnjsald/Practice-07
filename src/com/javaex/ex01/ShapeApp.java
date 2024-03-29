package com.javaex.ex01;

public class ShapeApp {
	//의심해볼 사항 파라미터 개수가 없을 수 있다 / 객체화가 되지 않을수 있음
	public static void main(String[] args) {
			
		
		//Shape s = new Shape("빨강"); //추상클래스는 객체화할수없다!!!///
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		//sr1을 그리는 메소드 호출==============================================///
		sr1.draw(); 
		
		//sr1의 가로크기 출력==================================================///
		//ractangle class 내에서 가로 세로가 프라이빗으로 선언되있으니 
		//ractangle dp 게터 세터 setting..
		
		int sr1Width = ((Ractangle)sr1).getWidth();	     //downcasting
			System.out.println("sr1의 가로는 " + sr1Width + "입니다");
		
	}	
		
}
	
	
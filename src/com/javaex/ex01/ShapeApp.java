package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {
			
		
		//Shape s = new Shape("빨강");
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		//sr1을 그리는 메소드 호출
		Drawable objs[] = new Drawable[] {
				  sr1
		};
		
		for (Drawable obj: objs) {
			if (obj instanceof Drawable) {
				//특정 인스턴스가 Drawable 인터페이스의 구현인가?
				obj.draw();
			}	
			
		//sr1의 가로크기 출력
		}	
		Object width = null;
		System.out.println(width); 		

	}
	
}
	
	
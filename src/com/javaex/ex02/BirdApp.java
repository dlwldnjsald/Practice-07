package com.javaex.ex02;
// 이 클래스는 수정하지 않습니다// 조건


public class BirdApp {

    public static void main(String[] args) {
        Bird bird01 = new Duck();
        bird01.setName("꽥꽥이");
        bird01.fly();
        bird01.sing();
        bird01.showName();

        Bird bird02 = new Sparrow();
        bird02.setName("짹짹이");
        bird02.fly();
        bird02.sing();
        bird02.showName();
    }

}

//실행코드 클래스 마우스에 한번 클릭하고 
//콘솔에 출력하면 뜬다 (주의)
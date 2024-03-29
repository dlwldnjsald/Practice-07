package com.javaex.ex03;

// 먼저 4개 클래스 공통점 찾기 -> soundable 

//soundable 인터페이스 안에 sound라는 메소드 존재
//모든 클래스는 이 sound메소드를 구현해 내어야 한다는것을 알수있음

public class SoundApp {

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		printSound(new Sparrow());
		printSound(new Duck());
	}

	// -----------------------------------------------------///
	public static void printSound(Soundable soundable) {
		// 동일한 인터페이스 Soundable을 구현

		// 출력해주기
		System.out.println(soundable.sound());

	}//----------------------------------------------------///

}

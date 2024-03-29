package com.javaex.ex02;
// 1) bird부터 열어보기 

// 덕과 스페로우의 공통값 네임을 끄집어낼것

public abstract class Bird {

	private String name; // name private으로 선언되어있음

	// getters/setters-----------
	protected String getName() {
		return this.name;
	}

	protected void setName(String name) {
		this.name = name;

	}

	// duck&sparrow가 공통적으로 가진 메서드의 설계를
	// 추상메서드로 분리하기
	public abstract void sing(); // 선언만 한다
	public abstract void fly();
	public abstract void showName();
	
	
	

}

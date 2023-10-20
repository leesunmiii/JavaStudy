package com.sist.manager2;
import com.sist.manager.*;
public class Sub extends Super {
	// 변수 / 메소드
	/*
	 * 	private int a; // 자신의 클래스 안에서만 접근 가능
		protected int b; // 같은 패키지, 상속을 내리면 => 패키지와 관계없이 접근 가능
		int c; // 같은 패키지안에서만 접근 가능
		public int d; // 모든 클랴스에 접근 가능
	 * 	
	 */
	public Sub() {
		//this. 찍고 보면 b와 d만 가지고 올 수 있는걸 알 수 있음
	}
}

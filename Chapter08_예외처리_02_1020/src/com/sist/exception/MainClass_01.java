package com.sist.exception;
/*
		=> 캡술화 : private변수 /읽기 getter 쓰기 setter 메소드 추가
		=> 재사용
			상속 (is-a)/포함 (has-a)
		=> 수정 /추가 => 다형성
			오버라이딩 / 오버로딩
		-----------------------------------------------------
		클래스의 종류
			------------- 미완성 클래스 (미완성 :메소드 구현이 안된 상태)
									=> 단점 : 메모리 할당이 불가능 (new 사용불가)
									=> 반드시 상속을 내려서 구현 후 사용가능 => 오버라이딩 기법 
									=> 관련된 클래스를 한 개의 객체명으로 관리할 때 사용
			= 추상 클래스 : 단일상속, 멤버변수, 생성자, 구현된 메소드, 구현이 안된 메소드
			= 인터페이스 : 다중상속, 상수만 사용가능, 구현이 안된 메소드가 중시
										    구현된 메소드 : default, static
			-------------
			=> 상속
				class ==== class 
					 extends
				interface ==== interface
						extends
				interface ==== class
					    implement
			---------------------------------------
			class A
			class B
			class B extends A,C ===> 오류
			
		  	class A
		  	class C extends A
		  	class B extends C ===> 정상
		  	
		  	interface A
		  	interface B extends A
		  	interface C extends B
		  	interface D extends A,B ===> 가장 많이 사용 
		  	------------------------ 다중상속
		  	
		  	class A
		  	interface B
		  	interface C
		  	class D extends A implementB,C
		  	----------------------------------------
		  	
		  	interface A
		  	interface B
		  	class C implement A,b
		  	
		  	interface ===> 컨테이너와 컨트롤러 역할
		  				 묶어주는 역할	찾기,제어
		  	 			   ----------------- 스프링 => 공통으로 모아서 사용하는 것 : AOP
		  	 			   					 소프트웨어 용어
		  	
 *
 */
public class MainClass_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

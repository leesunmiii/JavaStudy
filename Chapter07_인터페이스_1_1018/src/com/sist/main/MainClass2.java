package com.sist.main;
/*
 * 
 * 		인터페이스
 * 			기본문법) 248page
 * 				변수는 사용할 수 없다 (상수만 사용가능)
 * 				int i; (오류)
 * 				int i=10; (O) 
 * 				------------- => 앞에 public static final 이 생략된 상태, 컴파일러가 자동으로 추가해준다
 * 								     ------ 무조건 public을 사용함
 * 								static final int i=10;  // 상수
 * 								final int i=10; 		// 상수형 변수
 * 								int i=10;				// 변수
 * 			
 * 			메소드
 * 				구현이 안된 메소드 : 구현내용이 여러개인 경우
 * 					void display(); ==>  앞에 public abstract 생략된 상태
 * 					public void dispaly(); ==> 중간에 (abstract) 생략된 상태
 * 				구현이 된 메소드  : 공통으로 사용되는 부분 정의
 * 					=> 새로운 기능 추가
 * 					public default void aaa(){} 
 * 						   ------- 접근지정어가 아님
 * 					public static void bbb(){} : 재정의 안됨, 공통으로 쓰는거
 * 					==> 메소드나 상수를 선언 => 무조건 public
 * 				상속 : 인터페이스도 클래스다
 * 					  ---------------- 상속 시 상위 클래스다
 * 						extends 
 * 						implements
 * 						----------- => 둘 다 상속과 관련되어있음
 * 				다중 상속 : ,로 구분한다
 * 				interface ==== interface
 * 						extends
 * 				interface ==== class
 * 						implements
 * 
 * 				class A
 * 				interface B
 * 				interface C
 * 				class D extends A implements B,C
 */
//	interface A
//	{
//		void aaa();
//		//void kkk(); => 이러면 에러남
//		//default void kkk(){} //=> 새로운 기능 구현 한 것
//		public static void kkk() {System.out.println("aa");}--------------------------------------------------------
//	}
//	
//	class B implements A{
//	
//		@Override
//		public void aaa() {
//			System.out.println("a");
//		}
//		public void kkk() {
//			System.out.println("bb");
//		}
//		
//	}

interface A
{
	void aaa();
}

interface B extends A
{
	
	default void bbb() {
		System.out.println("a");
	}
}

public class MainClass2 {
//	final int a; //  초기값을 안줘서 오류
//	final int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b=new B();
		b.aaa();
		
		
		
//		A a=new B();
//		a.aaa();
	}

}

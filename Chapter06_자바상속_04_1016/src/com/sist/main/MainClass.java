package com.sist.main;
/*
 * 
 * 		1. 상속
 * 			=> 멤버변수, ***메소드 (기능 => 상속)
 * 			   -------
 * 				안되는 것 : 접근 지정어 중 private, default (패키지가 다른경우에만 불가능)
 * 			=> 형식
 * 			단일 상속만 가능
 * 			class Subclass extends SuperClass
 * 						   -------
 * 							기존의 클래스를 확장(수정, 추가)
 * 			{
 * 				SuperClass가 가지고 있는 모든 메소드 사용이 가능
 * 				=> 변경해서 사용이 가능 (오버라이딩)
 * 			}
 * 
 * 			=> 호출
 * 			  	class A
 * 				class B extends A
 * 					  --		--
 * 					  Sub		Super	=> Super > Sub => 상속을 내린 클래스가 상속을 받은 클래스보다 크다
 * 				***	모든 클래스의 상위 클래스는 Object
 * 					=> 자바에서 지원하는 라이브러리의 메소드 => Object를 리턴한다
 * 					// 상위 클래스는 하위 클래스에 접근할 수 없다 (내가적은거)
 * 
 * 					=> 확장 (클래스 사용시에는 확장된 클래스를 사용한다) 
 * 					// A a=new A() => 활용
 * 					   B b=new B(); // 기본
 * 					   A a=new B(); // 특별한 경우에 사용
 * 									=>	A로부터 상속을 받은 클래스를 묶어서
 * 					   ------------
 * 							카페 => 게시판
 * 						*** 상위 클래스는 하위 클래스에 있는 변수/메소드에 접근이 불가능하다
 * 						 B b=new B();
 * 						 B b=new B();
 * 
 * 						class A
 * 						{
 * 						---------------------
 * 							int a,b; ==> c
 * 							void aaa(){}
 * 							void bbb(){}
 * 						--------------------- a
 * 						}
 * 						class B extends A
 * 						{
 * 						------------------------------------------------------------
 * 							int c,d;
 * 							-----------------  눈에 보이지 않지만 메모리 상에만 배치
 * 							int a,b;
 * 							-------------
 * 							void aaa(){} => 변경 시 
 * 							void bbb(){} => 변경 시
 * 							-----------------c
 * 							void ccc(){}
 * 						------------------------------------------------------------- b
 * 						}
 * 						A a=new A();
 * 						---
 * 						A영역에 있는 걸 갖다쓰겠다
 * 
 * 						B b=new B();
 * 						---
 * 						B영역에 있는 걸 갖다쓰겠다
 * 
 * 						A c=new B(); => A가 가지고 있는 변수
 * 									    B에서 오버라이딩 된 메소드 호출
 * 							c는 접근 불가능 : 변수(c,d)
 * 										   메소드(ccc)
 * 
 * 						클래스 객체명
 * 						---- 객체는 클래스에 있는 변수, 메소드만 사용하겠다 라는 뜻
 * 						A a => A클래스의 정의된 변수, 메소드
 * 
 * 						상위 클래스 = 하위클래스
 * 						-------- 	-------
 * 						  변수		 메소드			==> 메소드는 상위 클래스에 있는 것만 가능
 * 	
 * 					
 */	
class A
{
	int a=10,b=20;
	void aaa() {System.out.println("A:aaa() Call...");}
	void bbb() {System.out.println("A:bbb() Call...");}
}
	class B extends A
	{
		int a=100, b=200, c=300, d=400;
		void aaa() {System.out.println("B:aaa() Call...");}
		void bbb() {System.out.println("B:bbb() Call...");}
		void ccc() {System.out.println("B:ccc() Call...");}

		
	}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa=new A();
		System.out.println("aa.a="+aa.a);
		System.out.println("aa.b="+aa.b);
		aa.aaa();
		aa.bbb();
		// 가장 많이 사용 => 70퍼
		B bb=new B();
		System.out.println("bb.a="+aa.a);
		System.out.println("bb.a="+aa.b);
		//System.out.println("bb.a="+aa.c);
		//System.out.println("bb.a="+aa.d);
		bb.aaa();
		bb.bbb();
		bb.ccc();
		
		A cc=new B();
		// 인터페이스 (클래스 여러개를 묶어서 사용) => 30퍼
		System.out.println("cc.a="+cc.a);
		System.out.println("cc.b="+cc.b);
		cc.aaa(); //B
		cc.bbb(); //B
		
		//멤버변수 : 클래스, 메소드 :  생성자 타입에 따라 달람짐 
		
		
	}

}

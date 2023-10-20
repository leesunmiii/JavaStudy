package com.sist.main;
/*
 * 
 * 		1. => 194page 꼭 읽어보기
 * 				목적, 형식
 * 		2. => 199page
 * 				논리적 포함 관계
 * 				
 * 					동물
 * 					 |
 * 				   포유류			| 위로 올라갈수록 추상화 => 공통점이 많이 있다
 * 					 |
 * 					인간			| 밑으로 내려가면 구체적
 * 					 |
 * 				--------------
 * 				|			 |
 * 			   남자			여자
 * 		
 * 		abstract => 추상적인 => 공통적인 내용 모아둔 것
 * 		게시판
 * 		 = 설계를 먼저 한다
 * 			= 글쓰기
 * 			= 상세보기			==> 이렇게 모아두는걸 추상클래스
 * 			= 목록
 * 			= 수정
 * 			= 삭제
 * 			= 검색
 * 
 * 		==> 답변형 게시판
 * 		==> 묻고 답하기
 * 		==> 갤러리 게시판
 * 		==> 댓글형 게시판
 * 		==> 추상/인터페이스 => 벤치마킹
 * 		
 * 		201 ~ 202 page
 * 			= 단일상속 => 변수 충돌
 * 			= 오버라이딩 => 재정의 => 메소드 변경
 * 			  변수 오버라이딩
 * 			  메소드 오버라이딩 (이게 보통 기본)
 * 			 = 오버로딩 / 오버라이딩
 * 			   ------  -------- 제정의 => 기존의 메소를 수정
 * 				|
 * 				중복 함수 정의 => 새로운 기능 추가
 * 		207 page
 * 			= 접근 지정어
 * 				=> private 변수는 접근이 불가능
 * 		211 page 생성자
 * 			class A
 * 			{
 * 				public A()
 * 				{
 * 					super()  ==> Object
 * 				}
 * 			}
 * 			class B extends A
 * 			{
 * 				public B()
 * 				{
 * 					super() ==> new A() 호출 ==> 생성자 첫줄에 사용해야함
 * 								this() ==> 생성자 첫줄에 사용, 
 * 								두개를 동시에 쓸 순 없다
 * 				}
 * 			}
 * 	
 * 			B b=new B(); => new A() => new B()
 * 			
 * 			****
 * 			= 자신의 객체 : this
 * 			= 자신의 생성자 : this() 
 * 			= 상위 클래스의 객체 : super ==> 215page
 * 			= 상위 클래스의 생성자 호출 : super()
 * 
 * 			====> 상속을 받은 클래스는 자신과 관련된 메소드, 변수, 상위클래스의 변수, 메소드 사용가능
 * 			====> 상속을 내린 클래스는 자신과 관련된 메소드, 변수만 사용가능 (하위클래스의 변수, 메소드 사용불가)
 * 
 * 			217 page (거의 안쓰니까 이런게 있구나 알아두기) ==> final ==> 변수는 상수형이다 => java.lang
 * 
 * 			221 page , 227 page
 * 				객체의 형변환
 * 				----------	형변환이 있다는건 클래스의 크기가 있다는 말
 * 										  ----------
 * 											반드시 상속, 포함
 * 											class A
 * 											{
 * 												int a,b;
 * 											}
 * 											class B
 * 											{
 * 												int a;					
 * 											}
 * 											--------------- 크기를 비교할 수 없다
 * 											class A
 * 											class B extends A
 * 											-------------------- A > B
 * 										
 * 											class A
 * 											{
 * 												B b=new B(); // 포함 클래스 => has-a
 * 											}
 * 											class B
 * 											-------------------- A > B
 * 				=> 묵시적 형변환
 * 				   class A
 * 				   class B extends A
 * 					
 * 				   A a=new B();
 * 				   ================== B b=(B)a; ===> 강제형변환					
 * 				   B b=new B();
 * 				   A a=b;
 * 	
 * 					클래스도 데이터형이다
 * 					=> 자바에서 지원하지않는 데이터형이라 사용자 정의 데이터형
 * 
 * 			*** 제어자
 * 			접근지정어 : private, protected, default, public
 * 			그 외 : static, final, abstract, synchronizer
 * 			static : 공통적인, 공통으로 사용하는 => 공유
 * 				==> 클래스, 메소드, 변수 ==> 지역변수에서는 사용할 수 없다
 * 			final : 마지막 
 * 				==> 클래스, 메소드, 변수, 지역변수
 * 				예)
 * 					public final class A => 확장할 수 없는 클래스
 * 							=> 상속을 할 수 없는 클래스
 * 							=> String, Math, System... (java.lang)
 * 					public final void display(){} => 오버라이딩이 불가능
 * 					public final int a=10; => 상수 => 값을 변경할 수 없음
 * 			abstract : 추상적인 (공통성을 갖고있다), 미완성
 * 				===> 추상클래스, 인터페이스
 * 
 * 			synchronizer : 동기적인 (네트워크, 쓰레드 할 때 많이 등장)
 * 				= 비동기 AJax
 * 				= 동기적 
 * 			조합
 * 			------------------------------------------------
 * 			대상 		조합
 * 			클래스		public, default, final, abstract
 * 						protected/ private ==> 사용시 오류
 * 			변수			private, final, static				
 * 			메소드		public, final, static, abstract
 * 			지역변수		final
 */
public class MainClass3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

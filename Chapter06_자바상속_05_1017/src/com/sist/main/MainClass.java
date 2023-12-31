package com.sist.main;
/*
 * 		==> 어떤 책에는 "객체지향에 연연하지 말고 ..." 라고 적혀있다
 * 
 * 		객체지향의 3대 특성	=> 문법사항이 아니다, 권장사항임
 * 		---------------
 * 		class Window extends JFrame	=> 재사용기법	=> 상속 : 변경사항이 있는 경우
 * 			
 * 		class Window
 * 		{
 * 			JFrame f=new JFRame() => 재사용기법 => 포함 : 변경사항이 없는 경우
 * 		}
 * 		=> 웹 / 스프링 => 상속이 거의 없다 => 대부분 포함 클래스를 많이 사용한다
 * 		
 * 		1. 캡슐화 : 데이터 보호 목적
 * 				   멤버변수 => private(은닉화) => 기능설정을 통해 접근
 * 											   ------
 * 												멤버변수 : 저장/읽기
 * 												---------------- getter읽기/setter저장
 * 				   데이터를 감추고 메소드를 통해 접근하는 방식
 * 		2. 상속/포함 : 기존의 클래스를 재사용
 * 		   상속
 * 		   ---
 * 			1) 목적
 * 				= 재사용 (신뢰성이 뛰어나다, 개발속도가 빠르다)
 * 				= 유지보수를 쉽게 만든다
 * 				= 중복을 최대한 제거
 * 				= 통일성이 있는 코드 작성
 * 				= 단점 : 실행속도가 느리다 (게임 : 자바(x), C/C++(X), 어셈블러 이용함)
 * 						------ 최적화 => exe (웹,모바일)
 * 										   J2EE J2ME => J2SE
 * 										    J2EE : 자바 기술로 기업환경의 어플리케이션을 만드는데 필요한 스펙들을 모아둔 스펙 집합
 * 				= 장점 : 적은 양의 코드로 새로운 클래스를 작성할 수 있다
 * 					class JFrame => 1000줄정도 있다 가정
 * 					{
 * 					  ------
 * 					  ------
 * 					  ------
 * 					  ------
 * 					  ------
 * 					}
 * 					class A extends JFrame
 * 					{
 * 					}
 * 			
 * 						코드를 공통적으로 관리하기 때문에 여러 코드를 추가, 변경이 용이
 * 												   ------------	 ---------
 * 													  오버로딩	  오버라이딩
 * 
 * 					*** 자바는 오버라이딩 프로그램이다 => 만든 사람이 외국사람이기때문에 우리가 변경해서 사용해야한다
 * 					 변경이 쉽게 만들어진 프로그램 : 프레임워크 (실제 소스를 제공해줘서 우리가 변경해서 사용)
 * 											   스프링(자바소스를 줌, 대신 너무 길어서(3~4만줄) 보기싫음) => 전자정부프레임워크 (실무 들어가면 아마 이거 쓸듯)
 * 													 => 애니프레임워크
 * 			
 * 			2) 작성방법
 * 				=> 확장한다 => 기존의 클래스를 확장해서 새로운 클래스를 제작한다
 * 				   extends
 * 				=> class Parent
 * 				   class child extends Parent
 * 					
 * 				=> 단점 : 단일 상속만 가능하다
 * 			3) 상속의 특징
 * 				1. 생성자, 초기화 블록은 상속 불가능
 * 				   상속받은 클래스의 객체 생성시에 => 상속내린 클래스가 먼저 메모리 할당을 한다
 * 				   class A
 * 				   {
 * 						int a,b;
 * 						String s;
 * 						-----------
 * 						public A()
 * 						{
 * 						}
 * 						------------ 자동추가
 * 				   }
 * 					
 * 				   class B extends A
 * 				   {
 * 						int c,d;
 * 						-------------------
 * 						public B()
 * 						{
 * 							super() // 생략되어있음// => 상속받은 클래스의 생성자 호출 
 * 						}
 * 						-------------------- 자동 추가
 * 				   }
 * 					
 * 					B b=new B(); => 가장 기본적인
 * 
 * 					 stack : 메모리에서 처리 (할당,해제)
 * 					---b---
 * 	
 * 					-------
 * 
 *								Heap : 실제 데이터 저장하는 공간 (프로그래머가 담당) 
 * 							---------------------------
 * 								---------super--------
 * 										----a----
 * 										
 * 										----b----
 * 
 * 										----s----
 * 
 * 										---------
 * 								----------------------
 * 
 * 								----------this---------
 * 										---c-----
 * 
 * 										---d----
 * 						
 * 										---------
 * 										-----------------
 * 								-------------------------
 * 			=> 모든 클래스의 상위 클래스 (최상위 클래스) : Object
 * 			=> private : 상속 가능, 접근 불가능
 * 			   					  --------- 접근 가능하게 하는 키워드 : protected
 * 			=> 상속을 받게 되면 상위 클래스 접근하는 방법 : super
 * 							----------
 * 							 자신의 클래스          : this
 * 							-----------		
 * 			상속을 내리는 클래스 : 상속받은 클래스에 접근이 불가능
 * 			상속을 받는 클래스 : 자신 + 상속 내리는 클라스까지 접근 가능
 * 						    this + super
 * 							
 * 		3. 다형성	 => 무조건x, 필요시에 구현
 * 			내가 변경해서 쓰고 싶다 : 오버라이딩
 * 			추가해서 사용하고싶다 : 오버로딩
 * 			 ==>오버로딩, 오버라이딩 이 두 개를 모아서 다형성이라고 함
 * 		[접근지정어] 리턴형 메소드명 (매개변수)
 * 		--------- ----- ------- -------
 * 		{
 * 		---------------------------------------------------------------
 * 						오버라이딩						오버로딩 : 기술면접(100%)
 * 		----------------------------------------------------------------
 * 		상태			   	  상속							같은 클래스안에서 작업해야함
 * 				=> 상속 없어도 오버라이딩 가능
 * 						: 익명의 클래스
 * 		메소드명			동일해야함								동일해야함	
 * 		매개변수			동일해야함								갯수나 데이터형이 달라야함
 * 		리턴형			동일해야함								관계 없음
 * 		접근지정어			축소 불가능, 확대 가능					관계 없음
 * 			private < default < protected < public
 * 
 * 			예)
 * 				void aaa()
 * 
 * 				=> protected void aaa()
 * 				   puilc void aaa()
 * 				   메소드는 다른 클래스와 연결하기 위한 것이기 때문에 주로 publi을 많이 사용함
 * 				=> Modify : 기존의 기능을 변경, New : 새로운 기능 추가
 * 				=> 면접의 기술 => 정의를 내린다 => 부연
 * 				=> 객체 지향 프로그램의 객체란?
 * 					현실세계를 특성화 시킨 것 => 특성화가 추상화. 추상화가 단순화 (X)
 * 					제가 사용해본 결과로는~~ 
 * 		------------------------------------------------------------------
 * 		상속 예외조건 (상속이 불가능한 것들) => static : 공통으로 사용이 가능
 * 					  					생성자 / 초기화 블록
 * 										private : 상속은 가능, 접근이 불가능
 * 		주의점)
 * 			접근지정어
 * 			클래스 => [접근지정어] class 클래스명
 * 				 	  public => 다른 메모리 할당
 * 			메소드 => [접근지정어] 리턴형 메소드명(매개변수)
 * 					  public
 * 			멤버변수 => [접근지정어] 데이터형 변수명
 * 					   private / protect
 * 			생성자 => [접근지정어] 클래스명()
 * 					  public
 * 			지역변수, 매개변수 : 접근지정어 사용 불가
 * 							 static 사용 불가
 * 							 => final만 사용가능 => 상수형
 * 			
 * 			메소드
 * 				멤버메소드 : static, 멤버변수,메소드 사용가능
 * 				static 메소드 : static만 사용가능
 * 					만약, 멤버변수, 멤버메소드를 사용할 때는 반드시 객체 생성후에 사용
 * 
 * 				class A
 * 				{
 * 					private int a;
 * 					static int b;
 * 					public void aaa()
 * 					{
 * 						a,b,bbb()
 * 					}
 * 					public static void bbb()//객체가 공동으로 사용하는 메소드이기때문
 * 					{
 * 						b : 사용가능
 * 						a,aaa() : 사용 불가능.
 * 								  사용하려면
 * 									A aa=new A();
 * 									aa.a
 * 									aa.aaa() 이런식으로 해야함
 * 					}
 * 				}
 * 			초기화블록 :자바에서 자동으로 호출되는
 * 				인스턴스 블록
 * 				{
 * 					static, 멤버변수를 초기화
 * 				}
 * 				static 블록
 * 				static{
 * 					static변수만 초기화
 * 				}
 * 
 * 			변수에 대한 초기화
 * 			1) 명시적 초기화 private int a=10;
 * 			---------------
 * 			2) 초기화 블록 : static 변수 초기화
 * 					=>static은 생성자를 호출할 필요가 없다 => 자동 메모리 할당
 * 			3) 생성자 : 인스턴스 변수 초기화
 * 					=> 인스턴스는 반드시 생성자를 호출해야 저장이 됨
 * 					=> new가 붙어야함. new 생성자()
 * 					=> 시작과 동시에 처리됨
 * 					   윈도우 => 화면설계
 * 					   웹 => 자동로그인, 쿠키읽기(예: 최근 본 레시피)
 * 					   일반 => 데이터베이스 연결, 서버 연결...
 * 			--------------- 클래스 영역은 선언만 함 => 구현
 * 			구현 => 연산처리, 제어문, 파일읽기, 오라클 데이터 읽기...
 */
class A
{
	int a;

	public A() {
		super();//Object 상속을 받고있음
	}
}
class B extends A
{
	int c;

	public B() {
		super();
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

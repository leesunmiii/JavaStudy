package com.sist.main;
class A
{
	int a=10,b=20;
	void aaa() 
	{
		System.out.println("A:aaa() Call...");
	}
	
}
class B extends A
{	
	int a=100,b=200;
	int c,d;
	// 오버라이딩 : 상속 받은 메소드 변경

	void aaa()
	{
		System.out.println("B:aaa() Call...1");
	}
	void bbb()
	{
		System.out.println("B:bbb() Call...");
	}
}
// B클래스는 A클래스에 있는 모든 것을 사용할 수 있다 (a,b,aaa())
// A클래스는 B클래스에 잇는 모든 것을 사용할 수 없다 (a,b,aaa() 자신 것만 사용가능)
public class MainClass_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		System.out.println("a=>"+a.a);
		System.out.println("b=>"+a.b);
		// B클래스에 있는 변수, 메소드는 사용이 불가능
		//System.out.println("c=>"+a.c);
		a.aaa();
		B b=new B();
		// b=> a,b,c,d,aaa(),bbb()
		System.out.println("a=>"+b.a);
		System.out.println("b=>"+b.b);
		System.out.println("c=>"+b.c);
		System.out.println("d=>"+b.d);
		b.aaa();
		b.bbb();
		// A > B => 클래스의 크기 ==> 범위 ( 상속 내린 클래스가 더 크다)
		/*
		 *  A a=new B();   가능
		 *  B b=new A();   오류 => 형변환은 가능
		 */
		
		A aa=new B();
		// aa => a,b,aaa()만 접근 가능
		System.out.println("aa.a=>"+aa.a);// 10
		System.out.println("aa.b=>"+aa.b); // 20
		//System.out.println("aa.c=>"+aa.c);
		//System.out.println("aa.d=>"+aa.d);
		aa.aaa();// B
		// 멤버변수를 쓸 때 클래스를 보고 => A aa
		// 메소드를 쓸 때 생성자 보ㅏ야함 => new B() 생성자
		//aa.bbb();
		B bb=(B) aa; // 상위 클래스 => 하위 클래스로 받는 경우, 형변환을 사용해야함
		// --------- 가장 많이 등장
		System.out.println("bb.a=>"+bb.a);
		System.out.println("bb.b=>"+bb.b);
		System.out.println("bb.c=>"+bb.c);
		System.out.println("bb.d=>"+bb.d);
		B cc=(B) new A(); // 오류 발생
		//int aa=(int)10.5;
		/*
		 * 
		 * 		상속 : 하위 클래스로 접근하는 것이 기본
		 * 			  -------------------------
		 * 			  class A
		 * 			  class B extends A
		 * 			  B b=new B();
		 * 				예외) static 상속이 아니라 같이 사용할 수 있게 해줌
		 * 					 private, 생성자, 초기화블록
		 * 					 상위 클래스는 공통적으로 메소드, 변수
		 * 			  A => 여러개를 한개의 클래스로 제어
		 */
		
		/*
		 * 		학생		회사원
		 * 		---		 ----
		 * 		학번		 사번
		 * 		---------------
		 * 		이름	     이름	
		 * 		나이		 나이
		 * 		학년		 연차
		 * 
		 * 		-----------------------
		 * 		먹는다()     먹는다()   
		 * 		잠을잔다 ()	잠을 잔다()	
		 * 		-----------------------
		 * 		공부한다()    업무르를 한다()
		 * 
		 * 					|
		 * 				   사람
		 * 				-----------
		 * 				이름
		 * 				나이
		 * 				먹는다()
		 * 				잠을 잔다()
		 * ㅂ		-----------------
		 * 		   |			|
		 * 		학생				회사원
		 * 		학번				사번
		 * 		학년				연차
		 * 		공부한다()		업무를 한다()
		 * 		------------------------------> 반복을 제거
		 * 		***상속은 단일상속만 가능
		 * 
		 * 		상위 클래스는 하위 클래스가 가지고 있는 변수, 메소드 사용이 불가능
		 * 		하위 클래스는 상위 클래스가 내려준 변수, 메소드를 사용할 수 있다
		 * 				=> 변수 (static) 상속은 아니고 사용가능
		 * 				=> 공통으로 사용가능
		 * 
		 * 		객체 생성
		 * 		하위 클래스로 객체 생성하는 방법
		 * 		class A
		 * 		class B extends A
		 * 		
		 * 		=> B b=new B();
		 * 		=> A a=new B();	 * 		=> 여러개의 클래스를 한 개로 묶어서 사용
		 * 		=> A bb=new B();
		 * 				--------
		 * 			B cc=(A)bb;
		 * 
		 * 		class 동물
		 * 		class 사람 extends 동물
		 * 		class 개 extends 동물
		 * 		class 소 extends 동물
		 * 		class 말 extends 동물
		 * 		class 돼지 extends 동물
		 * 		----------------------
		 * 		동물 ani=new 사람();
		 * 		
		 * 		ani=new 개();
		 * 
		 * 		ani=new 소();
		 */
	}

}

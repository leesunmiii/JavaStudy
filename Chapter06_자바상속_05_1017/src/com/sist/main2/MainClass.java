package com.sist.main2;
class Movie{
	// 공통성
	/*
	 * 		예약을 한다
	 *  	영화 목록을 보여준다
	 *  	상세보기
	 *  	영화 추천
	 */
	void reserve() {
		System.out.println("예약을 한다");
	}
	void list() {
		System.out.println("영화 목록");
	}
	void detail() {
		System.out.println("상세 보기");
	}
	void recommend() {
		System.out.println("영화 추천");
	}
}
class CGV extends Movie{

	
	@Override // 상속을 받고 내용을 수정하는, 기능을 추가하는
	public void reserve() {
		// TODO Auto-generated method stub
		System.out.println("CGV 예약");
	}
	

	@Override
	protected void list() {
	// private는 불가능, 축소이기때문
		// TODO Auto-generated method stub
		super.list(); // <= 지우고 수정 하는
	}

	@Override
	void detail() {
		// TODO Auto-generated method stub
		super.detail();
	}

	@Override
	void recommend() {
		// TODO Auto-generated method stub
		super.recommend();
	}

	
}
class MegaBox extends Movie{

	@Override
	void reserve() {
		// TODO Auto-generated method stub
		System.out.println("MegaBox 예약");
	}

	// 확장 => Movie가 가지고 있는 메소드 이외에 다른 기능 추가한 것
		public void print()
		{
			System.out.println("MegaBox:print() Call...");
		}
		
	@Override
	void list() {
		// TODO Auto-generated method stub
		super.list();
	}

	@Override
	void detail() {
		// TODO Auto-generated method stub
		super.detail();
	}

	@Override
	void recommend() {
		// TODO Auto-generated method stub
		super.recommend();
	}
	
	
}
/*
 * 상위 클래스 내용을 다 쓸 필요가 없을 때 사용하는것이 인터페이스
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CGV c=new CGV();
		c.reserve();
		
		MegaBox m=new MegaBox();
		m.reserve();
		
		// 한 개의 객체만 생성 => 상위 클래스 이용
		// 상속을 받는 목적 => 관련된 클래스를 묶어서 하나의 객체를 이용
		
		Movie mm=new CGV(); // Movie안에 있는 메소드를 호출
							// 메소드 호출시에 오버라이딩을 하게되면 변경된 메소드 호출
							// 생성자하고 클래스가 다른 경우 => 오버라이딩 된 메소드를 호출해달라는 뜻 new CGV가 가지고 있는 메소드
		mm.reserve();
		
		mm=new MegaBox();// mm은 print()를 호출할 수 없다
		mm.reserve();
		//mm.print(); 불가능
		
		/*
		 * 
		 * 		생성자와 클래스명이 다른 경우
		 * 		Movie m=new CGV()
		 * 		-----	---------
		 * 		m을 통해 접근시에 Movie에 있는 메소드와 멤버변수에만 접근 가능
		 * 		class Movie
		 * 		{
		 * 			int a;
		 * 			void print(){movie}
		 * 		}
		 * 		class CGV extends Movie
		 * 		{
		 * 			int b;
		 * 			void aaa(){}
		 * 			------------
		 * 			// 눈에 보이진않지만 메모리 상에는 존재
		 *			int a; 인데 int a=1000;으로 수정 => 멤버변수 오버라이딩
		 * 			void print(){movie}인데 void print(){cgv} => 메소드 오버라이딩
		 * 			-------------
		 * 		}
		 * 
		 * 		Movie m=new CGV();
		 * 				---------- 주소 변경
		 * 		m ==> a,print()만 제어 가능 => CGV가 지고 있는 print()
		 * 		m.a=> 100
		 * 
		 * 		1) 변수는 클래스명을 따라야함
		 * 		2) 메소드는 생성자를 봐야함
		 * 
		 * 		==> 클래스가 100개가 있음
		 * 		==> 기능별로 분리
		 * 		==> 1개의 객체가지고 100개 작업을 할거냐 ==> Object로 모아서 처리
		 * 		==> 배열을 만들 때
		 * 			Object[] obj={10, "aaa", 10.5, 'A', new Movie()};
		 * 
		 */
//		Object o=10;
//		o=10.5;
//		o="";
//		o='A';
		
//		Object o=10;
//		int i=(int)o;
		
		Object o=new CGV();
		
		CGV cc=(CGV)o;
		
		//자바에서 클래스 객체를 리턴하는 메소드 많이 존재
		
	}

}

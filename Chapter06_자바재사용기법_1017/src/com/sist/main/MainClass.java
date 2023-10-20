package com.sist.main;
/*
 * 		재사용기법
 * 		-------- 기존의 클래스 사용 (라이브러리)
 * 		=> 라이브러리는 상속보다 포함이 더 많음
 * 		   ------- 상속을 할 수 없는 클래스 = 종단 클래스
 * 				   종단 클래스 : public final class ClassName
 * 				   ----------------------------------------
 * 					=> java.lang 안에 많이 있음(220page)
 * 						 : String, Math, System, StringBuffer...
 * 							=> 변경할 수 없다 (완제품)
 * 		=> 상속 (is-a)
 * 		=> 포함 (has-a)
 * 		------------------------ 클래스를 비교할 수 있다
 * 		class A
 * 		{
 * 			int a,b,c,d,e,f;
 * 		}
 * 		class B
 * 		{
 * 			int a,b;
 * 		}
 * 
 * 		A > B (크기를 잴 수 없다 = 오류 발생)
 * 
 * 		< 크기를 잴 수 있는 상황 >
 * 		class A 
 * 		{
 * 		}
 * 		class B extends A
 * 		{
 * 		}
 * 		
 * 		A > B 상속내린게 더 크다
 * 		메모리 크기는 A < B
 * 
 * 		long(8) < float(4) => 수표현에 따라 크기 결정(수표현을 누가 더 많이 할 수 있냐)
 * 		1			1.000000
 * 		클래스는 범위에 따라 크기 결정 (공통성이 뭐가 더 많냐)
 * 	
 * 			식물
 * 			 |
 * 			나무
 * 			 |
 * 		-------------
 * 		|            |
 * 	   침엽수 		활엽수
 * 
 * 		class A
 * 		class B
 * 		{
 * 			A a;
 * 		}
 * 		=> 포함 클래스 (A<B)
 * 
 * 		=> 포함 : 변경없이 있는 그대로 사용
 * 		=> 상속 : 변경이 필요한 부분 => 오버라이딩
 * 
 * 		예)
 * 			윈도우 => 자동차 모양으로 윈도우 변경해서 사용
 * 				: 상속
 * 				class Login extends JFrame
 * 				{
 * 				}
 * 			윈도우 => 사각형으로 사용
 * 				: 포함
 * 				class Login
 * 				{
 * 					JFrame fr=new JFrame();
 * 					// 메소드에 선언 => 포함 클래스가 아니다
 * 					public void display()
 * 					{			
 * 						JFrame fr=new JFrame(); // 이건 지역변수, 클래스 영역 안에 들어가야 포함클래스라고 함
 * 					}
 * 				}
 * 
 * 				Login log=new Login();
 * 				log.fr.메소드()
 * 
 * 				==> 포함 클래스가 더 많다
 * 				예) 계산기 : 윈도우는 상속, 버튼은 포함
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

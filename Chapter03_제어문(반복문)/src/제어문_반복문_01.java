// 식별자 => 변수/상수/메소드/클래스/인터페이스

/*
 * 	<자바에서 제공하는 제어문>
 * 	------------------
 *  		1. 조건문 : 형식, 사용처 알기
 *  			- 선택문 : 값이 1개 
 *  				사용처 : 버튼클릭, 메뉴 선택, 키보드, 서버 프로그램 => Application
 *  				(형식)
 *  				switch(정수,문자,문자열)
 *  				{
 *  					case 값:
 *  						실행문장
 *  						break; => 실행문장 수행 후 종료
 *  						------	중복적으로 실행문장이 있는 경우에는 break 생략 가능
 *  					case 값 :
 *  					...
 *  					...
 *  					default : 값이 없는 경우 실행문장
 *  				}
 *  			
 *  			- 단일 조건문
 *  			 (형식)
 *  					if(조건문)	=> 조건(true/false)
 *  									---------------> 비교/논리/부정연산자 사용
 *  					{
 *  						조건이 true일 때 처리문장
 *  					} 
 *  				=> 사용처 : 웹(상세보기,로그인,아이디찾기)
 *  				=> 독립적 (if문마다 따로 수행)
 *  				=> 조건에 해당되는 모든 내용 출력
 *     			- 다중 조건문
 *     		 	(형식)
 *     					if(조건문)
 *     					{
 *     						조건이 true일 때 처리문장 => 문장 수행 후 종료
 *     						조건이 false일 때 다음 if 조건문 실행
 *     					}
 *     					else if(조건문)
 *     					{	
 *     						조건이 true일 때 처리문장 => 문장 수행 후 종료
 *     						조건이 false일 때 다음 if 조건문 실행
 *     					}
 *     					else if(조건문)
 *     					{	
 *     						조건이 true일 때 처리문장 => 문장 수행 후 종료
 *     						조건이 false일 때 다음 if 조건문 실행
 *     					}
 *     					else
 *     					{		
 *     						조건이 없는 경우 처리
 *     					}	
 *     			- 제어문/변수/연산자 => 자바스크립트, 오라클에서도 나옴
 *  			- 선택 조건문 : true와 false를 나눠서 처리 
 *  				(형식)
 *  					if(조건문)
 *  					{	
 *  						조건이 true일 때 ==> 로그인 시
 *  					}
 *  					else
 *  					{
 *  						조건이 false일 때 ==> 로그인이 안될 때
 *  					}
 *  
 *  		2.반복문
 *  		3.반복제어문
 */
public class 제어문_반복문_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("======== for ========");
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hello For문");
		}
		System.out.println("======== for ========");
		for(int i=0;i<10;i+=2)
		{
			System.out.println("Hello For문");
		}
		System.out.println("======== for ========");
						//증감식
		for(int i=10;i>=0;i--)
		{
			System.out.println("Hello For문");
		}
	}

}

/*
 * 		메소드 : 한개의 기능 수행하는 명령문의 집합
 * 				--------		----- 변수,제어문,연산자
 * 		1) 메소드 구조
 * 			[접근지정어][옵션] 리턴형 메소드명(매개변수목록) ==> 선언문
 * 			{
 * 				구현
 * 				...
 * 				...
 * 				...
 * 				return 값
 * 				=> void로 선언시에는 return을 생략할 수 있다
 * 								  ------------
 * 									없는게 아니라 컴파일러에 의해 자동추가된 것
 * 				=> return 문장은 메소드의 종료(반드시 필요)
 * 			}
 * 		
 * 			메소드 : 호출 => 메소드는 처음부터 끝까지 실행을 하고
 * 						   원래 호출한 위치로 넘어온다
 * 				   예)
 * 						void aaa()
 * 						{
 * 							1번 문장  --------- 2 => 7
 * `						2번 문장  --------- 3 => 8
 * 							3번 문장  --------- 4 => 9
 * 							return;  --------- 메소드 종료 => 호출 위치 돌아간다
 * 						}
 * 						void main()
 * 						{
 * 							4번 문장    --------- 1
 * 							aaa()
 * 							5번 문장 	   --------- 5	
 * 							6번 문장     --------- 6
 * 							aaa()
 * 							7번 문장 	    --------- 10
 * 						=> 반복적인 문자이 있는 경우 (반복 제거)
 * 						=> 기능별 분리하기 때문에 코드가 간결하다
 * 						   --------- 수정하기 편리하다, 에러처리 편리하다
 * 						=> 다른 클래스와 연결 시에 주로 사용
 * 						=> 객체 지향 : 변수/메소드
 * 						=> 클래스의 구성 : 변수/메소드
 * 						=> 메소드가 존재하면 좋은 점 : 분산이 가능 (여러명이 동시 개발이 가능)
 * 				 		
 * 		2) 리턴형 결정
 * 			사용자가 요청에 대한 결과값을 도출
 * 			=> 한개만 설정이 가능
 * 			  	: 여러개 => 묶어서 전송
 * 						  --------- 한개로 인식 (배열, 클래스)
 * 			예) 
 * 				=> 사용자 정의 데이터형
 * 				class Movie{
 * 					String title;
 * 					String director;
 * 					String actor;
 * 					double score;
 * 					int rank
 * 				}
 * 
 * 				= 결과값이 있는 경우 => 결과값 설정
 * 									= 기본형
 * 									= 배열
 * 				= 결과값이 없는 경우 (메소드 자체에서 처리) => void
 * 				  void => 결과를 메소드에서 출력
 * 				= 리턴형과 결과값은 가급적이면 동일
 * 				  *** 반드시 리턴형 >= 결과값 => 예측을 못할수도 있다
 * 											4.1... 3... (결과값이 4.1 이러다가 3이 나올수도 있는 경우)
 * 				  예) int 메소드명()
 * 					 ---- 리턴형(long,double,float)
 * 					 {
 * 						return 값;
 * 							  ----- 결과값
 * 					}
 * 					*** boolean / String => 대체할 수 없다
 * 				
 * 		3) 매개변수 : 사용자로부터 요청을 받은 값
 * 					---------------------
 * 					예)
 * 						로그인 요청 => ID,PWD		
 * 						아이디 찾기 => ID
 * 						우편번호 검색 => 동/읍/면
 * 						영화 검색 => 검색어
 * 					=> 여러개 사용가능
 * 					=> 가급적이면 매개변수는 적게 사용하는 것이 좋다
 * 								---------------
 * 								3개 정도... 3개 이상이면 배열/클래스로 하는게 좋다
 * 					=> 예측을 못하는 경우
 * 					   -------------- => 가변 매개변수 (...)
 * 		4) 메소드명
 * 			=> 식별자 이용 (변수명칭법과 동일)
 * 			   --------
 * 				1. 알파벳이나 한글로 시작한다
 * 				   ---- 운영체제에 영향이 없다 (윈도우,리눅스,맥)
 * 				   ---- 소프트위어 이식 (개발 => 윈도우->리눅스)
 * 				   => 알파벳은 대소문자 구분
 * 				2. 숫자 사용이 가능 (앞에 사용불가)
 * 				3. 특수문자 ( $ , _ )
 * 				4. 키워드 사용불가
 * 				   ----- 변수명, 메소드명, 클래스명은 키워드가 아님
 * 						빨간글씨면 사용불가
 * 				5. 공백이 없어야한다
 * 				6. 메소드명의 길이는 제한이 없다
 * 					=> 다만 적절한 크기로 설정하는게 좋다 (3~10자 정도)
 * 					=> 추가 (insert 보다는 board_insert, boardInsert가 좋음)
 * 				7. 약속사항
 * 					=> 소문자로 시작한다
 * 					=> 두 개 단어일 경우 => 두번째 단어의 첫자는 대문자
 * 					   --------------------------------------- 헝거리어식 표기법
 * 						(예) boardInsert..)
 * 			==> 위 사항들이 적용되는 것 : 변수/상수/메소드/클래스/인터페이스/열거형
 * 
 * 		5) 호출 => 실행과정
 * 		   -------------
 * 			int max(int a,int b)
 * 			{
 * 				return a>b?a:b
 * 			}
 * 			=> int max=max(10,20) => a=10, b=20
 * 				|   --- a>b?a:b
 *				|클수도 있다 (double,long...) 
 * 			void max(int a, int b)
 * 			{
 * 				System.out.println(a>b?a:b);
 * 			}
 * 		
 * 			=> max(10,20) =>  받아서 저장하는 값이 없다
 * 
 * 		6) 메소드 유형
 * 		   --------
 * 			리턴형		매개변수
 * 		   -------------------
 * 			  O			  O
 * 				=> String 
 * 				   String substring(int begin)
 * 				   String substring(int begin,int end)
 * 				   ----------------- 메소드명이 동일, 매개변수가 다르다
 * 									=> 다른 메소드로 인식 (이런걸 '오버로딩'이라함)
 * 			  O           X
 * 				=> Math
 * 				   double random() => 임의의 데이터 추출
 * 			 	   ------ 0.0~0.99
 * 		   ------------------------------
 * 			  X			  O
 * 				=> 출력 담당
 * 					void println(String s)
 * 			  X			  X  => 빈도수가 없다
 * 			----------------------------- void (INSERT,UPDATE,DELETE)
 * 			파일에 값 추가, 파일 값 삭제, 수정
 * 				void println() => 다음줄에 출력
 * 				-------------- 원형
 * 					= 사용자 정의
 * 					= 라이브러리 => 어떤 기능, 원형(리턴형, 매개변수)
 * 					  ------- 70% 차지 => CBD
 * 										 Component => 기능이 있는 클래스
 */

/*
 *		모든 프로그램
 *		 
 * 		입력: 사용자로부터 전송
 * 			 => Scanner, BufferedReader, Random
 * 						 --------------
 * 							예외처리 , io
 * 			 => 윈도우, 웹 => 입력창 => 버튼 / 엔터
 * 				--------
 * 				<input type=text>
 * 				<input type=password>
 * 				<input type=button>
 * 		처리(요청 처리) => 결과값, 결과값이 없는 경우
 * 						----   --------------
 * 						 |
 * 					   출력하는 메소드
 */

/*
 * 		1. 매개변수(x), 리턴형(x) => 자체 출력
 * 		==>  리턴형이 없는 경우가 많이 존재 => 전역변수
 * 		 
 */
public class 메소드_01_구구단 {
	///// 전역변수 사용하는 경우
//  static int a=10;
//	static void aaa()
//	{
//		int a=100;
//	}
//------------------------------------
	
//	static int aaa()
//	{
//		int a=100;
//		return a;
//	}
	
	///// 구구단 전체 (매개변수ㅇ, 리턴형x)
	static void gugudan()
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{
				//실제 출력위치
				System.out.printf("%2d*%2d=%2d\t",j,i,j*i);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=aaa(); // a변수는 사라진다
//		System.out.println("a="+a);
		gugudan();
	}

}

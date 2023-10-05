/*
 * 		*  프로그램의 유형
 * 			= 네트워크 : 게임, 화상채팅 ...
 * 			= 데이터베이스 : 웹 ***
 * 		1. 리턴형
 *    		= 요청 처리에 대한 결과값 전송
 *    					   ---------
 *    						= 한개 (기본형) => 정수, 실수, 문자, 논리
 *    						= 여러개 (배열, 클래스)
 *    									  ----- 상세보기, 목록 출력...
 *    		= 결과값이 없는 경우 : 추가, 수정, 삭제 ==> void
 *    						   ==> 출력
 *    		= 결과값이 있는 경우 : 목록, 상세보기, 검색 ...
 * 		2. 매개변수
 * 			= 사용자가 요청값을 받을 경우
 * 			= 여러개 사용가능 => 3개 이상이면 배열 / 클래스로 처리
 * 			= 가변 매개변수
 * 		3. 메소드명
 * 			= 식별자 => 문자갯수(제한X) : 10글자 이내 권장
 * 			= 두개의 단어가 있는 경우
 * 				userInput(), user_input()
 * 				aaa() => delete()
 * 		4. return문
 * 			=> 가급적이면 메소드 마지막에 설정
 * 			=> void면 생략가능
 * 		5. 형식
 * 			리턴형 메소드명(매개변수...)
 * 			----
 * 			{	
 * 				return 값;
 * 					   --- 리턴형과 데이터형이 일치해야한다
 * 			}
 * 		6. 메소드 유형
 * 			리턴형		매개변수
 *   	  o			  o
 *   	=> String substring(int begin) => 원형
 *   	   ------			---------
 *   	   String substring(int begin,int end) => 원형
 *   	  o 	      x	
 *   	=> String trim()
 *   	   ------
 *   	   double random()
 *   ------------------------------------------------------------출력 내용이 있는 경우
 *   	  x           o
 *   	=> void main(String[] arg)
 *   	   ---- 메소드 자체에서 처리
 *        x           x
 *        -------------------------------------------------------메소드 자체 처리(void)
 *       7. 사용 목적
 *       	= 다른 클래스와 연결을 할 때 많이 사용 (메세지) => 메소드 호출
 *       	= 재사용
 *       	= 반복 제거
 *       	= 수정이 편리하게
 *       	= 에러 처리가 쉽게
 *       --------------------------------------
 *       8. 메소드 형태
 *       	= static
 *       	= instance : 교재에 나옴
 *       	
 * 		
 */
public class 메소드정리 {
//	static void data(String s)
//	{
//		System.out.println(s);
//	}
//	static void data(String s,String s1)
//	{
//		System.out.println(s+" "+s1);
//	}
	static void data(String...s)
	{
		for(String ss:s)
		{
			System.out.println(ss);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//data("Java","oracle");
		data("aaa");
		data("aaa","bbb");
		data("aaa","bbb","ccc");
	}

}

/*
 * 
 * 		문자열 저장 => String => ""
 * 		한 개 저장
 * 		 String 변수명=""
 * 		여러개 저장
 * 		 String[] 배열명={"","","",""...};
 * 		 String[] 배열명=new String[5];
 * 		String은 클래스여서 메소드 (기능)를 가지고있음
 * 						------------
 * 	
 * 			1. 메소드명 확인 : 기능 확인
 * 			2. 결과값 확인
 * 			3. () => 매개변수 확인
 * 		=> length()
 * 			=> 원형 : int length() => 문자의 갯수
 * 					----- 리턴형 (외우기)
 * 					String s="Hello";
 * 					s.length() => Hello의 문자 갯수가 얼마인가?
 * 					----------리턴형 (외우기)
 * 					int len=s.length();
 * 		=> toUpperCase()
 * 			=> 원형 : String toUpperCase() : 대문자 변환
 * 					 ------리턴형 (외우기)
 * 					String s="Hello";
 * 					s.toUpperCase(): 대문자로 변환요청
 * 					----------------
 * 					String ss=s.toUpperCase()
 * 		=> toLowerCase()
 * 			=> 원형 : String toLowerCase() : 소문자 변환
 * 					 ------	리턴형 (외우기)
 *  	=> substring() : 문자를 자른다
 *  		=> 원형 : String substring(int begin)
 *  				--------		  ---------
 *  		    리턴형 : 요청처리결과	   매개변수:요청
 *  		예) 로그인 요청 => id,pwd=> 결과값 boolean
 *  			boolean isLogin(String id, String pwd)
 *  			=> String ss=s.substring(1)
 *  				 String substring(int begin,int end)
 *  	=> startsWith() : 시작문자열이 같은지 확인
 *  		=> 원형 : boolean startsWide(String msg)
 *  				=> if문에서 주로 처리
 *  					String s="Hello Java"
 *  					if(s.startsWith("H"))
 *  				=> 예) 서제스트 (자동완성기)
 *  					LIKE 'A%'
 *  	=> endsWith() : 끝나는 문자열이 같은지 확인
 *  		=> 원형 : boolean endsWith(String msg)
 *  				=> 예) 확장자 (jpg,png.gif...) => 갤러리 게시판
 *  					LIKE '%A'
 *  	=> contains() : 문자열 포함 여부 확인
 *  		=> 원형 : boolean contains(String msg)
 *  				=> 예) 검색 ****
 *  				LIKE '%A%'
 *  	=> trim() : 좌우공백제거
 *  		=> 원형 : String trim()
 *  				=> 예) 로그인 입력, 검색어 입력, 회원가입
 *  				=> 유효성 검사
 *  	=> equals() : 같은 문자인지 확인 (대소문작 구분)
 *  		=> 원형 : boolean equals(String msg)
 *  				=> 예) 로그인 (아이디, 비밀번호 같은지 확인)
 *  	=> replace() : 문자, 문자열 변경
 *  					오라클에서는 ||(문자열 결합), &(입력값 받는거)
 *  					=> 이미지(URL로 되어있슴)
 *  				=> 예) 데이터베이스		
 *			=> 원형 : String replace(char c, char c1)
 *									------	-------
 *									old 	new
 *					String replace(String s,string s1)
 *									-------	---------
 *									  old     new
 *		=> valueOf() : 모든 데이터형을 문자열로 변환
 *			=>	원형 : String valueOf(int a) => boolean b
 *			=> static  : 자동 메모리 할당
 *			   String.valueOf()
 *		=> toString() : 생략이 가능 => 객체의 주소값 출력
 *		=> indexOf() : 지정된 문자위치값 확인 ( 문자번호 0번부터)
 *			=> 원형 : int indexOf(char)
 *					 int indexOf(String s)
 *		=> lastIndexOf() : 지정된 문자 위치값 확인 ( 문자번호, length()-1)
 *			=> 원형 : int lastIndexOf(char)
 *					 int lastindexOf(String s)
 *		=> concat() : 문자열 결합 (+)
 *			=> 원형 : String concat(String s)
 *		=> split() : 특정문자를 중심으로 잘라서 배열에 저장
 *			=> 원형 : String[] split(String regex)
 *											----- 정규식
 *	 	=> replaceAll() : 문자열 변환
 *			=> 원형 : String replaseAll(String regex)
 *		
 *   
 */
import java.util.Scanner;
public class 문자열_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		문자열_01 a=new 문자열_01();
		//클래스 저장
		//System.out.println(a); //원래는 System.out.println(a.toString()); 너무 많이 써서 생략가능
		String[] names= {"홍길동","박문수", "심청이","이순신","강감찬"};
		//String은 문자저장이 제한이 없다
		/*	
		 * 		Stack						Heap
		 * 		names						  names[0]   names[1]  names[2]  names[3] names[4]
		 * 		---------					--------------------------------------------
		 * 		  100							"홍길동" | "박문수" | "심청이" | "이순신"  | "강감찬"
		 * 		---------					|---------------------------------------------
		 * 								메모리 주소값 (100)
		 * 		1. 선언
		 * 			데이터형[] 배열명
		 * 			데이터형 배열명[]
		 * 		2. 초기값
		 * 			데이터형[] 배열명={}
		 * 			데이터형[] 배열명=new 데이터형[갯수]
		 * 			배열명[0]=""
		 * 			for문
		 * 			난수 발생...
		 * 		3. 활용 / 변경, 출력
		 * 					  --- for-each
		 * 			배열명[0]=""=> 변경
		 */
		// 출력
		for(String name:names) // 실제 저장된 값을 가지고 온다
		{
			System.out.println(name);
		}// => 속도가 빠르다
		//인덱스를 이용해서 출력
		System.out.println("===============");
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		System.out.println("===============");
		Scanner scan=new Scanner(System.in);
		System.out.print("이름 입력:");
		String name=scan.next();
		int  index=0;
//		for(String n:names)
//		{
//			if(n.equals(names))
//			{
//				break;
//			}
//			index++;
//		}
		for(int i=0;i<names.length;i++)
		{
			if(names[i].equals(name))
			{
				index=i;
				break;
			}
		}
		System.out.println(name+"는(은) "+(index+1)+"번째 있습니다");
	}

}

/*
 * 	변수 / 연산자 / 제어문 => 프로그램은 이 세개를 가지고 만듦
 * 		-------------- 명령문
 *  => 묶어서 사용
 *  변수를 묶을 때 : 배열, 클래스 (클래스가 거의 핵심)
 *  명령문 : 관련된 명령이 있다
 *  	=> 입력 관련 / 출력 관련 / 요청 관련 => 메소드라 한다
 *  	=> 동작과 관련되어있어서 조립을 해야한다 ( 객체 지향 프로그램 )
 *   						----------- 이유 : 수정 / 추가를 쉽게 해주기 위해 => 유지보수가 편하다
 *   메소드는 한 개의 기능만 수행이 가능하게 만든다
 *   => 자바는 클래스 영역을 벗어날 수 없다 (클래스 종속) = 클래스 안에서만 작업을 해야한다는 말
 *   
 *   1. 메소드 구성요소
 *    	= 리턴형 : 사용자 요청에 대한 처리 결과값
 *    			  결과값은 반드시 1개만 사용가능
 *    					-----------
 *    						여러개인 경우 => 배열/클래스/컬렉션으로 묶는다
 *    			 => 예측해서 설정 (int인지 double인지...)
 *    	= 매개변수 : 사용자가 요청한 값
 *    				웹에서 마우스 클릭, 엔터, 버튼, 입력창
 *    					 ---------			  ----- 이런 경우가 가장 많음
 *    			   => 메소드는 사용자가 행위를 한 경우 => 메소드 호출
 *    			             ---------- 마우스, 키보드
 *    	= 메소드명 : 식별자 (변수랑 똑같이 적용됨)
 *    			   => 소문자로 시작한다 ...
 *    	= return문장 : 처리 결과값을 보내준다, 메소드의 종료를 의미
 *    	  ------ 맨 마지막에 사용하는 것이 아니라 중간에도 사용가능
 *    	 
 *    	 예)		     메소드()
 *    	 			 {	
 *    					if()
 *    					{
 *    						return;
 *    					}
 *    	 			 }
 *    
 *   2. 메소드 형식
 *   	-----------------------------------------------
 *   	[접근지정어][옵션] 리턴형 메소드명(매개변수...) => 선언부
 *   	{	
 *   		구현부
 *   		----- 변수 선언
 *   		----- 연산자
 *   		----- 제어문
 *   		----------------- 결과값 도출 : 파이썬(예측)
 *   		return 결과값;
 *    		=> 결과값이 없는 경우 = 자체처리 = void => return 생략가능
 *    											--------------
 *    											 모든 메소드는 return을 필요로 한다
 *    											 return이 없는 경우는 컴파일러가 자동으로 추가해준것. 없는게 아니다
 *   	}
 *   	=> return / import java.lang.* : 컴파일러가 자동으로 추가해주는 것.
 *   				------------------ String, Math, System 쓸 때 사용하는
 *   	   return을 생략할 때는 void일 경우에만 생략가능
 *   
 *   	   *** 모든 프로그램
 *   	   = 입력 => 변수에 대한 초기화
 *   	   = 처리부분 (요청) => CRUD 가장 많이 등장
 *   						 ---- 
 *   						 Create : 추가 => INSERT 
 *   						 Read : 읽기 (목록, 상세보기) => SELECT
 *   						 Update : 수정 => UPDATE
 *   						 Delete : 삭제 => DELETE
 *   	   = 출력 => 사용자가 볼 수 있게 만든다 => HTML,CSS
 *   	   = main() => 프로그램의 시작과 종료
 *   
 *   	-------------- 
 *   	[접근지정어]
 *   	public : 모든 클래스
 *   	protected : 상속받는 클래스, 같은 폴더 안에서
 *   	default : : 같은 폴더안에서만 가능
 *   	private : 자신의 클래스 안에서만 => 캡슐화 방식 (은닉화)
 *   	------------------------------------------------
 *   	[옵션]
 *   	static : 자동 메모리 저장 ==> new 를 안배워서 쓰는중. new 배우면 static은 잘 안나올거임
 *   	abstract : 추상메소드 ==> 선언만 해주는 ( 설계=>요구사항) 
 *   	final : 수정이 불가능 => 예) String, Math...
 *   	-------------------------------------------------
 *      리턴형으로 사용 => 기본형 (int,long,byte,char,double,boolean)
 *      ---- 1개만 사용가능	  ---                ------ -------- 가장 많이 나옴
 *      			=> 참조형 : 배열 / 클래스
 *      					String, int[] 가장 많이 나옴
 *      			=> 메소드 매개변수 전송법
 *      			   -----------------	
 *      			*** Call By Value / Call By Reference	
 *   	매개변수로 사용 => 기본형 : Call By Value
 *   	------      => 참조형 : Call By Reference
 *   여러개 사용가능            *** 매개변수가 3개 이상이면 배열, 클래스 사용함
 *   
 *   3. 메소드 유형
 *   	리턴형		매개변수
 *   	  o			  o
 *   	=> String substring(int begin) => 원형
 *   	   ------			---------
 *   	   String substring(int begin,int end) => 원형
 *   	  o 	      x	
 *   	=> String trim()
 *   	   ------
 *   	   double random()
 *   	  x           o
 *   	=> void main(String[] arg)
 *   	   ---- 메소드 자체에서 처리
 *        x           x
 *      => void println() => 다음줄 출력
 *      	
 *      	*** 한개의 클래스 안에서 메소드 명이 동일할 수 있다
 *      						 ------------
 *      						매개 변수의 갯수나 데이터형이 다르다
 *      						aaa(int a) => 저장할 때 aaa(int)로 저장됨
 *      						aaa(int a) aaa(int b) 둘은 같은 메소드
 *      						=> 변수명이 다르다고 다른 메소드가 되는거 아님. 데이터형이 달라야 다른 메소드로 인식
 *      						aaa(double d)
 *      						aaa(int a, int b) => 오버로딩
 *      						 => 중복 정의 메소드    -------
 *      											오버로딩 : plus(int,int), plus(char,char), plus(double,double)
 * 	  4. 메소드 호출
 * 		   --------
 * 			= 인스턴스 메소드 => new를 이용해서 메모리에 저장
 * 			Scanner scan=new Scanner(System.in)
 * 					---- 객체
 * 			scan.nextInt()
 * 			String s="";
 * 				   --- 객체
 * 			s.메소드
 * 			= 클래스 메소드 (static) => 공유 => 자동 저장 ex)로고
 * 			  Math.random
 * 
 * 			=> static
 * 			   클래스명.메소드명()
 * 			   ---------------
 * 				=> 같은 클래스 안에서는 클래스명 생략가능
 * 				   다른 클래스인 경우에는 클래스명. 찍어야함
 * 				호출하는 방법
 * 			=> aaa(int a,int b)
 * 				=> aaa(10,20) 호출할 경우에는 값을 채워서 호출해야함
 * 			=> int aaa()
 * 			   int a=aaa() 리턴형일 경우 데이터형을 일치시킨후 받아야함
 * 
 * 	  5. return 값 설정
 * 		 -------------
 * 				 int display()
 * 				{
 * 					return 10;
 * 				}
 * 		
 * 				 double dispaly()
 * 				{
 * 					return 10.5;
 * 				}
 * 				 String dispaly()
 * 				{
 * 					return "";
 * 				}
 * 				  void dispaly()
 * 				{
 * 					return; 생략가능
 * 				}  
 * 				 int[] dispaly()
 * 				{
 * 					int[] arr=new int[5];
 *    	 		    return arr;
 * 				}
 * 
 * 			==> ***중요내용 : 여러번 호출가능 (재사용)
 * 		
 * 		6. 메소드 사용 목적
 * 		   		= 반복되는 기능 제거
 * 				= 기능별로 분리를 해서 코드 관리가 쉽다
 * 				= 소스가 간결하다
 * 				= 재사용 (다른 클래스 연결)
 * 				-------------------------------	
 */
// 5개의 정수를 전송 => 정렬한다 int[]


import java.util.*;

public class 메소드_01_00 {
	//ASC
	static int[] sortasc(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
							
				}
			}
		}
		return arr;
	}
	
	//DESC
		static int[] sortdesc(int[] arr)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]<arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		 return arr;
		}
		
	
	static void sort_1(int[] arr,String type)
	{
		boolean bCheck=false;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(type.equals("ASC"))
				{
					bCheck=arr[i]>arr[j];
				}
				else
				{
					bCheck=arr[i]<arr[j];
				}
				if(bCheck)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
							
				}
			}
		}
	}
	
	// 조립
	static void process()
	{
		// 5개 정수 설정
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			 arr[i]=(int)(Math.random()*100)+1;
		}
		/*System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr));
		int[] result=sortasc(arr);
		System.out.println("정렬 후(ASC):");
		System.out.println(Arrays.toString(result));
		result=sortdesc(a);
		System.out.println("정렬 후(DESC):");
		System.out.println(Arrays.toString(result));*/
		/*int[] result=sort(arr,"ASC");
		System.out.println(Arrays.toString(result));
		int[] result=sort(arr,"DESC");
		System.out.println(Arrays.toString(result));
		*/
		// Call By Reference
		sort_1(arr,"ASC");
		System.out.println(Arrays.toString(arr));
		
		sort_1(arr,"AESC");
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메소드 조립한 거 호출
		process();
		
	}

}

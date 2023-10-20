package com.sist.exception;
/*
 * 
 		묶는 기술 => 객체지향 (누가 잘 묶어서 사용하느냐) => 재사용
 		
 		1. 변수 묶는 법
 			= 배열 : 같은 데이터형 (메모리 크기가 동일 => 연속적인 메모리 구조)
 			 		=> 인덱스 이용
 			 		
 			= 클래스 : 다른 데이터형 
 					=> 메모리 주소(.) 이용
 		2. 연산자/제어문
 			= 메소드 (명령문을 묶어서 사용)
 		--------------------------------- 한 개의 기능 => 제품 (컴포넌트)
 		==> 조립 : 한 개의 프로그램
 		==> 맛집 : 게시판, 회원, 맛집, 채팅, 예약, 추천, 결제 // 나눈 이유 : 재사용 위해
 			-----------------------------------
 			영화 : 게시판, 회원, 예약, 추천, 결제
 							 -------------- 수정 (오버라이딩)
 		--------------------------------------------------------------------
 		1. 가독성, 2. 최적화(속도가 빠르냐), 3. 견고성
 					=> Vue,React
 		1. 테스트 : 견고한 프로그램이냐 => 사전에 에러를 방지하는 프로그램
 									------- 예외처리
 			견고 => 프로그래머의 실수, 사용자 입력이 잘못된 경우	
 			------------------------------------------
 		2. 예외처리
 			=> 정의 : 사전에 에러 방지
 			=> 목적 : 비정상 종료를 방지하고 정상 종료를 할 수 있게 만든다
 			---
 			---
 			---
 			--- 에러 => 건너뛴다 => catch => 에러 수정을 위한 확인
 										  에러를 복구
 			---
 			---
 			---
 			
 			=> 예외처리
 				1) 에러 복구 => try~catch 
 				2) 에러 무시 => 에러 회피 => throws // 얘를 쓰면 건너뜀
 				3) 견고한 프로그램
 				   ----------- 일부러 에러 발생 (임의 발생) => throw
 				   => 매직 =>
 				4) 프로그램은 항상 .....
 				   모든 것을 지원하지 않는다
 				   => 때문에 사용자 정의 등장
 				   => 예약, 추천, 결제 ...
 				   => 사용자 정의 데이터형 Music,Movie...
 				   		=> 기존의 데이터형을 모아서 새로운 데이터형을 제작
 				   			=> class
 				   => 사용자 정의 메소드 => 사용자 정의 예외처리
 				   --------------------------------------------------
 				   결제모듈 ==> 보안처리 ==> 데이터베이스
 				   -------------------------------- 이런거 만드는 업체를 솔루션// 개발,SM / 영업 => 운영
 				   => 예외복구
 				   	  형식) 
 				   	  		try
 				   	  		{
 				   	  			=> 정상적으로 수행할 수 있는 명령문
 				   	  			=> 평상시 코딩
 				   	  			문장 1
 				   	  			문장 2
 				   	  			문장 3 
 				   	  			문장 4
 				   	  			문장 5
 				   	  		}catch(예외처리 클래스)
 				   	  		{
 				   	  			=> try 안에 있는 명령문에서 오류 발생시에 예외처리를 하거나 복구
 				   	  		} ==> 여러개 사용이 가능
 				   	  		finally ==> 생략가능 (필요한 경우에만 사용)
 				   	  		{
 				   	  			=> try, catch를 수행하든 관계없이 무조건 수행하는 문장
 				   	  			=> 1) 서버 닫기
 				   	  			   2) 오라클 닫기
 				   	  			   3) 파일 닫기
 				   	  		}
 				   	  		
 				   	  		예시)))
 				   	  		try
 				   	  		{
 				   	  			문장 1
 				   	  			문장 2
 				   	  			문장 3 
 				   	  			문장 4
 				   	  			문장 5
 				   	  		}catch
 				   	  		{
 				   	  		}
 				   	  		finally
 				   	  		{
 				   	  		}
 				   	  		오류 없고 정상작동 => try (문장 1~5) 수행 후 finally 수행
 				   	  		문장 3 에러 발생 시 ==> 문장 1~2만 수행, 문장 3~5 수행하지않고 catch로 이동
 				   	  		
 				   	  		실행)
 				   	  		문장 1
 				   	  		문장 2 => 에러 (비정상)
 				   	  		try
 				   	  		{
 				   	  			문장 3
 				   	  			문장 4
 				   	  			문장 5
 				   	  		}catch(예외처리클래스)
 				   	  		{
 				   	  			문장 6
 				   	  		}
 				   	  		finally
 				   	  		{
 				   	  		 	문장 7
 				   	  		}
 				   	  		문장 8 ==> 종료 // 얘가 나오면 정상종료, 안나오면 비정상종료
 				   	
 				   			- 정상 수행 시 : 문장 1=> 2 => 3 => 4 => 5 => 7 => 8
 				   				=> try가 정상이면 catch는 수행하지 않는다 
 				   				   if ~ else
 				   			- 문장 2 에러시 : 문장 1만 수행하고 종료
 				   			- 문장 4 에러시 : 문장 1 => 2 => 3 => 6 => 7 => 8
 				   			==> 에러가 나든 안나든 문장 7은 무조건 수행
 				   			
 				   		-----------------------------------------------------------------------------	
 				   			try
 				   			{
 				   			 	문장 1
 				   			 	문장 2
 				   			 	문장 3
 				   			}catch(A) ((마치 else if여서 하나만 수행))
 				   			{
 				   				A에 대한 에러 복구
 				   			}
 				   			catch(B) ((마치 else if여서 하나만 수행))
 				   			{
 				   				B에 대한 에러 복구
 				   			}
 				   			catch(C) ((마치 else if여서 하나만 수행))
 				   			{
 				   				C에 대한 에러 복구
 				   			}
 				   			finally
 				   			{
 				   			}
 				   			
 				   	  		- 정상수행하면 catch 절은 무시되는 것
 				   	  		- 문장 2에서 C에러 발생 => catch(A) 물어봄 => catch(B) 물어봄 => catch(C) 물어봄... => 맞는거 찾고 수행 => finally
 				   	  	
 				   	  	
 				   	  	
 				   	  		try
 				   			{
 				   			 	문장 1
 				   			 	문장 2
 				   			 	문장 3
 				   			 	 | int[] arr=new int[2];
 				   			 	   arr[2]=Integer.parseInt(" 10");
 				   			 	   		  ------------------------ 에러발생
 				   			
 				   			}catch(A) ((마치 else if여서 하나만 수행))
 				   			{
 				   				A에 대한 에러 복구
 				   			}
 				   			catch(B) ((마치 else if여서 하나만 수행))
 				   			{
 				   				B에 대한 에러 복구
 				   			}
 				   			catch(C) ((마치 else if여서 하나만 수행))
 				   			{
 				   				C에 대한 에러 복구
 				   			}
 				   			finally
 				   			{
 				   			}
 				   	
 				   									
 * 
 */
import java.io.*;
public class MainClass_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileReader fr=new FileReader("c:\\javaDev\\movie.txt"); //실행하자마자
		FileReader fr=null; // 반드시 초기값을 줘야함
		try
		{
			fr=new FileReader("c:\\javaDev\\movie.txt");
			//String data=""; // Ajax
			StringBuffer sb= new StringBuffer(); //	VueJS
			int i=0;
			while((i=fr.read())!=-1)
			{
				//data+=(char)i; // Ajax
				sb.append((char)i);//	VueJS
			}
			//System.out.println(data); // Ajax
			System.out.println(sb.toString());//	VueJS
		}catch(IOException e)
		{
			// 오류 발생 ==> 에러 확인
			/*
			 < 에러확인하는 방법 >
			 getMessage() => 에러 메세지만 확인 가능
			 printStackTrace() => 둘 중 이걸 권장 
			 	  ------------ 실행할 때 실행하는 순서를 보여줌. 중간에 멈춰있으면 그곳이 에러난곳 => 에러 위치 확인가능
			 */
			e.printStackTrace();
		}
		finally
		{
			//fr.close(); // 오류나는 코드
			try
			{
				fr.close();
			}catch(IOException e) {}
		}
	}
	

}

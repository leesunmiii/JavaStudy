package com.sist.exception;
// 다중 catch => 에러마다 따로 처리
/*
 *		에러코드 ==> 계층 구조 확인 ==> 크기(순서가 존재) 밑으로 갈수록 큰걸 적어여햠
 * 		==> 전체 코드가 에러나는 코드
 		try
 		{
 			문자열 => 정수로 변환 에러
 		}catch(Exception e)
 		{
 		}catch(NumberFormatException e)
 		{
 		}catch(NullPointerException e)
 		
 		==> 해결
 		try
 		{
 			문자열 => 정수로 변환 에러
 		}catch(NumberFormatException e)
 		{
 		}catch(NullPointerException e)
 		{
 		}catch(Exception e)
 		{
  		}
  		
  								throwable
  								---------
  									|
  				-----------------------------------------------
  				|											   |
  			  Error											Exception
  			  													|
  			  										--------------------------
  			  										|						  |
  			  									IOException					RuntimeException  // 좌우 순서는 상관x, 위아래는 순서 상관있음
  			  									SQLException				  |
  			  																NumberFormatException
  			  																...
 */
// 문자열을 입력 ==> 정수 변환 ==> 배열에 첨부 ==> 배열에 있는 값으로 나누기
import java.util.*;
public class MainClass_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		String s1=scan.next();
		// 웹상에서 문자나 숫자 입력은 <input type=text>
		System.out.print("정수 입력:");
		String s2=scan.next();
		
		try
		{
			int[] arr=new int[2];
			arr[0]=Integer.parseInt(s1); //271page
			arr[1]=Integer.parseInt(s2);
			
			int result=arr[0]/arr[1];
			System.out.println("result="+result);
			
		}
		//catch 절은 else if 같이 하나만 수행
		catch(NumberFormatException e) 
		{
			System.out.println("정수 변환을 할 수 없습니다");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열의 범위를 벗어났습니다");
		}catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없습니다");
		}catch(RuntimeException e)
		{
			System.out.println("실행시 에러...");
		}catch(Exception e)// 맨 밑에 가야함, 그 외의 자리면 오류 발생
		{
			System.out.println("기타 에러 발생...");
		}
		catch(Throwable e)
		{
			System.out.println("에러와 예외처리 잡는다");
		}
		System.out.println("프로그램 종료!!");
		// RuntimeException / Throwable
		// SQLException => Exception 위 아무곳에 가능,SQLException는 SQL과 관련된 문장이 들어와야 사용가능, 아니면 오류
		//IOException => 얘도 IO와 관련된 문장이 들어와야 사용가능, 아니면 오류
// 		----------------		
//		try
//		{
//			
//		}catch(Exception e)// 맨 밑에 가야함
//		{
//			System.out.println("기타 에러 발생...");
//		}
//		catch(NumberFormatException e)
//		{
//			System.out.println("정수 변환을 할 수 없습니다");
//		}catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("배열의 범위를 벗어났습니다");
//		}catch(ArithmeticException e)
//		{
//			System.out.println("0으로 나눌 수 없습니다");
//		}
	}

}

package com.sist.exception;
/*
 		throws => 라이브러리에서 제공 => 결정 (try~catch)
 		=> 복잡한 소스가 있는 경우 => 소스 추가를 할 때 : throws를 가끔 사용
 		=> 예외처리 클래스 굳이 다 외울 필요 X
 		=> 예외처리 클래스
 			Throwable / Exception
 			--------- 예외의 최상위 클래스
 			=> 모를 땐 자동완성기 (빨간밑줄 눌러서 나오는 해결방법) 사용
 		=> 예외처리 : 수정이 가능한 에러
 		 	=> 네트워크 : IP, Web Site
 		 	=> IO : 파일 경로명 / 파일명
 		 	=> SQL : 오라클 문장 (SELECT, INSERT, UPDATE, DELETE)
 		 		=> DML (데이터 조작)
 		 => throw
 		 	=> 임의로 발생 => 테스트 (견고한가 테스트하는)
 * 
 */
public class MainClass_03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10;
			if(a%2==0)
			{
				throw new Exception(a+"는 홀수가 아닙니다!!");
				// 밑에 소스 코딩을 할 수 없다...
				// throw => 사용자 정의 예외처리ㅣ
			}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}

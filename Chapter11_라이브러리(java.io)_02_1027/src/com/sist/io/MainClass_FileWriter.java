package com.sist.io;
/*
 		FileReader / FileWriter => 다른 언어를 사용할 수 있게
 								   ------- 한국어, 중국어, 일본어 (2byte)
 								   => 한글 깨짐 방지
 								   => 문자 스트림 (문자를 제어할 수 있는 데이터 통로)
 		FileInputStream / FileOutputStream
 		----------------------------------
 			=> 파일 입출력이 가능 (1byte) => 알파벳이나 숫자 (문제 없음), 영어 이외 다른 언어 (깨짐)
 		
 * 
 */
import java.io.*;
import java.util.*;
public class MainClass_FileWriter {
// 여러 문장을 저장
// => 1. append => new FileWriter("경로명",true) => 크롤링할 때 이런 방식 사용 // 이걸 주로 많이 사용
// => 2. 문자열을 결합 => 한번에 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw=null; // 초기화, 반드시 null 값 주기
		try
		{
			// 처리 기능 => 정상적으로 수행할 수 있는 문장
			fw=new FileWriter("c:\\java_data\\sawon.txt",true); // 끝에 true => append 모드 
			// 끝에 true 안주면 덮어씌워져서 기존의 데이터 지워짐
			// 경로 ~ 파일명까지 => 해당 파일이 없으면 => 자동으로 createNewFile() 호출됨
			Scanner scan=new Scanner(System.in);
			System.out.print("사번 입력: ");
			int sabun=scan.nextInt();
			System.out.print("이름 입력:");
			String name=scan.next();
			System.out.println("부서 입력:");
			String dept=scan.next();
			// 파일 단점 => 구분이 안된다
			
			String msg=sabun+"|"+name+"|"+dept+"\r\n";
			
			// 저장
			fw.write(msg);
			
			System.out.println("파일 저장 완료!!");
			
		}catch(Exception ex) 
		{
			// 에러가 있는 경우 => 복구 / 에러위치 확인 (O)
			ex.printStackTrace(); // 에러가 몇번째줄에 났나
		}
		finally
		{
			// 파일 => 리소스가 닫기
			// 서버 닫기
			// 오라클 닫기
			try
			{
				fw.close();
			}catch(Exception ex) {}
		}
	}

}

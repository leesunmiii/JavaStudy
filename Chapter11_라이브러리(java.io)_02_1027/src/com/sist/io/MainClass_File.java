package com.sist.io;
/*
 * 		데이터 저장	 ===== 		데이터 가공 	 	===== 			데이터 출력
 		변수 : 한 개				연산자							도스 출력
 		배열						제어문							윈도우 ***
 		클래스					----- 두 개 합친게 메소드			브라우저
 		----- 메모리
 		파일 ***
 		 => 업로드, 다운로드, Open API
 		오라클 (RDBMS)
 			=> JDBC = DBCP = ORM
 							  (라이브러리 : MyBatis, JPA)
 		----------------------------------------------------------------------
 		 사용자 정의 클래스
 		 + 라이브러리
 		 ----------------- 한 개의 프로그램 완성
 		 라이브러리
 		 	= java.lang => Object, String, Math, Wrapper
 		 				   ** StringBuffer
 		 	= java.util => Date, StringTokenizer
 		 				   List, Map, **Set, Calendar(보충, 한두번 나옴, 알고는 있기)
 		 	= java.io => File, FileInputStream / FileOutputStream
 		 				 FileReader / FileWriter
 		 				 => BufferedReader
 		 				 ** ObjectInputStream / ObjectOutputStream
 		 	= java.net => URL / URLEncorder / Socket
 		 	= java.sql => Connection / Statement / ResultSet
 		 	= java.text => DecimalFormat / SimpleDateFormat
 		---- 여기까지는 자바 ===> 2차 자바 : 브라우저 (Web)
 							  3차 자바 : Spring (여기가 핵심)
 	    -------------------------------------------------------------------------------
 	    1) IO
 	       Input/Output => 입출력
 	       ------------
 	        = 메모리
 	        = 피일
 	        = 네트워크
 	        -----------> 클래스가 동일
 	    입출력 방식
 	    --------
 	    
 	    메모리 (데이터 저장) ====== 		자바 응용 프로그램	 	===== 화면 출력 
 	    파일, 네트워크			|								 |
 	    				InputStream							OutputStream
 	    					|							 	 |
 	    				일반파일(.zip , .png)					Writer
 	    				=> 1byte씩 읽어온다 => 바이트스트림		 
 	    				문자저장(.txt , .dat)
 	    				=> 2byte씩 읽어온다 => 문자 스트림
 	    					** 영어 외의 다른 언어
 	    					=> 한 글자당 2 byte
 	    					Reader 
 	   	-----------------------------------------------------------------------------
 	   			 *** 스트림은 데이터 이동 통로
 	   			 	------- 읽기/쓰기 => 단방향 통신 (읽기면 읽기,쓰기면 쓰기)(읽으면서 쓰기 불가능하다는 뜻) => 두개 프로그램 동시에 수행 (쓰레드)
 	   			 			=> 네트워크
 	   			 			=> 웹에서는 이미 서버가 만들어져있다
 	   			 				=> 기능 추가 ( 톰캣 = 자바엔진 = 테스트서버 )
 	   			 				             --- 50명이 최대
 	   			 
 	   			 바이트 스트림 (1byte) => 업로드, 다운로드, 카페...
 	   			  InputStream			OuputStream
 	   			     |
 	   			  **FileInputStream		**FileOutputStream
 	   			  FileterInputStream	FilterOutputStream
 	   			   	 |
 	   			  **BufferInpitStream		**BufferedOutputStream
 	   			   => 메모리에 전제를 저장 (속도가 빠르다)
 	   			  **ObjectInputStream		**ObjectOutputStream
 	   			   	=> 객체 단위 저장(***)
 	   			 
 	   			 
 	   			 문자 스트림 (2byte) => 파일 제어(한글) => 파일 읽기/쓰기
 	   			  	Reader					Writer
 	   			  	  |					 	 |
 	   			  **FileReader			**FileWriter
 	   			      |						 |
 	   			 BufferedReader			BufferedWriter
 	   			 
 	   			 ***** 독립적인 클래스
 	   			 		File : file, directory => 포함
 	   			 		
 	   			 ***** 
 	   			 	바이트 스트림 (1byte씩 송수신) => 자료실 (업로드, 다운로드)
 	   			 			=> 갤러리게시판, 후기게시판, 후기게시판
 	   			 	문자 스트림 (2byte 송수신) => 한글파일 읽기/쓰기
 	   			 			** 한글은 1글자당 2byte => UTF-8 을 써야 한국어 가능
 	   			 			--------------------------------------------- Git 안어 통일
 	   			 	보조 스트림 :  읽는 속도, 쓰는 속도를 빨리하기 위해 미리 메모리에 올려 놓고 시작
 	   			 				String / StringBuffer
 	   			 			=> Buffered~
 	   			 			=> 전체를 메모리로 이동 => 메모리에 제어
 	   			 	파일
 	   			 		File => 정보
 	   			 		파일 읽기 : FileInputStream / FileReader
 	   			 			=> String은 저장이 불가능
 	   			 				=> byte[]로 변경해서 저장
 	   			 		파일 쓰기 : FileOutputStream / FileWtriter
 	   			 			=> String 자체를 저장
 	   			 	네트워크
 	   			 		=> OutputStream (1byte)
 	   			 		=> BufferedReader (2byte로 변환 후 수신)
 	   			 		
 	   			 ==> 메소드 : read(), write(), close()
 	   			 ==> IO는 반드시 예외처리한다 (체크 예외처리)
 	   			 
 	   			 *** File => 일반 클래스
 	   			 	 => 파일의 정보 읽기 => 생성자를 이용한다
 	   			 	 => file
 	   			 	 	new File("경로명\\파일명")
 	   			 	 => directory
 	   			 	 	new File("경로명")
 	   			 	 => 주요메소드
 	   			 	 	1) 파일 특성
 	   			 	 		= 읽기 전용 => boolean canRead()
 	   			 	 		= 쓰기 전용 => boolean canWrite()
 	   			 	 		= 숨김 파일 => boolean isHidden()
 	   			 	 	2) 파일 정보
 	   			 	 		= 파일명 : *** String getName()
 	   			 	 		= 경로명+파일명 : *** String getPath()
 	   			 	 		= 경로명 : String getParent()
 	   			 			= 파일 크기 : *** long length()
 	   			 			= 수정일 : long lastModified()
 	   			 		3) 파일 종류
 	   			 			= 파일 : boolean isFile()
 	   			 			= 폴더 : boolean isDirectory()
 	   			 		4) 파일, 디렉토리 만들기
 	   			 			= createNewFile() => 파일 만들 경우
 	   			 			= *** mkdir()
 	   			 		5) 삭제
 	   			 			= *** void delete() => 폴더 삭제 시에 파일이 존재하면 폴더 삭제 불가능
 	   			 			  rm 파일명, rm -rf
 	   			 			  => AWS (리눅스 = 명령어)
 	   			 		6) 존재여부 확인
 	   			 		  	= *** boolean exists()
 	   			 		7) 폴더에 있는 모든 파일 읽기
 	   			 			= *** File[] listFiles()
 	   			 		8) 파일 크기
 	   			 		   Byte => kiloByte => MegaByte
 	   			 		   		   --------    ---------|
 	   			 		   		   파일크기/1024 => (파일크기/1024)/1024
 	   			 			
 * 		
 */
// 폴더 전체 확인
import java.io.*;
public class MainClass_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			// directory 확인
			File dir=new File("c:\\javaDev");
			// window => \,        mac,linux => /
			// \는 반드시 \\를 사용한다
			// 파일 읽기할 때 가급적이면 절대경로를 이용한다
			// .(현재폴더) , ..(상위폴더) => cd => change directory
			// 폴더 안에 있는 폴더 / 파일 읽기
			File[] list=dir.listFiles();
			//출력
			for(File f:list) {
				//System.out.println(f.getName());
				if(f.isFile())
				{
					System.out.println(f.getName()+"(file)");
				}
				else
				{
					System.out.println(f.getName()+"(dir)");
				}
			}
			
		}catch(Exception ex) {}
	}

}

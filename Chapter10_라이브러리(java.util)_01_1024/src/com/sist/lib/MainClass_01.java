package com.sist.lib;
/*
 * 
 * 		1.	Java.util
 			=> 프로그램에서 많이 사용되는 유용한 클래스의 집합
 			=> 반드시 import를 사용한다
 			 	1) 날짜
 			 		Date / Calendar => Date에 없는 기능 확장 Calendar
 			 			   -------- 예약
 			 	2) 문자열 분해
 			 		StringTokenizer
 			 	3) 자료구조 : 메모리에서 데이터를 쉽게 관리할 수 있게 만든 클래스
 			 		------ 컬렉션 (*****)
 			 			   ----- 가변형 (크기를 결정하지 않는다)
 			 		표준화 (모든 개발자가 동일하게 사용한다)
 			 		=> CRUD => 읽기 / 쓰기 / 수정 / 삭제
 			 			Collection => interface
 			 			 	|
 			------------------------------------
 			|				|					|
 		  List			   Set					Map = 순서가 없다
 		  	|				|						= 키, 값으로 저장
 		  	|				|						= 데이터 중복 허용
 		  	|				|						= 키는 중복할 수 없다
 		  	|				= 순서를 가지고 있지않다		= 클래스 관리할 때 사용 (스프링,웹)
 		  	|				= 데이터 중복을 허용하지않는다
 		  = 데이터의 중복허용
 		  = 순서를 가지고있다 (인덱스를 이용)
 		  = 데이터베이스 사용시에 주로 사용 (***)	 			 	
 		  
 		  List
 		  ----
 		  	List를 구현한 클래스
 		  ----------------------------------------- Stack
 		  		|				|				|
 		  **ArrayList			Vector			LinkedList
 		  										|
 		  										Queue
 		  	ArrayList : 오라클에 있는 데이터를 저장해서 제어
 		  				---------------------------- 
 		  					브라우저로 전송
 		  					=> 데이터베이스 관련 => 실시간으로 읽어주는 비동기 방식
 		  	Vector : 동기 방식 => 네트워크 (사용자의 정보 저장할 때 => IP, PORT)
 		  		*** Vector의 단점을 보완한게 ArrayList (대부분 ArrayList를 많이 사용)
 		  	LinkedList : C호환 =>  수정, 삭제, 추가
 		  	
 		  	*** 메소드가 동일 => 하나의 메소드로 LinkeList나 Vector로 바꿀 수 있음
 		  										
 		  Set
 		  ----
 		  	Set을 구현하는 클래스
 		  ---------------------
 		  	|				|
 		  	**HashSet		TreeSet
 		  	
 		  Map
 		  ----
 		  	Map 구현하는 클래스
 		  	----------------
 		  	|				|
 		  	**HashMap			HashTable
 		 
 		 Random : 난수 발생
 		 
 		 
 		  	
 * 			
 */
import java.util.*;
public class MainClass_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List list=new ArrayList();
		//List list=new Vector();
		List list=new LinkedList();
		list.add("홍길동"); //add 값 추가
		list.add("심청이");
		list.add("박문수");
		
		for(Object name:list) //String이면 오류 ,add할 때가 Object여서
		{
			System.out.println(name);
		}
	}

}

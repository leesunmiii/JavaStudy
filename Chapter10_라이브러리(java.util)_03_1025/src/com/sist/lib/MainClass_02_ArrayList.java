package com.sist.lib;
/*
 		335apge => 자바의 컬렉션
 				   ---------- 자료구조 (데이터 관리)
 				   	=> 데이터를 모아서 관리하는 클래스의 집합
 				   	------------------- CRUD (데이터 추가, 수정, 삭제, 읽기)
 				   	=> 메모리에서 영구적으로 저장이 안됨
 				   	=> 영구적인 저장 장치 : 파일 / 오라클
 				   	
 		Collection => 인터페이스
 			|
 		------------------------------------
 		|                |                 |
 		List			Set				  Map => 인터페이스 (표준화가 되어있음)
 		
 		 
 		List : 순서를 가지고 있다 (인덱스 번호로 찾으면 된다) => 배열을 보완하는 클래스 (배열의 단점 : 고정적, 같은 데이터형만 모을 수 있다)
 														가변형 (저장 크기를 지정하지않는다)
 			   데이터의 중복을 허용한다
 			   = 구현하고 있는 클래스 : ArrayList, Vector, LinkedList
 		Set : 순서가 없다 
 			  데이터의 중복을 허용하지 않는다
 			  => HashSet, TreeSet
 		Map : 순서가 없다
 			  데이터 중복이 가능
 			  Key를 가지고 value를 찾는다 => 쌍으로 만들어진다
 			  key는 중독되면 안된다
 			  구현되는 클래스 : ***HashMap, Hashtable
 			  
 		335page
 			Collection : 데이터가 일정 공간에 모아서 관리할 목적
 			---------- => 웹에서 목록 출력 (모아서 => 브라우저)
 				1) 배열의 단점을 보완한 것 
 				   -------- (저장 크기를 결정) => 고정적이다
 					컬렉션은 크기 결정을 하지 않는다 (가변형)
 				2) 인터페이스를 이용한다 => 표준화 가능 (모든 개발자가 동일한 메소드를 이용)
 					=> 프레임워크 : Spring / MyBatis / JQuery / VueJS / ReactJS
 					    ------- 일정 기본 틀 => 쉽게 다른 개발자의 코딩을 분석
 					    		---------- 유지보수
 		
 		337page
 		상속되는 클래스
 		Collection
 			|
 		--------------------------------------------------
 		|					|					  		  |
 	  List				   Set					  		 Map
 	  	|                   |							  |
 	  	|				-----------				---------------------
 	  	|				|		   |			|					|
 	  	|			  HashSet	  TreeSet 		HashMap			Hashtable
 	  	|
 	  	|
 	  -------------------------------
 	  |				|				|
  ArrayList		  Vector        LinkedList
 		
 				   	
 		List :  가장 많이 사용되는 컬렉션
 		 		ArrayList : Vector를 보완 => 비동기 => 데이터베이스 연동
 		 		Vector : 동기적 (하나끝나면 저장하고 하나끝나면 저장하고), 사용되는 곳 : 네트워크에서 접속자 정보 저장
 		 		LinkedList : C언어 개발자 겨낭, C언어와 호환되게 함
 		-------------------------------------------------------------------------------------------------------
 		 컬렉션			읽기(접근시간) 		추가/삭제 									비고
 		--------------------------------------------------------------------------------------------------------
 		ArrayList		속도가 빠르다			속도가 느리다							순차적으로 추가/삭제 => 빠르다
 									   (인덱스 번호를 이용하기때문)					비효율적으로 메모리 사용
 										=> 웹에서는 자체에서 추가/삭제를 하지않음			   
 						   					웹은	오라클에서 추가/삭제해야함
 		--------------------------------------------------------------------------------------------------------
 		LinkedList		속도가 느리다			속도가 빠르다							데이터가 많을수록 접근성이 떨어진다
 					    => 윈도우를 이용한다면 여기가 더 빠름
 		--------------------------------------------------------------------------------------------------------
 		Set : 중복 데이터를 만들 때
 			  ----------------- HashSet
 			  검색 최적화 : TreeSet
 		Map : Hashtable의 단점을 보완한게 HashMap
 		 	  HashMap => 웹에서 가장 많이 사용
 		 	  			1) 관련된 클래스 관리 => 스프링, 마이바티스가 이용
 		 	  			2) 웹소켓 (웹 네트워크) => sessionId 
 		 	  			
 		List
 		----
 		1. ArrayList
 			= 장점
 			  배열 형식으로 만들어져있다 => 인덱스를 이용해서 처리
 			  						  접근속도가 빠르다
 			= 단점
 			  중간에 추가/삭제 => 속도가 저하
 			  
 			= 항상 인덱스 번호는 순차적으로 유지
 			  0 1 2 3 4 5
 			  => 3 삭제
 			  0 1 2 3 4 => 자동으로 처리
 			  0 1 2 3 4 5
 			  	   |
 			  	  추가
 			
 			= 사용처
 			  - 데이터의 양이 일관적이고 추가나 삭제가 없는 경우에 주로 사용
 			     예) 데이터베이스
 			  - 데이터의 접속 속도를 중요시할 때 (웹)
 			  
 			  
 			  ArrayList
 			  ---------------------------
 			   	10 20 30 40
 			  ---------------------------
 			     0  1  2  3    인덱스 번호를 이용해서 찾아온다
 			     
 			     
 			  LinkedLink   
 			  ---- ----  ---- ----
 			  10 -- 20 -- 30 -- 40
 			  ---- ----  ---- ----
 			  
 			  => 주요 메소드
 			   	 ---------
 			   	 1) 추가
 			   	 	add(데이터)
 			   	 	add(int index,데이터) => 속도가 느려진다
 			   	 2) 수정
 			   	 	set(int index,데이터)
 			   	 3) 삭제
 			   	 	remove(int index)
 			   	 *** 4) 읽기
 			   	 	 	get(int index)
 			   	 *** 5) 저장 갯수
 			   	 		size()
 			   	 6) 전체 지우기
 			   	 		clear()
 			   	 ------------
 * 
 */
import java.util.*;
public class MainClass_02_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList(); // Object
		// 가급적이면 같은 데이터를 첨부하는 것이 유리하다
		// 추가
		list.add("홍길동"); // 맨 처음 추가된게 0번 그 후부터 1,2,3...
		list.add("심청이"); // 1
		list.add("이순신"); // 2
		list.add("강감찬"); // 3
		list.add("춘향이"); // 4
		
		// 출력
		for(int i=0; i<list.size();i++)
		{
			Object name=list.get(i); // 데이터 읽기
			System.out.println(i+"."+name);
		}
		System.out.println("======= 추가 ========");
		
		// 추가
		list.add(2,"을지문덕");
		
		for(int i=0; i<list.size();i++)
		{
			Object name=list.get(i); // 데이터 읽기
			System.out.println(i+"."+name);
		}
		
		// 삭제 remove(int index)
		System.out.println("===== 삭제 ====");
		list.remove(3);
		
		for(int i=0; i<list.size();i++)
		{
			Object name=list.get(i); // 데이터 읽기
			System.out.println(i+"."+name);
		}
		
		// 수정 set(int index,데이터)
		System.out.println("===== 수정 =====");
		list.set(2, "박문수");
		for(int i=0; i<list.size();i++)
		{
			Object name=list.get(i); // 데이터 읽기
			System.out.println(i+"."+name);
		}
		System.out.println("======= 데이터의 갯수 ========");
		System.out.println("현재 인원:"+list.size());
		System.out.println("========= 전체 삭제 =========");
		
		// 전체 삭제
		list.clear();
		System.out.println("현재 인원:"+list.size());
		
		/*
		 		add() => 데이터 추가
		 		size() => 저장된 갯수
		 		get() => 읽기
		 		remove() => 삭제
		 		set() => 수정
		 		clear => 전체 데이터를 비우는 경우
		 * 
		 */
	}

}

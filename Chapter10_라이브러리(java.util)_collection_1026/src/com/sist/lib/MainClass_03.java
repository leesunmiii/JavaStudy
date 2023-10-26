package com.sist.lib;
/*
 * 
 * 				Set (인터페이스)
 * 		 		 |
 * 			-------------
 * 			|			|
 * 		HashSet		  TreeSet
 * 		-----------------------
 * 		특징) 
 * 			= 순서가 없다 (인덱스가 없다), 데이터 중복을 허용하지 않는다
 			= 장르별 분리, 부서별 분리할 때 사용
 			= 데이터베이스 : DISTINCT
 			= HashSet : 속도가 빠르다
 			= TreeSet : 정렬, 검색 속도
 		------------------------ List에 저장 후 중복 제거할 때 사용
 		
 			= 주요 메소드
 			  데이터 저장 : add(Object)
 			  삭제 : remove(Object)
 			  전체 삭제 : clear()
 			  데이터 한번에 모아서 관리 : iterator()
 			  TreeSet => 어라클에서는  LIKE, REGEXP_LIKE
 			  	= HeadSet
 			  	= tailSet
 * 			= 장바구니 => 같은 상품 구매할 때
 * 			  --------, 최신방문 할 때 사용
 * 
 */
import java.util.*;
public class MainClass_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		
		set.add("A");
		set.add("B");
		set.add("C");
		
		// 출력
		for(String s:set)
		{
			System.out.println(s+" ");
		}
	}

}

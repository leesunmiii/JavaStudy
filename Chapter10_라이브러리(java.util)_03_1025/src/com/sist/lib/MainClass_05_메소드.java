package com.sist.lib;
// => 메소드 (340page)
// => 검색 =>
import java.util.*;
public class MainClass_05_메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();  // 정수만 메모리에 저장해서 관리
		
		/*
		 	Wrapper => 기본형을 클래스형
		 				=> 기능을 부여
		 				=> 제네릭을 사용
		 				=> 장점은 Wrapper클래스와 기본형 호환
		 	Integer => 10,20,30...
		 	Integer i=10; ==> int로 받을 수 있다
		 */
		
		// 추가 => add
		//list.add(Integer.valueOf(10));
		list.add(10); // 0
		list.add(20); // 1
		list.add(30); // 2 
		// 60 ==> 3
		list.add(40); // 3 => 4
		list.add(50); // 4 => 5
		
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i); // 형변환이 필요없어졌다
			System.out.println(i+":"+val);
		}
		
		// 추가
		System.out.println("\n==== 추가 ======");
		list.add(3,60); // 가급적이면 사용하지 않는다
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i);
			System.out.println(i+":"+val);
		}
	
		
		// 삭제
		System.out.println("\n==== 삭제 ======");
		list.remove(3);
		for(int i=0;i<list.size();i++) // 가급적이면 이런 방법으로 출력하지말고 for-each 사용하기
		{
			int val=list.get(i);
			System.out.println(i+":"+val);
		}
		
		// 인덱스 번호는 0번 => size():갯수 i<list.size()
		// 인덱스를 초과하면 오류 발생
		
		// for-each
		System.out.println("\n==============");
		for(int i:list)
		{
			System.out.println(i);
		}
		System.out.println("\n======== 저장 갯수 확인 =========");
		System.out.println("데이터 저장갯수:"+list.size());
		System.out.println("데이터 존재여부:"+list.isEmpty()); // 데이터가 없냐? false
		// 라이브러리 => 메소드 isXxx() => boolean
		// SetXxx => void
		System.out.println("\n======== 삭제 =========");
		list.clear();
		System.out.println("저장갯수:"+list.size());
		System.out.println("데이터 존재여부:"+list.isEmpty()); // true
		
		/*
		 		setXxx
		 		getXxx
		 		isXxx
		 		remove
		 		delete
		 * 
		 */
		
	}

}

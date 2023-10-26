package com.sist.lib;

import java.util.*;

// 중복 데이터 제거
public class MainClass_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names={"홍길동","심정이","박문수","이순신","강감찬","춘향이","이산","홍길동","심청이","박문수"};
		// 배열을 컬력션으로 변경
		List<String> list=Arrays.asList(names);
		// 출력
		for(String name:list)
		{
			System.out.println(name);
		}
		// 중복 제거
		Set<String> set=new HashSet();
		set.addAll(list); // 데이터 값을 저장 addAll()
		// 중복된 데이터는 set에 저장되지않는다 => 중복제거
		System.out.println("=================");
		for(String name:set)
		{
			System.out.println(name);
		}
		System.out.println("=================");
		// list.clear();
		List<String> list2=new ArrayList<String>();
		list.addAll(set);
		for(String name:set)
		{
			System.out.println(name);
		}
		
	}

}

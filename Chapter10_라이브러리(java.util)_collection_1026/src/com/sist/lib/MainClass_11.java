package com.sist.lib;
import java.util.*;
public class MainClass_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 중복 숫자 없애기
		int[] arr= {10,20,30,50,40,70,80,60,10,20,40};
		Set<Integer> set=new HashSet<Integer>();
		for(int a:arr)
		{
			set.add(a);
		}
		System.out.println(set);
		
		//List<Integer> list=new ArrayList<Integer>(set);
		List<Integer> list=new ArrayList<Integer>();
		list.addAll(set);
	//	System.out.println(list);
		System.out.println("===== 정렬(ASC 올림차순) =====");
		Collections.sort(list); // 정렬은 list만 가능
		System.out.println(list);
		System.out.println("===== 정렬 (DESC 내림차순) =====");
		Collections.reverse(list);
		System.out.println(list);
		// ArrayList<?> list=new ArrayList<String>();
		// ArrayList list=new ArrayList();
		// ?는 와일드 카드 (모든 데이터형을 받는 경우)
		
	}

}

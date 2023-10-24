package com.sist.lib;
//Random

import java.util.*;
/*
 		Random => 임의의 수를 추출할 때 사용
 				  ------- 자바 가상 머신 (JVM)에서 추출
 				  => Math.random() => 리턴형이 double이라 형변환 해줘야함 
 				  					  그래서 보완해서 나온게 Random
 		=> int nextInt(int bound)
 					   ---------
 					   	100 ==> 0~99 +1
 				nextInt(100)+1
 		
 * 
 */
public class MainClass_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	A~Z 알파벳을 임의로 10개 추출
		Random r=new Random();
//		for(int i=1;i<=10;i++)
//		{
//			char c=(char)(r.nextInt(26)+65);
//			System.out.print(c+" ");
//		}
		
//	for(int i=1;i<=6;i++)
//	{
//		int lotto=r.nextInt(45)+1; // 1~45
//		System.out.print(lotto+" ");
//	}
		
		int day=r.nextInt(7)+7; // 1~13
		Set set=new HashSet();
		for(int i=1;i<=day;i++)
		{
			int rr=r.nextInt(31)+1;
			System.out.print(rr+" ");
			set.add(rr);
		
		}
		System.out.println("\n====== 최종 결과 ======");
		for(Object obj:set)
		{
			System.out.print(obj+" ");
		}
		
	}

}

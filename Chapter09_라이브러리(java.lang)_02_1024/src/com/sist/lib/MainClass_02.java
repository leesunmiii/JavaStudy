package com.sist.lib;
/*
 * 
 * 		Wrapper : 기본데이터형을 클래스화
 * 			=> 기본데이터형에 기능을 부여해서 쉽게 사용이 가능하게 만든 클래스
 			int ==> Integer
 			long ==> Long
 			double ==> Double
 			boolean ==> Boolean
 			---------------------- 웹에서 주로 사용
 			
 			=> 웹 / 윈도우 => 모든 데이터값 문자열
 							----------------
 							문자열을 정수, 실수, 논리형으로 바꾸는
 			=> Double.parseDouble("4.5") => 4.5
 			   Integer.parseInt("10") => int page=10
 			   Boolean.parseBoolean("true") => true
 			   		   --------------------
 			   		   HTML => checkbox
 			 => 제네릭 사용시 => 데이터형을 통일
 			 	----- 메소드 => 리턴형, 매개변수
 			 				   ------------- Object
 			 	<Integer> => <>안에는 클래스 형이 들어가야한다 <int> (X) <Integer> (O)
 			 	---------
 			 	배열 => 저장 (클래스) => Object
 			 	
 			 	class Box<T> ==> T(Object)
 			 	{
 			 		T t=new T();
 			 		void setT(T t)
 			 		T getT()
 			 		{
 			 			return T;
 			 		}
 			 	}
 			 	
 			 	Box<String>
 			 	-----------------------------------------------
 			 	*** 오토박싱 / 언박싱
 			 	Integer i=10; => int와 같이 사용가능
 			 	int j=1;
 			 
 * 			
 */
import java.util.*;
public class MainClass_02 {
	static void aaa(Integer i)
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List list=new ArrayList();
		// List<Integer>list=new ArrayList<Integer>;
		// List<MainClass_02>list=new ArrayList<MainClass_02>;
//		list.add("a"); //0
//		list.add(10.5); 
//		list.add(10);
//		list.add('A');
//		list.add(new MainClass_02());
//		list.add(10.5);
//		list.add(10);
//		list.add('A');
//		list.add(new MainClass_02());
//		list.add(10);
//		list.add('A');
//		list.add(new MainClass_02());
//		
// 		안에 들어간 내용이 규칙적으로 나와야 for문 사용가능
//		-----------------------------------------------------
		
//		Integer i=10; //오토박싱
//		int j=1; // 언박싱
//		int j=new Integer(100); //=> 되는데 사용하지말라고 빗금 그어져이ㅏㅆ는거
//		System.out.println(i);
		
		
	}

}

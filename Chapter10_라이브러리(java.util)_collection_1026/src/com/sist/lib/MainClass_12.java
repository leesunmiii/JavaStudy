package com.sist.lib;
import java.util.*;
public class MainClass_12 {
	// 제네릭에서 매개변수 설정 잘 기억하기
	public static void display1(ArrayList<Integer> list) {
		for(int i:list)
			System.out.print(i+" ");
	}
	public static void display2(ArrayList<Double> list) {
		for(double d:list)
			System.out.print(d+" ");
	}
	public static void display3(ArrayList<String> list) {
		for(String s:list)
			System.out.print(s+" ");
	}
	public static void display4(ArrayList<?> list) {
		for(Object o:list)
			System.out.print(o+" ");
	}
	// display(double d) ==> display(10)
	// ArrayList<String> list=new ArraList<String>();
	// display5(list) => Object
	public static void display5(ArrayList list) {
		for(Object o:list)
			System.out.print(o+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		//display3(list); => 불가능
		display1(list);
		display5(list);
		
		ArrayList<Double> list1=new ArrayList<Double>();
		//list1.add(10); =>  불가능
		list1.add(10.0);
		list1.add(20.0);
		list1.add(30.0);
		display2(list1);
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		display3(list2);
		
		
	}

}

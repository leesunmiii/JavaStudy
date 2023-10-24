package com.sist.lib;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 		StringTokenizer
 */
public class MainClass_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="red|green|blue|black|white|yellow|pink|cyan|magenta";
		StringTokenizer st=new StringTokenizer(data,"|");
		// st.nextToken() => 갯수를 벗어나면 오류 발생
		System.out.println("컬러 갯수:"+st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		String color1=st.nextToken();
		String color2=st.nextToken();
		String color3=st.nextToken();
		String color4=st.nextToken();
		String color5=st.nextToken();
		String color6=st.nextToken();
		String color7=st.nextToken();
		String color8=st.nextToken();
		String color9=st.nextToken();
		System.out.println(color1);
		System.out.println(color2);
		System.out.println(color3);
		System.out.println(color4);
		System.out.println(color5);
		System.out.println(color6);
		System.out.println(color7);
		System.out.println(color8);
		System.out.println(color9);
		/*
		 		hasMoreTokens
		 		1) cursor
		 		------------------------------------
		 			=> before First
		 		------------------------------------
		 		red => st.nextToken() => true // 다음줄에 데이터가 있다 =true /////next => 다음줄로 내려가 데이터를 가져오는
		 		------------------------------------
		 		blue => st.nextToken() => true
		 		------------------------------------
		 		green => st.nextToken() => true
		 		------------------------------------
		 		=> after Last => st.nextToken() =>  false
		 		------------------------------------
		 * 
		 */
	}

}

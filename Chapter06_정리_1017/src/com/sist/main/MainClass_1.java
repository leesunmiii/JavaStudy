package com.sist.main;
//=> 패키지 (관련된 클래스를 모아서 관리)
//다른 패키지인 경우 => import를 이용해서 클래스를 불러서 사용
/*
* 		import 패키지명.클래스명;
* 		import 패키지명.*;
* 		import static 패키지명.클래스명.메소드명
* 		import static 패키지명.클래스명.*
* 		
* =>사용자 저의 패키지도 import를 이용한다
*/
import static java.lang.Math.random;
//Math(메소드가 전부 static), String(valueOf())
import static java.lang.System.out;
import static java.lang.String.valueOf;
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(random()*100)+1;
		out.println(valueOf(a));
	}

}

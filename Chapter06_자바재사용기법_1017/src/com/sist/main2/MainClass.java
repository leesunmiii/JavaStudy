package com.sist.main2;
class Super // double
{
	
}
class Sub extends Super // int
{
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 묵시적 형변환 = 자동 형변환
		Super su=new Sub(); // 데이터형 (사용자)
		// double su=10
		
		//강제 형변환
		// Sub s=su;이 오류나니까
		Sub s=(Sub)su;
		// int a=10.5
		// int a=(int) 10.5
		
		String str="";
		StringBuffer sb=new StringBuffer();
		Object obj=new Object();
		
		// 객체 비교 => instanceof
		if(str instanceof Object) // str은 object한테 상속을 받았냐는말
				System.out.println("true");
		else
			System.out.println("false");
		
		if(sb instanceof Object) // sb은 object한테 상속을 받았냐는말 ,sb는 object 소속이냐는 말
			System.out.println("true");
		else
			System.out.println("false");
		if(obj instanceof String) // obj는 object한테 상속을 받았냐는말, obj은 String 소속이냐는 말
			System.out.println("true");
		else
			System.out.println("false");
//		if(sb instanceof String) // sb가 String한테 상속을 받았냐는 말. 둘은 상속 관계가 아니라 오류가 남
//			System.out.println("true");
//		else
//			System.out.println("false");
		
		
	}

}

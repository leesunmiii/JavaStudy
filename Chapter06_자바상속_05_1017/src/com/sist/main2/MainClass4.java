package com.sist.main2;
class Super{
	
}
class Sub extends Super{
	
}
public class MainClass4 {
	static String str;
// NullPointerException : 주소값이 없다
	// ClassCastException : 형변환이 잘못되었다는 오류코드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super ssss;// null 
		
		Super s=new Sub();
		//Sub ss=(sub)new Super(); // 오류나는 코드 
		Sub ss=(Sub)s;
		//char c=str.chatAt(0); NullPointerException : 값이 없는데 잘라서 c에 저장하라해서 오류
		//Super sss=new Super();
		//Sub ssss=(Sub)sss;
	}

}

package com.sist.lib;
import java.util.*;

// 332page => Date / Calendar
/*
 		날짜 관련 (시간 포함)
 		-----------------
 		Date => 기능이 없다 (단지 날짜만 저장할 목적으로, 날짜만 저장해주는 역할)
 												  ----------- 오라클 호환
 		Calendar : Date에 없는 기능을 보완함
 				   => 요일, 마지막 날짜 가져온다던가..
 				   => 예약 달력 만들기...
 				   => 월 저장, 		요일 저장 차이가 있음
 				     --- 0번부터		------	1번부터
 		Date : 일반 클래스
 				Date date=new Date()
 		Calendar : 추상 클래스
 				Calendar cal=Calendar.getInstance() //new를 사용하지않는거 기억!!!!!!!
 				=> getInstance(), newInstance()
 				  ------------------------------
 				  	=> 싱글턴(생성할 때마다 메모리 공간 하나만 사용해서 들어가는것)
 * 
 */
import java.util.*;
class A
{
	static A a; //static => 메모리 공간 하나만 쓰겠다
	public static A newInstance()
	{
		if(a==null)
		{
			a=new A();
		}
		return a;
	}
}
public class MainClass_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		===== 메모리 주소가 다르게 설정됨 =====
//		A aa=new A();
//		System.out.println("aa="+aa);
//		A bb=new A();
//		System.out.println("bb="+bb);
		
//		===== 메모리 주소가 같게 설정 =====
//		A aa=A.newInstance(); 
//		A bb=A.newInstance();
//		A cc=A.newInstance();
//		
//		System.out.println("aa="+aa);
//		System.out.println("bb="+bb);
//		System.out.println("cc="+cc);
		
//		=====					=====
		Scanner scan=new Scanner(System.in);
		System.out.print("년 월 일 입력(2023 10 24):"); // 공백으로 들어가면 한번에 받을 수 있다
		int year=scan.nextInt();
		int month=scan.nextInt();
		int day=scan.nextInt();
		
		Calendar cal=Calendar.getInstance();
		// 날짜 지정
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day);
		String[] strWeek= {"","일","월","화","수","목","금","토"}; // 맨앞이 공백인 이유 : 요일이 1번부터 시작, 우리는 0번부터 시작해서
		int week=cal.get(Calendar.DAY_OF_WEEK);
		int lastday=cal.getActualMaximum(Calendar.DATE);
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "+strWeek[week]+"요일입니다");
		System.out.println(month+"월의 마지막 날은 "+lastday+"일 입니다");
	}

}

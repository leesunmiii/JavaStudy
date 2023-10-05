/*
 *  년도 입력 받아서 => 윤년 여부 확인
 *  1. 입력 or 초기화 => 회원가입에 필요한 데이터 입력
 *  				   로그인 (ID,PWD)
 *  2. 윤년 확인 => 오라클 연결해서 데이터 추가
 *  		   => 로그인 여부 확인
 *  3. 결과값 출력 => 로그인 이동
 *  			=> 로그인 : 메인이동
 *  			=> 로그인이 안되면 : 다시 입력 요청
 *  	브라우저 ==> 자바 ==> 오라클
 *  	------------------------  이렇게 연결하는건 라이브러리 되어있음
 */
import java.util.Scanner;
public class 메소드_03 {
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		return year;
	}
	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=100) || (year%400==0))
			bCheck=true;
		return bCheck;
	}
	static void print(boolean bCheck)
	{
		if(bCheck)
			System.out.println("윤년입니다");
		else
			System.out.println("윤년이 아닙니다");
	}
	static void process()
	{
//		int year=userInput();
//		boolean bCheck=isYear(year);
//		print(bCheck);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		// 	입력하는 메소드
//		Scanner scan=new Scanner(System.in);
//		System.out.print("년도 입력:");
//		int year=scan.nextInt();
//		//	처리
//		boolean bCheck=false;
//		if((year%4==0 && year%100!=100) || (year%400==0))
//			bCheck=true;
//		//	처리 결과 출력
//		if(bCheck)
//			System.out.println("윤년입니다");
//		else
//			System.out.println("윤년이 아닙니다");
		
	}

}

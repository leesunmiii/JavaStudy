/*
 * 		리턴형 (처리 결과값 => 반드시 한개만 사용가능) => 여러개일 때 배열 이용
 * 			 --------------------------------
 * 		1) 로그인 요청
 * 		   ---------
 * 		   boolean => 경우의 수 2개
 * 		   경우의 수가 3개인 경우
 * 		   -------------------  id,pwd,login => String,int
 * 		2) 기본형 => int, long, double
 * 		3) 영화 정보 요청 : class
 * 		4) 정렬 => 10 40 50 20 30 => 배열 
 * 		-----------------------------------
 * 		경우의 수를 잘 따져야함, 경우의 수에 따라 데이터가 달라지기 때문
 * 		
 * 		예) 정수 => 사칙연산
 * 			+  int plus(int,int)
 * 			-  int minus(int,int)
 * 			*  int gop(int,int)
 * 			/  (String) div(int,int) //나누기는 결과값이 두가지 경우가 있음. 0으로 나누었을 때 문제가 생김 (문자열을 내보내야함)
 * 		
 */
// 1. 기능별로 나눠서 처리 (한가지 기능만 수행)
/*
 * 		예)
 * 			사람 <==> 자판기
 * 			--- 행위자(액터) => 유스케이스 다이어그램
 */
// 2. 반복이 있는 경우
// 3. 다른 클래스와 연결 ******
// 사칙연산
import java.util.Scanner;
// 1. 정수 한 개 입력 받아서 (2~9) => 구구단 출력
public class 메소드_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 절차적 언어 => 재사용을 할 수 없다
		Scanner scan=new Scanner(System.in);
		System.out.println("단 입력 (2~9):");
		// print() => 사용자가 요청한 메세지를 출력
		int dan=scan.nextInt();
		// nextInt() => 키보드로 정수값 입력시 => 읽어서 => 메모리
		// 구구단 출력
		for(int i=1;i<=9;i++)
		{
			System.out.println(dan+"*"+i+"="+i*dan);
		}
		
	}

}

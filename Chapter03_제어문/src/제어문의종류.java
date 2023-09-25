/*
 * 
 * 	단일 조건문 : 조건식 (비교,논리,부정)
 * 1. 정수 한 개를 입력받아서 짝수/홀수
 */
import java.util.Scanner;
public class 제어문의종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner는 클래스=> 키보드로 입력해서 저장 = 엔터 메모리에 저장
		/*
		 * 
		 *  기능(메소드)
		 *  정수 : nextInt
		 *  문자열 : next()
		 *  실수 : nextDouble()
		 *  논리 : nextBoolean()
		 *  문자 : System.in => 정수로 들어와서 형변환을 시켜야함
		 *  웹/윈도우 (char(X)) 
		 */
		// Scanner 클래스 저장 => 클래스를 저장 (new: 메모리 크기를 만들어주는 것)
		// 동적바인딩
		
		Scanner scan=new Scanner(System.in);
		// System.in / System.out => 자바 표준 입출력
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		//가공
		if(num%2==0)
		{
			System.out.println(num+"는(은) 짝수입니다");
		}
		if(num%2!=0) // num%2==1   !(num%2==0)
		{
			System.out.println(num+"는(은) 홀수입니다");
		}
	}

}

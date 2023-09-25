/*
 * 사칙연산
 * 정수 2개 => 연산자(문자열)
 * 정수 3개 => 1개 결과값
 */
import java.util.Scanner;
public class 선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		int result=0;
		Scanner scan=new Scanner(System.in);
		//초기화
		System.out.println("첫번째 정수 입력:");
		num1=scan.nextInt();
		
		System.out.println("두번째 정수 입력:");
		num2=scan.nextInt();
		
		System.out.println("연산자 입력 (=,-,*,/):");
		switch(scan.next())
		{
		case "+":
			result=num1+num2;
			//break;
		case "-":
			result=num1-num2;
			//break;
		case "*":
			result=num1*num2;
			//break;
		case "/":
			result=num1/num2;
			//break;
		default:
			System.out.println("잘못된 접근입니다ㅡ,.ㅡ");
		}
		System.out.println("계산 결과값 : "+result);
	}

}

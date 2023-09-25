import java.util.Scanner;
/*
 * 
 * 	형식)
 * 		if(조건문)
 * 		{
 * 			실행문장 => 조건문이 true일때만 수행이 가능
 * 		}
 * 		=> 조건문 : 반드시 결과값이 (true/false) 이어야함
 * 						------------
 * 						비교연산자 / 논리연산자 / 부정연산자
 * 		두 개의 정수를 받고, 연산자 +,-,*,/
 * 		=> 간단한 계산기 만들기
 */
public class 단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num1;
		int num2;
		char op;
		
		System.out.print("첫번째 정수 입력:");
		int num11=scan.nextInt();
				
		System.out.print("두번째 정수 입력:");
		int num21=scan.nextInt();
				
		System.out.print("연산자 입력(+,-,*,/):");
		op=scan.next().charAt(0);
		
		if(op=='+')
			System.out.println(num11+"+"+num21+"="+(num11+num21));
		if(op=='-')
			System.out.println(num11+"-"+num21+"="+(num11-num21));
		if(op=='*')
			System.out.println(num11+"*"+num21+"="+(num11*num21));
		if(op=='/')
		{
		//중첩 조건문
		if(num21==0)
			{
			System.out.println("0으로 나눌 수 없습니다");
			}
			
		if(num21!=0)
			{
			System.out.println(num11+"/"+num21+"="+(num11/num21));
			}
		}
	if(!(op=='+'||op=='-'||op=='*'||op=='/'))System.out.println("잘못된 연산자 입니다");
	}
}



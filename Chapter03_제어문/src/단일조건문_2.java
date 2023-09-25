/*
 * 정수 입력을 1개를 받는다
 * >> 11
 * 같은 숫자입니다
 * >>88
 * >>77
 */
import java.util.Scanner;
public class 단일조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//System.out.println(">>");
		System.out.println("1~99 사이의 수 입력:");
		int num1=scan.nextInt();
		
		
		//if(num1%11==0)
	//	{
		//	System.out.println(num1+"은(는) 같은 숫자입니다.");
		//}
		//if(num1%11!=0)
		//{
		//	System.out.println(num1+"은(는) 다른 숫자입니다.");
		//}
		
		
		if(num1>=0 && num1<100)
		{
			int a=num1/10;
			int b=num1%10;
			if(a==b)
			{
			System.out.println("은(는) 같은 숫자입니다.");
			}
			if(a!=b)
			{
				System.out.println(num1+"은(는) 다른 숫자입니다.");
			}
		}
		if(num1<1 || num1>99)
		{
			System.out.println("잘못된 입력값입니다.");
		}
		
	}

}

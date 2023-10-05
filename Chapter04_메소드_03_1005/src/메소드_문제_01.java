// 정수 한 개를 입력받아서 짝수냐 홀수냐
// 메소드 3개
import java.util.*;
public class 메소드_문제_01 {
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int num=scan.nextInt();
		return num;
	}
	static String check (int num)
	{
		String res=" ";
//		if(num%2==0)
//			res=num+"은(는) 짝수입니다";
//		else
//			res=num+"은(는) 홀수입니다";
		//return res;
		return num%2==0?num+"은(는) 짝수입니다":num+"은(는) 홀수입니다";
	}

	static void print(String res)
	{
		System.out.println(res);
	}
	static void process()
	{
		int num=userInput();
		String res=check(num);
		print(res);
//		print(check(userInput()));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
		// 내가 쓴 답
//		Scanner scan=new Scanner(System.in);
//		System.out.println("정수 입력:");
//		int num=scan.nextInt();
//		if(a%2==0)
//			System.out.println(a+"는(은) 짝수입니다");
//		else if(a%2!=0)
//			System.out.println(a+"는(은) 홀수입니다");
		
		//선생님 답
//		Scanner scan=new Scanner(System.in);
//		System.out.println("정수 입력:");
//		int num=scan.nextInt();
//		String res="";
//		if(num%2==0)
//			res=num+"는(은) 짝수입니다.";
//		else 
//			res=num+"는(은) 홀수입니다.";
	}

}

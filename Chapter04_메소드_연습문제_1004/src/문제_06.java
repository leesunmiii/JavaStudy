// 두 정수를 나눗셈 결과를 구해주는 메소드 구현
// 리턴형 / 매개변수 (2)
import java.util.Scanner;
public class 문제_06 {
	static String div(int a, int b)
	{
		String result="";
		if(b==0)
			result="0으로 나눌 수 없습니다!!";
		else
			result=a+"/"+b+"="+(a/b);
		return result;
	}
//	static int nanugi(int a,int b)
//	{
//		if(b==0)
//			System.out.println("0으로 나눌 수 없습니다");
//		else
//			return a/b;
//	}
//	static 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int c=nanugi(10,2);
//		System.out.println(c);
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력:");
		int a=scan.nextInt();
		System.out.println("두번째 정수 입력:");
		int b=scan.nextInt();
		
		String res=div(a,b);
		System.out.println(res);
	}

}

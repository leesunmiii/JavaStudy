// 문자열 입력을 받아서 a,A가 몇개인지 확인
import java.util.Scanner;
public class 문자열_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열 입력:");
		String data=scan.next();
		
		int count=0;  // A||a 
		//charAt => 문자를 한개씩 자르는 경우
		// "Hello" 01234 ==> charSt(5) =>오류
		for(int i=0;i<data.length();i++)
		{
			char c=data.charAt(i);
			if(c=='a'||c=='A')
				count++;
			
		}
		System.out.println("a|A의 갯수는 "+count+"개입니다");
	}

}

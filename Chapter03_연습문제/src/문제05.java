//사용자로부터 정수를 입력받아서 양수인지 음수인지 확인하는 프로그램 작성

import java.util.Scanner;

public class 문제05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int a=scan.nextInt();
		
		if(a>0)
		{
			System.out.println(a+"는(은) 양수입니다.");
		}
		if(a<0)
		{
			System.out.println(a+"는(은) 음수입니다.");
		}
	}

}

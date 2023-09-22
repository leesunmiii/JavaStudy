import java.util.Scanner;
public class 변수의초기화 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=100;
		 * int b=(int)(Math.random()*100)+1;
		 * // 0.0 and less than 1.0.
		 * Scanner scan=new Scanner(System.in);
		 * //                       키보드 입력값
		 * System.out.println("정수 입력:");
		 * int c=scan.nextint();
		 * System.out.println(c);
		 */
		
		int a=10;
		int b=20;
		
		//a=20, b=10
		int temp=a;
		a=b; //a=20
		b=temp; //b=20
		
		//temp 사용 후에는 a=20, b=10
		System.out.println(a);
	}
}



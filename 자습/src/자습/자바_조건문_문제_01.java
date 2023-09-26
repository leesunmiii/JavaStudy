package 자습;
import java.util.Scanner;
public class 자바_조건문_문제_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int a=scan.nextInt();
		
		if(a>=50)
		{
			System.out.println(a+"는(은) 50이상의 수이다.");
		}
		else
		{
			System.out.println(a+"는(은) 50미만의 수이다.");
		}
	}

}

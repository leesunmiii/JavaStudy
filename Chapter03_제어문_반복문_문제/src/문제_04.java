import java.util.Scanner;

public class 문제_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int a=scan.nextInt();
		for(int i=0;i<=a;i++)
		{
			sum+=i;
		}
		System.out.println("1~"+a+"까지의 합:"+sum);
	}

}

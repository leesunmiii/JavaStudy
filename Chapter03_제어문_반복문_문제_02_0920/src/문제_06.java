import java.util.Scanner;
public class 문제_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("정수 입력 (시작):");
		int a=scan.nextInt();
		
		System.out.println("정수 입력 (끝):");
		int b=scan.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			a*=i;
		}
		System.out.println(a);
	}

}

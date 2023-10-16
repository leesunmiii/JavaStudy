import java.util.Scanner;
public class 문제_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("======5개 정수를 입력 받은 후 차례로 출력하는 프로그램");
		int[] a=new int[5];
		for(int i=1;i<a.length;i++)
		{
			System.out.print("정수 입력:");
			a[i]=scan.nextInt();
			
		}
		for(int c:a)
		{
			System.out.print(c+" ");
		}
		
		
		//==========================================================================================
		System.out.println("\n========문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램");
		//int[]
		
		//System.out.println("정수 10개를 입력받은 후 세번째, 다섯번째, 마지막으로 입력받은 정수를 차례로 출력하는 프로그램");
	}

}

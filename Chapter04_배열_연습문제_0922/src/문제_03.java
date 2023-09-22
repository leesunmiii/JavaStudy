import java.util.Scanner;
public class 문제_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		
		int[] a=new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.println("정수입력:");
			a[i]=scan.nextInt();
			if(a[i]%3==0)
				{
					System.out.println("3의 배수:"+a[i]);
				}
		}
		
	}

}

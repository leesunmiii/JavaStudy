// 사용자가 정수 1개 입력 => 입력받은 숫자까지의 합을 출력
// 10 => 1~10
import java.util.Scanner;
public class 제어문_반복문_10_입력받은값까지합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int input=scan.nextInt();
		
		int sum=0;
		for(int i=1;i<=input;i++)
		{
			sum+=i;
		}
		System.out.println("1~"+input+"까지의 합:"+sum);
	}

}

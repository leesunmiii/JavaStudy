// 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
import java.util.Scanner;
public class 문제02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 한 개 입력 :");
		int a=scan.nextInt();
		if(a%3==0)
			System.out.println(a+"은(는) 3의 배수입니다.");
		if(a%3!=0)
			System.out.println(a+"은(는) 3의 배수가 아닙니다.");
	}

}

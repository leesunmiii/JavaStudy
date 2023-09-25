/*
 * 
 * 	사용자로부터 세 개의 정수를 입력 받아, 그 수들의 최대값과 최소값, 합계와 평균을 구해보자.
 */
import java.util.Scanner;
public class 문제04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("세 개의 정수 입력:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		int MAX=a;
		if(MAX<b)
			MAX=b;
		if(MAX<c)
			MAX=c;
		
		System.out.println("최대값: "+ MAX);
		
		int MIN=a;
		if(MIN>b)
			MIN=b;
		if(MIN>c)
			MIN=c;
		System.out.println("최소값: "+ MIN);
		
		int total=a+b+c;
		double avg=total/3.0;
		System.out.println("합계:"+ total);
		System.out.printf("평균:%.2f",avg);
			
		
	}

}

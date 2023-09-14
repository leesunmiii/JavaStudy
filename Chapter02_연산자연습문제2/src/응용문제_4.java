/*
 *  ==> 윤년여부
 *  4년마다/ 100년마다 제외/400년마다
 */
import java.util.Scanner;
public class 응용문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		int year=scan.nextInt();
		System.out.println(
				(year%4==0 && year%100!=0 || year%400==0?"윤년":"윤년아님"));
		
		
	}

}

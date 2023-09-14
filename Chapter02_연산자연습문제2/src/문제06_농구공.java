/*
 * 
 * 
 */

import java.util.Scanner;

public class 문제06_농구공 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("농구공 갯수:");
		int ball = scan.nextInt();
		
		//System.out.println("필요한 상자의 수:"+(ball%5==0?ball/5:ball/5+1));
		System.out.println("필요한 박스 :"+(int)(Math.ceil(ball/5.0)));
		                                      //   ------------------- 반올림해주는
	}

}

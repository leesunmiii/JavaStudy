import java.util.Scanner;
public class 문제_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int score=scan.nextInt();
		
		if(90<=score && 100>=score)
			System.out.println("A학점입니다");
		else if(80<=score && 90>score)
			System.out.println("B학점입니다");
		else if(70<=score && 80>score)
			System.out.println("C학점입니다");
		else if(60<=score && 70>score)
			System.out.println("D학점입니다");
		else
			System.out.println("F학점입니다");
		
	}

}

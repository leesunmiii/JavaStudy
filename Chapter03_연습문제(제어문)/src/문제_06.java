import java.util.Scanner;
public class 문제_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int score=scan.nextInt();
		if(90<=score && 100>=score)
			score=1;
		else if(80<=score && 90>score)
			score=2;
		else if(70<=score && 80>score)
			score=3;
		else if(60<=score && 70>score)
			score=4;
		
		
		switch(score)
		{
		case 1:
			System.out.println("A학점입니다");
			break;
		case 2:
			System.out.println("B학점입니다");
			break;
		case 3:
			System.out.println("C학점입니다");
			break;
		case 4:
			System.out.println("D학점입니다");
			break;
		default :
			System.out.println("F학점입니다");
		}
	}

}

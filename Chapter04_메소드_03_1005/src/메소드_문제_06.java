// => updown 게임
import java.util.*;
public class 메소드_문제_06 {
	static int comInput()
	{
		int com=(int)(Math.random()*100)+1;
		return com;
	}
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int user=scan.nextInt();
		return user;
	}
	static String check(int com, int user)
	{
		String res="";
		 if(com>user)
		 {
			res="입력된 값보다 큰 수를 입력하세요";
		 }
		 else if(com<user)
		 {
			res="입력된 값보다 작은 수를 입력하세요";
		 }
		 else
		 {
			res="Game Over!!";
		 }
		
		return res;
	}
	static void process()
	{
		int com=comInput();
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			int user=userInput();
			String h=check(com,user);
			System.out.println(h);
			if(h.contains("Game"))
			{
				System.out.print("게임을 다시 할까요?(y|n):");
				char c=scan.next().charAt(0);
				if(c=='y' || c=='Y')
				{
					System.out.println("새로운 게임을 시작합니다");
					process();
				}
				else
				{
					System.out.println("게임을 종료합니다");
					System.exit(0);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		// 컴퓨터가 숫자 추출
//		int com=(int)(Math.random()*100)+1;
//		Scanner scan=new Scanner(System.in);
//		while(true)
//		{
//			System.out.println("정수 입력(1~100):");
//			int user=scan.nextInt();
//			if(com>user)
//			{
//				System.out.println("입력된 값보다 큰 수를 입력하세요");
//			}
//			else if(com<user)
//			{
//				System.out.println("입력된 값보다 작은 수를 입력하세요");
//			}
//			else
//			{
//				System.out.println("Game Over!!");
//				break;
//			}
//			
//		}
	}

}

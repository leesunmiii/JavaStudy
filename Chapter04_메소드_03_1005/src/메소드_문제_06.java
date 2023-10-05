// => updown 게임
import java.util.Scanner;
public class 메소드_문제_06 {
	static int comInput()
	{
		int com=(int)(Math.random()*100)+1;
		return com;
	}
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		int user=scan.nextInt();
		return user;
	}
	static String check(int com, int user)
	{
		String res="";
		while(true)
		{
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
			break;
		 }
		}
		return res;
	}
	static void print(String res)
	{
		System.out.println(res);
	}
	static void process()
	{
		int com=comInput();
		while(true)
		{
			int user=userInput();
			String res=check(com,user);
			System.out.println(res);
			if(res.contains("Game"))
			{
				System.out.println("게임을 다시 할까요?(y|n):");
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
		// 컴퓨터가 숫자 추출
		int com=(int)(Math.random()*100)+1;
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("정수 입력(1~100):");
			int user=scan.nextInt();
			if(com>user)
			{
				System.out.println("입력된 값보다 큰 수를 입력하세요");
			}
			else if(com<user)
			{
				System.out.println("입력된 값보다 작은 수를 입력하세요");
			}
			else
			{
				System.out.println("Game Over!!");
				break;
			}
			
		}
	}

}

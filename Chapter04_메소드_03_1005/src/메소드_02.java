// 정수를 입력 => 0~32767 => 16bit => 2진법을 출력하는 메소드 작성
// 입력, 2진법, 출력 => 조립
import java.util.Scanner;

public class 메소드_02 {
	// 입력
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력(0~32767):");
		int num=scan.nextInt();
		return num;
	}
	// 2진법
	static int[] change(int num)
	{
		int[] binary=new int[16];
		int index=15;
		while(true)
		{
			binary[index]=num%2;
			num=num/2; //맨마지막에 num=0이면 종료
			if(num==0)
				break;
			index--;
		}
		return binary;
	}
	// 출력
	static void print(int[] binary)
	{
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print("");
			System.out.print(binary[i]);
		}
	}
	static void process()
	{
		int num=userInput();
		int[] arr=change(num);
		print(arr);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		//입력
		/*Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력(0~32767):");
		int num=scan.nextInt();
		//처리
		int[] binary=new int[16];
		int index=15;
		while(true)
		{
			binary[index]=num%2;
			num=num/2; //맨마지막에 num=0이면 종료
			if(num==0)
				break;
			index--;
		}
		//출력
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print("");
			System.out.println(binary[i]);
		}*/
	}

}

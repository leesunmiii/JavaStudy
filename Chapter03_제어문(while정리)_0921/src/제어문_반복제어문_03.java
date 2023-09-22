import java.util.Scanner;
public class 제어문_반복제어문_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// 메뉴 1 2 3 4 5 6 7 8 9번까지
		while(true)
		{
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu<1 || menu>9) // 없는 메뉴 선택
			{
				System.out.println("없는 메뉴 입니다");
				continue;
			}
			if(menu==9)
				//System.exit(0); => 프로그램 전체 종료 => System.out.println("프로그램 종료!!"); 수행 못함
				break; //=>while문만 종료 => System.out.println("프로그램 종료!!"); 수행 가능
			System.out.println(menu+"번 메뉴를 선택하셨습니다");
		}
		System.out.println("프로그램 종료!!");
	}

}

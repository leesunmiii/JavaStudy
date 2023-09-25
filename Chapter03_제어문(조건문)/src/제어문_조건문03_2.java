/*
 * 
 * 컴퓨터 VS 플레이어   => 가위바위보
 * --------------------------
 * => 다중 조건문 => 경우의 수 9개
 * 				-----------조건문
 * 
 * 		컴퓨터			플레이어
 * 		가위				가위
 * 						바위
 * 						보
 * 		바위				가위
 * 						바위
 * 						보
 * 		보				가위
 * 						바위
 * 						보
 * --------------------------------가정 0(가위), 1(바위), 2(보)
 * 			==> 중첩 if ==> 55page
 * 				------
 * 					로그인 상태
 * 				if (조건문) ==> 한 개의 조건문  ==> &&
 * 				{
 * 					if(조건문) // 관리자
 * 						{
 * 						
 * 						}
 * 					if(조건문) // 사용자
 * 						{
 * 
 * 						}
 *        		}
 * 					 else
 * 						{
 * 						Guest라면 
 * 						}
 * 
*/
import java.util.Scanner;
public class 제어문_조건문03_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com,user;
		com=(int)(Math.random()*3);  //0,1,2
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0),1(바위),2(보):");
		user=scan.nextInt();
		//가공
		System.out.print("컴퓨터:");
		if (com==0)
			System.out.println("가위");
		else if (com==1)
			System.out.println("바위");
		else if(com==2)
			System.out.println("보");
		// 다음 줄에 출력
		//System.out.println();
		
		System.out.print("사용자:");
		if (user==0)
			System.out.println("가위");
		else if (user==1)
			System.out.println("바위");
		else if(user==2)
			System.out.println("보");
		
		//결과값 출력
		
		
//		if(com==0) //컴퓨터가 "가위"일 경우
//		{
//			if(user==0)
//				System.out.println("비겼다!");
//			else if(user==1)
//				System.out.println("사용자 Win!");
//			else if(user==2)
//				System.out.println("컴퓨터 Win!");
//		}
//		else if(com==1) //컴퓨터가 "바위"일 경우
//		{
//			if(user==0)
//				System.out.println("컴퓨터 Win!");
//			else if(user==1)
//				System.out.println("비겼다!");
//			else if(user==2)
//				System.out.println("사용자 Win!");
//		}
//		else if(com==2)//컴퓨터가 "보"일 경우
//		{
//			if(user==0)
//				System.out.println("사용자 Win!");
//			else if(user==1)
//				System.out.println("컴퓨터 Win!");
//			else if(user==2)
//				System.out.println("비겼다!");
//		}
		// 경우의수2)))
		/*
		 * com-user
		 * com이 이기는 경우 ==> -2, 1
		 * user가 이기는 경우 ==> -1, 2
		 * 	com==0(가위)
		 * 			user==0(가위) => S => 0
		 * 			user==1(바위) =>	U => -1
		 *  	    user==2(보) =>	C => -2
		 * 	com==1(바위)
		 * 			user==0(가위) => C => 1
		 * 			user==1(바위) =>	S => 0
		 *  	    user==2(보) =>	U => -1
		 * 	com==2(보)
		 * 			user==0(가위) => U => 2
		 * 			user==1(바위) =>	C => 1
		 *  	    user==2(보) =>	S => 0 
		 * 
		 */
		
		int res=com-user;
		if(res==-2 || res==1)
		{
			System.out.println("컴퓨터 Win!!");
		}
		else if(res==-1 || res==2)
		{
			System.out.println("사용자 Win!!");
		}
		else
		{
			System.out.println("비겼다!!");
		}
		}
	}



// 증감연산자, 부정연산자, 형변환연산자
import java.util.Scanner;
// 1개의 정수를 입력 받아서 한 개를 증가한 값을 출력하시오.
/*
 * 
 * 	a++
 *  ++a
 *  a+=1
 *  a=a+1
 */
//많이 쓰이는 곳 : 반복문
public class 단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		a=scan.nextInt();
		*/
		
		//1개 증가
		// ++a;
		
		/*
		int b=a++;

		System.out.println("b="+b);
		System.out.println("a="+a);
		*/
		
		System.out.println("===== 부정연산자 =====");
		boolean bCheck=true;
		System.out.println("변경 전:"+bCheck);
		bCheck=!bCheck;
		System.out.println("변경 후:"+bCheck);
		/*
		boolean aa=true;
	
		while(true)
		{
			aa=!aa;
			if(aa==true)
			{
				System.out.println("사용자");
			}
			else
			{
				System.out.println("컴퓨터");
			}
		}*/
		
	}

}

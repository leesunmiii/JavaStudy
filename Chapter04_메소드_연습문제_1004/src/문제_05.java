// 1~n까지 합을 구하는 메소드 구현
// 리턴(x), 매개변수(o)
/*
 * 
 * 		메소드는 사용시에 => 호출
 * 		-------------------- main()은 컴파일러에 의해 자동 호출
 * 							-----------------------------
 * 								|  Callback 함수라고 한다
 * 		메소드
 * 		= Callback 함수 => main 함수 => 자동 호출되는 메소드 (시작점)
 * 		= 사용자 정의 : 프로그래머가 직접 제작
 * 		= 라이브러리 : 이미 제작된 메소드 => 만들지 못하는 프로그램
 * 			= 자바에서 제공
 * 			= 외부업체에서 지원 (Jsoup,Spring) = mvnreponsitory.com
 * 			= CBD => 조립식 프로그램
 * 			  ------------------ 메소드 호출이 많다
 * 		= 조립할 때, 재사용할 때 많이 사용, 유지보수가 편리하게 만든다
 * 		= 재사용
 * 		  메소드를 불러온다
 * 		  -------------
 * 								호출
 * 			int aaa() ===> int z=aaa()
 * 			double bbb() ===> double d=bbb()
 * 			void ccc() ===> ccc()
 * 			boolean ddd() ===> boolean b=ddd()
 * -------------------------------------------
 * 
 * 		class A
 * 		{
 *			int aaa(){}
 *	    }
 *		class B
 *		{
 *			main()
 *			{	
 *				A.aaa()  ==> 다른 클래스를 호출할 때 어디의 메소드인지 적어야함 A.ㅇㅇㅇ
 *			}                // 예) Math.random()
 *		} 	
 */
import java.util.Scanner;
public class 문제_05 {
	static void sum(int n)
	{
		int hap=0;
		for(int i=1;i<=n;i++)
		{
			hap+=i;
		}
		System.out.println("hap:"+hap);
	}
	
//	static void a()
//	{
//		int sum=0;
//		for(int i=1;i<=n;i++)
//		{
//			sum+=i;
//		}
//		System.out.println(sum);
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int num=scan.nextInt();
		
		sum(num);
//		a();
	}

}

/*
 *  단일 조건문은 true일 경우에 처리 => false는 건너뜀.
 *	선택 조건문
 */
public class 제어문_조건문02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		// 대문자, 소문자
//		if(c>='A' && c<='Z')
//		{
//			System.out.println(c+"는(은) 대문자입니다");
//		}
//		if(c>='a' && c<='z')
//		{
//			System.out.println(c+"는(은) 소문자입니다");
//		}
//		
		if(c>='A' && c<='Z')
		{
				System.out.println(c+"는(은) 대문자입니다");
		}
		else
		{
				System.out.println(c+"는(은) 소문자입니다");
		}
		//else문장은 독립적으로 사용 불가 => if 문과 같이 사용
		//else문장을 바로 위에 있는 if만 지원한다
		/*
		 * 
		 * if()
		 * {
		 * }
		 *-------------
		 *if()
		 * {
		 * }
		 *-------------
		 *if()
		 * {
		 * }
		 * else
		 * {
		 * }
		 *-------------
		 *
		
		 */
		int a=10;
		if(a%2==0)
		{
			System.out.println(a+"는(은) 짝수입니다!!");
			
		}
		else
		{
			System.out.println(a+"는(은) 홀수입니다!!");
		}
		}
	}



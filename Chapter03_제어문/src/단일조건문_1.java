/*
 * 	알파벳을 받아서 대문자, 소문자, 숫자, 다른문자
 */
import java.util.Scanner;
public class 단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//알파벳 받기
		System.out.println("알파벳 입력:");
		char ch=scan.next().charAt(0);
		/*
		 *  charAt의미 
		 * 	Hello Java
		 * 	0123456789
		 * 문장은 각 자리마다 번호가 있고 
		 * Hell'o'을 가지고 오고 싶으면 4를 입력하면 됨
		 * 
		 * charat(0)은 제일 첫번째 자리의 문자를 가져오겠다는 의미
		 * 
		 */
		if(ch>='A' && ch<='Z')
		{
			System.out.println(ch+"는(은) 대문자입니다");
		}
		//대문자
		if(ch>='a' && ch<='z')
		{
			System.out.println(ch+"는(은) 소문자입니다");
		}
		//소문자
		if(ch>='0' && ch<='9')
		{
			System.out.println(ch+"는(은) 숫자입니다");
		}
		//숫자
		if(!(ch>='0' && ch<='9'||ch>='a' && ch<='z'||ch>='A' && ch<='Z'))
		{
			System.out.println(ch+"기타 입니다");
		}
		//기타
	}

}

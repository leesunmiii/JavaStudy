// equals (==)
// 대소문자 구분 = equals , 대소문자 구분안함 = equalsIgnoreCase
import java.util.Scanner;
public class 문자열_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String MID="admin",MPWD="1234";
		Scanner scan=new Scanner(System.in);
		System.out.println("아이디 입력:");
		String id=scan.next();
		System.out.println("비밀번호 입력:");
		String pwd=scan.next();
		//대소문자 구분
		if(id.equalsIgnoreCase(MID) && pwd.equals(MPWD))
		{
			System.out.println(id+"님 로그인 되었습니다");
		}
		else
		{
			System.out.println("ID나 Password가 틀립니다");
		}
	}

}

// 리턴형(o), 매개변수 (x)
// => 아이디 찾기
import java.util.Scanner;
public class 메소드_02_아이디찾기 {
	static String idInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("ID 입력:");
		// *** String id=scan.next(); == return scan.next();
		return scan.next();
	}
	//아이디 중복체크
	static boolean idCheck(String id)
	{
		boolean bCheck=false;
		String[] ids= {"hong", "admin", "lee", "park", "shim"};
		for(String i:ids)
		{
			if(id.equals(i))
			{
				bCheck=true;
				break;
			}
		}
		return bCheck;
	}
	//모든 메소드를 조립하는 메소드 (기본)
	static void process()
	{
		String id=idInput();
		// 사용자가 입력한 값
		boolean bCheck=idCheck(id);
		
		if(bCheck)
			System.out.println(id+"는 이미 사용중인 아이디입니다");
		else
			System.out.println(id+"는 사용가능한 아이디입니다");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}

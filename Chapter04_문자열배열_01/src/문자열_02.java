/*
 * 사용자로부터 입력값(문자열) => 좌우대칭 여부 확인
 * ABBA => 문자 갯수 => length()
 */
import java.util.Scanner;
public class 문자열_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String msg=""; // 문자열은 "" 붙어있어도됨 ''은 붙어쓰면 안됨
		while(true)
		{
			System.out.print("문자열 입력:");
			msg=scan.next();
			if(msg.length()%2==0)
			{
				break;
			}
		}
		//좌우대칭 확인
		boolean bCheck=true;
		/*
		 * 		AB BA
		 * 		-   -
		 * 		 - -		
		 */
		int j=msg.length()-1; //변수를 안에 넣고싶으면 -i 붙여야함
		for(int i=0;i<msg.length()/2;i++)
		{
			//변수를 안에 넣고싶으면 int j=msg.length()-1-i;
			char c=msg.charAt(i);
			char c1=msg.charAt(j);
			System.out.println(c+","+c1);
			if(c!=c1)
			{
				bCheck=false;
				break;
			}
			j--;
		}
		if(bCheck==false)
		{
			System.out.println(msg+"는(은) 대칭구조가 아닙니다");
		}
		else
		{
			System.out.println(msg+"는(은) 좌우대칭 입니다");
		}
	}

}

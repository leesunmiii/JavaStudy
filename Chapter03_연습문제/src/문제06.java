import java.util.Random;

public class 문제06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=' ';
		int a=(int)(Math.random()*2);  //0,1
		
		if(a==0)
		{
			c=(char)((Math.random()*26)+65);
			//                     ---- 알파벳이 26개여서
		}
		if(a==1)
		{
			c=(char)((Math.random()*26)+97);
		}
		
		//System.out.println("c="+c);
		//대소문자 확인
		if(c>='A' && c<='Z')
		{
			System.out.println(c+"는(은) 대문자입니다");
		}
		if(c>='a' && c<='z')
		{
			System.out.println(c+"는(은) 소문자입니다");
		}
	}

}


import java.util.Scanner;
public class 문제07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char ch='z'
		//	boolean b=((ch>=97 && ch<=122)||(ch>=65 && ch<=90)?"true":"");
		
		Scanner scan=new Scanner(System.in);
		System.out.print("문자입력:");
		char ch=scan.next().charAt(0);
		System.out.println("ch="+ch);
		boolean b=((ch>='A' && ch<='Z') || ch>='a' && ch<='z' || ch>='0' && ch<='9'?true:false);
		System.out.println(b);
	}

}

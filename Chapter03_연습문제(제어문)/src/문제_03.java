import java.util.Scanner;
public class 문제_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int a=scan.nextInt();
		
		if(a<0)
			a=-a; //a*=-1; else도 함께
		// Math.abs() 활용가능
		System.out.println("a="+a);
	}

}

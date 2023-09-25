import java.util.Scanner;
public class 문제_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		char op=' ';
		System.out.println("정수 입력:");
		int num1=scan.nextInt();
		
		System.out.println("+,-,*,/ 입력:");
		op=scan.next().charAt(0);
				
		System.out.println("정수 입력:");
		int num2=scan.nextInt();
		
		switch(op)
		{
		case '+':
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
		case '-':
			System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
		case '*':
			System.out.println(num1+"*"+num2+"="+(num1*num2));
			break;
		case '/':
			if(num2==0)
			{
				System.out.println("0으로 나눌 수 없습니다");
			}
			else
			System.out.println(num1+"/"+num2+"="+(num1/num2));
			break;
		default:
			System.out.println("처리할 수 없는 연산자입니다");
			
		}
		
	}
}


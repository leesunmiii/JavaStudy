import java.util.Scanner;
public class 문제_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("달을 입력하세요(1~12)>>");
		int month=scan.nextInt();
		if(month>=3 && month<=5)
			System.out.println("봄");
		else if(month>=6 && month<=8)
			System.out.println("여름");
		else if(month>=9 && month<=11)
			System.out.println("가을");
		else if(month==12 || month==1 || month==2)
			System.out.println("겨울");
		else
			System.out.println("0~12 사이의 값을 입력하세요.");
		
		System.out.println("\n=============switch================");
		
		switch(month)
		{
		case 3,4,5:
			System.out.println("봄");
			break;
		case 6,7,8:
			System.out.println("여름");
			break;
		case 9,10,11:
			System.out.println("가을");
			break;
		case 1,12,2:
			System.out.println("겨울");
			break;
		
		}
		
	}

}

/*
 * 가위바위보 컴퓨터와 사용자가 뭘 냈는지
 * 
 */
import java.util.Scanner;
public class 배열_생성_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*3);//0,1,2
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2):");
		int user=scan.nextInt();
		//arr={1,2,3,4,5}  4를 400으로 바꾸고 싶으면  ===> arr[3]=400 (인덱스 번호가 3이니까)
		String[] res= {"가위","바위","보"};
		//             res[0] res[1] res[2]
		System.out.println("컴퓨터:"+res[com]);
		System.out.println("사용자:"+res[user]);
		
//		System.out.print("컴퓨터:");
//		if(com==0)
//			System.out.println("가위");
//		if(com==1)
//			System.out.println("바위");
//		if(com==2)
//			System.out.println("보");
//		
//		System.out.print("사용자:");
//		if(user==0)
//			System.out.println("가위");
//		if(user==1)
//			System.out.println("바위");
//		if(user==2)
//			System.out.println("보");
	}

}

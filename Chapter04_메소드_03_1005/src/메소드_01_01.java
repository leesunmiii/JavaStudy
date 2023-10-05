// 5자리 정수를 전송 => 거꾸로 출력 12345 => 54321

import java.util.Arrays;

public class 메소드_01_01 {
	//static int reverse (int num)
	static String reverse (int num)
	{
		String str=String.valueOf(num);
		String res="";
		for(int i=str.length()-1;i>=0;i--)
		{
			res+=str.charAt(i);
		}
		//return Integer.parseInt(res);
		return res;
	}
	static void process()
	{
		// 5개 정수 설정
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			 arr[i]=(int)(Math.random()*100)+1;
		}
		
		System.out.println(reverse(123));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}

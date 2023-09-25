/*
 * 	알파벳 ==> 문자열은 불가능
 * 			 ------------- 비교연산자를 사용할 수 없다
 * 			문자열은 compare() 사용 => 음수/양수/0
 * 			String s="H"
 * 			String s1="K"
 * 
 * 			s.compare(s1)
 * 			-		  --
 * 			H		   K  ==> -2 (양수면 왼쪽이 큰거/ 음수면 왼쪽이 작은거/0이면 같다)
 * 			D, F, D, S, Y => ASC / DESC
 * 			-- --
 * 			D  F
 * 			--	  --
 * 			D	   D
 * 			--		--
 * 			D      S	
 * 			--			--
 * 			D           Y
 * 			-----------------1 round
 * 			D F D S Y
 * 			  - -
 * 			  -   -
 * 			  -     -
 * 			-----------------2 round
 * 			D D F S Y
 * 			-----------------3 round
 * 			D D F S Y
 *    		-----------------4 round
 *    
 */

import java.util.Arrays;

public class 배열_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[10];
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)((Math.random()*26)+65);
		}
		System.out.println("===== 정렬 전 =====");
		System.out.println(Arrays.toString(alpha));
		
		System.out.println("===== 정렬 후(ASC) =====");
		for(int i=0;i<alpha.length;i++)
		{
			for(int j=i+1;j<alpha.length;j++)
			{
				if(alpha[i]>alpha[j])
				{
					char temp=alpha[i];
					alpha[i]=alpha[j];
					alpha[j]=temp;
				}
			}
			System.out.println((i+1)+"Round==>"+alpha[i]);
			System.out.println(Arrays.toString(alpha));
		}
		System.out.println(Arrays.toString(alpha));	
	}

}

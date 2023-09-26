/*
 *	40 30 10 50 20 ==> ASC
 *	-- --
 *	30 40
 *	   -- --
 *	   10 40	
 *		  -- --
 *		  40 50		
 *			 -- --
 *			 20 50 (고정) => 0번째 4바퀴
 *	---------------
 *	30 10 40 20 50
 *	-- --
 *	10 30
 *	   -- --
 *	   30 40
 *		  -- --
 *		  20 40 (고정) => 1번째 3바퀴
 *	---------------
 *	10 30 20 40	50
 *	-- --
 *	10 30
 *	   -- --
 *	   20 30 (고정) => 2번째 2바퀴
 *	---------------
 *	10 20 30 40 50
 *	-- --
 *	10 20          => 3번째 1바퀴
 *	---------------
 *	10 20 30 40 50
 *
 *	i	j
 *	0	4	=> i+j=4 ==> j=4(length-1)-i
 *	1	3
 *	2	2
 *	3	1
 *	4	0	 
 *	------------------------
 * 배열 => 같은 데이터형을 일정한 순서로 모아서 관리
 * 		  ----------  ----------
 * 						   |
 * 						인덱스 => 0번
 * 					=>  배열의 크기 : length
 * 					=>  출력 시에는 향상된 for
 * 					=> 	관련된 종류의 데이터 3개 이상인 경우
 * 					=> 선언 => 초기값
 * 							  -----
 * 								|
 * 							  1) 명시적
 * 							  2) new
 * 								 ---
 * 								  |
 * 								자동 초기화
 * 								int []= 0;
 * 								double[] =0.0	
 */
import java.util.*;
public class 배열_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		//초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("==== 정렬 전 ====");
		System.out.println();
		
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			System.out.println("==== "+(arr.length+1)+"Round ====");
			}
			System.out.println("==== 정렬 후 ====");
			System.out.println(Arrays.toString(arr));
		}
	}

}

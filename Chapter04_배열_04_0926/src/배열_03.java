/*
 * 코테에서 많이 나오는 것 : 알고리즘, 자료구조 ((Q.스택 구조를 만드시오, 버블정렬을 만드시오))
 * 	***알고리즘 : 정렬 ( 선택 정렬, 버블 정렬 )
 * 	***자료구조 : 데이터 관리 ( 추가 => 가지고 오기 )
 * 			 스택 (LIFO) 나중에 들어간게 먼저 나오는 (흔히 주차장같다함) / 큐 (FIFO) 먼저 들어간게 먼저 들어가는 / 데큐 (양방향)
 * 			 : 메모리      						                : 네트워크
 * 	 ----------------------------------------------------------------------
 * 	선택 정렬 => 한개를 선택해서 변경
 * 	버블 정렬 => 인접한 것끼리 변경
 * 
 * 		선택 정렬
 * 	  	30 10 20 50 40 ==> 10 20 30 40 50
 * 	  	-- -- 1번째 비교
 * 		10 30
 * 		--	  -- 2번째 비교
 * 		10	  20	
 * 		--       -- 3번째 비교
 * 		10       50
 * 		--			-- 4번째 비교
 * 		10			40
 *    	----------------- 1 round
 *      10 30 20 50 40	
 *         -- --
 *         20 30
 *         --    -- 
 *         30    50
 *         --       --
 *         30       40
 *       ------------------- 2 round
 *       10 20 30 50 40
 *       	   -- -- 
 *       	   30 50
 *       	   --	 --
 *             30    40
 *             -------------- 3 round
 *       10 20 30 50 40
 *       		  -- --
 *       		  40 50
 *       -------------------- 4 round
 *       10 20 30 40 50	  
 *       			 -- => arr.length-1
 *       
 *       버블 정렬 => 오른쪽에 정렬
 *       --------
 *       30 10 20 50 40
 *       -- --
 *       10 30 
 *          -- --
 *          20 30
 *             -- --
 *             30 50
 *                -- --
 *                40 50
 *       ---------------- 1 round
 *       10 20 30 40 50
 *                 
 * 
 */
import java.lang.reflect.Array;
import java.util.*;
public class 배열_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		// 초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;		
		}
		System.out.println("==== 정렬 전 ====");
		System.out.println(Arrays.toString(arr));
		
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println("==== "+(i+1)+" Round====");
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("==== 정렬 후 ====");
		System.out.println(Arrays.toString(arr));
	}

}

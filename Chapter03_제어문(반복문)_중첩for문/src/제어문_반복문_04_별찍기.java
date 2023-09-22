/*
 * 			★★★★★
 * 			★★★★★
 * 			★★★★★
 * 			★★★★★
 * 			
 */
public class 제어문_반복문_04_별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print("★");
//			}
//			System.out.println();
//		}
//======================================================
/*
*  ABCDE
*  FGHIJ
*  KLMNO
*  PQRST
*/
//		char c='A';
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print(c++);
//			}
//			System.out.println();
//		}
//   ==============================================
//		ABCDE
//		ABCDE
//		ABCDE
//		ABCDE		
		
		
//		for(int i=1;i<=4;i++)
//			{
//				for(char c='A';c<='E';c++)
//				{
//					System.out.print(c);
//				}
//				System.out.println();
//	        }
//		-----------------------------------------
/* 
* 			(위랑 같은 결과)
* 			for(int i=1;i<=4;i++)
*			{
*				char c='A';
*				for(int j=1;j<=5;j++)
*				{
*					System.out.print(c++);
*				}
*			System.out.println();
* 			}
* 
*/
//=========================================================		
//		★☆☆☆
//		☆★☆☆
//		☆☆★☆
//		☆☆☆★
		
		
		
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==j)
				{
					System.out.print("★");
				}
			else
				System.out.print("☆");
			}
			System.out.println();
		}

       }
    }

// break ==> while, for ==> System.exit(0)
public class 제어문_반복제어문_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  i=1 j=1 j=2 j=3
		 *  i=2 j=1 j=2 j=3
		 *  i=3 j=1 j=2 j=3  ==> 9번 돌아감
		 */
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					break;
				System.out.println("i="+i+",j="+j);
			}
		}
		System.out.println("============== continue ===============");
		/*
		 *  i=1 j=1,3
		 *  i=2 j=1,3
		 *  i=3 j=1,3
		 */
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					continue; // 증가식으로 이동
				System.out.println("i="+i+",j="+j);
			}
		}
		System.out.println(" ====== 이름있는 break ======");
		aaa:for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					break aaa;
				System.out.println("i="+i+",j="+j);
			}
		}
	}

}

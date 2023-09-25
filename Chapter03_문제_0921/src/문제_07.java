
public class 문제_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=0;
		while(true)
		{
			
			int a=(int)(Math.random()*6)+1;
			int b=(int)(Math.random()*6)+1;
			c++;
			System.out.println(a+" "+b);
			if(a==b)
			{
				break;
			}
//			if(a!=b)
//			{
//				c++;
//				continue;
//			}
//			else if(a==b)
//				break;
		}
		System.out.print("반복횟수:"+c);
	}

}

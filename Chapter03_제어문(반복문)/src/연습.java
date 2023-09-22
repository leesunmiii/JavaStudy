
public class 연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0,a5=0,a7=0;
		//int a=(int)((Math.random()*20)+1);//1~20
		for(int i=0;i<20;i++)
		{
			int rand=(int)(Math.random()*10)+1;
			System.out.println(rand+" ");
			if(rand%3==0)
				a3++;
			if(rand%5==0)
				a5++;
			if(rand%7==0)
				a7++;	
		}
		System.out.println("\n=============결과값===========");
		System.out.println("3의배수의 갯수:"+a3);
		System.out.println("5의배수의 갯수:"+a5);
		System.out.println("7의배수의 갯수:"+a7);
		
		System.out.println("================================");
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
		}
		System.out.println(sum);
		
		//BDFHJLN
		
		for(char c='B';c<='N';c+=2)
		{
			System.out.println(c+" ");
		}
		
		/*
		 *  for문 수행시에 -> 수열 (숫자마다 패턴을 가지고 있어야 반복문이 수행된다
		 *   1 2 3 4 5 6 7     8  9
		 *   2 4 6 8 10 12 14 16 18
		 *   11111222346661822 (x)
		 */
		
	}

}


public class 문제_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=========for=============");
		
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
				sum+=i;
		}
		System.out.println("1~100 중 짝수만의 합계:"+sum);
		
		
		System.out.println("\n=========while=============");
		
		sum=0;
		int i=1;
		while(i<=100)
		{
			if(i%2==0)
				{
				sum+=i;
				}
			i++;
		}
		System.out.println("1~100 중 짝수만의 합계:"+sum);
		
		
		System.out.println("\n=========do~while=============");
		
		sum=0;
		i=0;
		do {
			if(i%2==0)
			{
				sum+=i;
			}
				i++;
		}while(i<=100);
		System.out.println("1~100 중 짝수만의 합계:"+sum);
	}

}

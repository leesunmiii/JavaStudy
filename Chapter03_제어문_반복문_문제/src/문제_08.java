
public class 문제_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0,a7=0;
		for(int i=100;i<=999;i++)
		{
			if(i%7==0)
			{
				a7+=1; //a7++;
				sum+=i;
			}
		}
		System.out.println("7의 배수 갯수:"+a7);
		System.out.println("7의 배수 합:"+sum);
	}

}

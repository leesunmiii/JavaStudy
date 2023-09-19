
public class 문제_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,sum=0;
		for(int i=100;i<=999;i++)
		{
			if(i%4!=0)
			{
				num+=1;
				sum+=i;
			}
		}
		System.out.println("갯수:"+num);
		System.out.println("합:"+sum);
	}

}

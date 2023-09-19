
public class 문제_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<=100;i++) //for(int i=2;i<=100;i+=2)로 해도됨
		{
			if(i%2==0)
				sum+=i;
		}
		System.out.println("1~100까지 짝수의 합:"+sum);
	}

}

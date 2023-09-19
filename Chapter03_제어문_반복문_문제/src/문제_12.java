
public class 문제_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum7=0,sum9=0,sum79=0;
		for(int i=1;i<=1000;i++)
		{
			if(i%7==0)
				sum7+=i;
			if(i%9==0)
				sum9+=i;
		}
		sum79=sum7+sum9;
		System.out.println("7의 배수의 합:"+sum7);
		System.out.println("9의 배수의 합:"+sum9);
		System.out.println("7의 배수의 합:"+sum79);
	}

}

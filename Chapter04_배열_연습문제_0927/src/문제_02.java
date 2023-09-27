

public class 문제_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0,min=100;
		for(int i=0;i<=10;i++)
		{
			int num=(int)(Math.random()*100)+1;
			if(max<num)
				max=num;
			else if(min>num)
				min=num;
			System.out.print(num+" ");
		}
		System.out.println("\n최대값:"+max);
		System.out.println("최소값:"+min);
	}

}

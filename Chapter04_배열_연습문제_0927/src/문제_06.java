import java.util.Arrays;

public class 문제_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] num=new int [10];
		for(int i=0;i<num.length;i++)
		{
			num[i]=(int)((Math.random()*100)+1);
			sum+=num[i];
		}
		System.out.println(Arrays.toString(num));
		System.out.println("총합:"+sum);
		System.out.printf("평균:%.2f",sum/10.0);
	}

}

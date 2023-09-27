import java.util.Arrays;

public class 문제_04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		int[] num=new int[10];
		for(int i=0;i<num.length;i++)
		{
			num[i]=(int)(Math.random()*10);
			if(max<num[i])
				max=num[i];
		}
		System.out.println(Arrays.toString(num));
		System.out.println("첫번째 자리의 수:"+" "+num[1]);
		System.out.println("최대값:"+" "+max);
		System.out.println();
	} 
}

import java.util.Arrays;

public class 배열_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[10];
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)((Math.random()*26)+65);
		}
		System.out.println("==== 정렬 전 ====");
		System.out.println(Arrays.toString(alpha));
		System.out.println("==== 정렬 후 ====");
		for(int i=0;i<alpha.length-1;i++)
		{
			for(int j=0;i<alpha.leng-1-i;j++)
			{
				if(alpha[i]>alpha[j+1])
				{
					int temp=alpha[j];
					arr[j]=alpha[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}

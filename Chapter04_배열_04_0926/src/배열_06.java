import java.util.Arrays;

public class 배열_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[5];
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)((Math.random()*26)+65);
		}
		System.out.println("==== 정렬 전 ====");
		System.out.println(Arrays.toString(alpha));
		System.out.println("==== 정렬 후 ====");
		for(int i=0;i<alpha.length-1;i++)
		{
			for(int j=0;i<alpha.length-1-i;j++)
			{
				if(alpha[j]>alpha[j+1])
				{
					char temp=alpha[j];
					alpha[j]=alpha[j+1];
					alpha[j+1]=temp;
				}
			}
		}
	}

}

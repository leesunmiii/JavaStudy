import java.util.Arrays;
import java.util.Scanner;
public class 문제_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] kor=new int[5];
		for(int i=0;i<kor.length-1;i++)
		{
			System.out.println("국어점수:");
			kor[i]=scan.nextInt();
			for(int j=i+1;j<kor.length;j++)
				if(kor[i]>kor[j])
					{
						int temp=kor[j];
						kor[j]=kor[j];
						kor[j]=temp;
					}
		}
		System.out.println(Arrays.toString(kor));
		
	}

}

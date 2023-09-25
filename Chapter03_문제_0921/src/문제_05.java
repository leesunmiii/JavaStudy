
public class 문제_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i=1;i<=10;i++)
		{
			int a=(int)(Math.random()*10)+1;
			System.out.print(a+" ");
			sum+=a;
		}
		System.out.printf("\n평균:%.1f\n",sum/10.0);
		
//		int a=(int)(Math.random()*10)+1;
//		int b=(int)(Math.random()*10)+1;
//		int c=(int)(Math.random()*10)+1;
//		int d=(int)(Math.random()*10)+1;
//		int e=(int)(Math.random()*10)+1;
//		int f=(int)(Math.random()*10)+1;
//		int g=(int)(Math.random()*10)+1;
//		int h=(int)(Math.random()*10)+1;
//		int i=(int)(Math.random()*10)+1;
//		int j=(int)(Math.random()*10)+1;
//		
//		double avg=(a+b+c+d+e+f+g+h+i+j)/3.0;
//		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j);
//		System.out.printf("평균: %.2f",avg);
		
	}

}

// 3개 정수 (1~100) => 총합, 평균
public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		//			(0.0~0.99)*100 => 0.0~99.0
	   //           (0~99)+1 ==> 1~100
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		System.out.println("a="+a+"b="+b+"c"+c);
		
		int total=a+b+c;
		System.out.println("합계="+total);
		double avg=total/3.0;
		System.out.printf("평균:%.2f\n",avg);
		/*
		 * 실수 : %f   %.2f   %.3f   
		 * 정수 : %d
		 * 문자 : %c
		 * 문자열 : %s
		 */
		
		System.out.println("=======================");
		System.out.print("aaa");
		System.out.print("bbb");
	}

}

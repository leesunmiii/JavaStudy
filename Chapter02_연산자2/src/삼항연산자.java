
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=(int)(Math.random()*100)+1; // 1~100
		   System.out.println(a);
		   System.out.println(a%2==0?"짝수":"홀수");
		   
		*/
		
		// Q. sex=1,3 남자 sex=2,4 여자
		
		int a=(int)(Math.random()*4)+1;
		//          ----------------
		//            0.0~3.99
		//     -----
		//      0~3
		//                          ---
		//                          1~4
		System.out.println(a);
		System.out.println(a%2==0?"여자":"남자");

	}

}

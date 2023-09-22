
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=10;
		int b=9;
		
		boolean bCheck=a>b || ++b==a;
	    System.out.println(bCheck);
	    System.out.println(b); */
		
		int a=10;
		int b=21;
		
		boolean bCheck=(a%2==0) || (b%2!=0);
		/*
		 * 
		 * 		 조건  &&   조건
		 * 		true     true  => true
		 * 		true     false => false
		 * 		false	 true  => false
		 * 		false    false => false
		 * 
		 *       조건  ||   조건
		 * 		true     true  => true
		 * 		true     false => true
		 * 		false	 true  => true
		 * 		false    false => false
		 * 
		 */
		System.out.println(bCheck);
	    
	}

}

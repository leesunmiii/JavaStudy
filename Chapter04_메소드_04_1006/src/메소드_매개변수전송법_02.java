/*
 * 
 * 		
 */
public class 메소드_매개변수전송법_02 {
	static void swap(int a) // 복사본
	{
		a=100;
	}
	
	static void swap2(int[] arr)
	{
	System.out.println("arr="+arr);
		arr[0]=100;
	}
	// 배열 => 메모리 주소 이용
	// 기본형 => 실제 저장된 값 이용
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=10; // 원본 => Call By Value
		swap(b);
		System.out.println("b="+b); //변수는 메모리가 따로 생성되기 때문에 배열처럼 적용안됨
		
		/*
		 * int b=10;
		 * int a=b;
		 * a=100;
		 * 
		 */
		
		int[] kkk= {1,2,3};
		swap2(kkk);
		System.out.println("kkk="+kkk);
		System.out.println("kkk[0]="+kkk[0]);
		
	}

}

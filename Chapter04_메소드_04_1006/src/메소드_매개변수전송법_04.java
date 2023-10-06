
public class 메소드_매개변수전송법_04 {
	static void swap(int a, int b)
	// 새로운 메모리 생성
	{
		System.out.println("변경 전 => swap:a="+a+",b="+b);
		//10,20
		int temp=a;
		a=b;
		b=temp;
		System.out.println("변경 후 => swap:a="+a+",b="+b);
		//20,10
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		// 기본형은 => 복사(주소가 아닌 값만 복사해서 넘겨주는것 = Call By Value)
		// int a=10;, int b=20; 과 static void swap(int a, int b)의 변수(int a,int b)는 다른것
		System.out.println("변경 전 => main:a="+a+",b="+b);
		//10,20
		swap(a,b);
		System.out.println("변경 후 => main:a="+a+",b="+b);
		//10,20
	}

}
